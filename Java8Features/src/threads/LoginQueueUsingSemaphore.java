package threads;

import static org.junit.Assert.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

import org.junit.Test;
/*
 * We can use semaphores to limit the number of concurrent threads accessing a specific resource.
 */

public class LoginQueueUsingSemaphore {
 
    private Semaphore semaphore;
    public LoginQueueUsingSemaphore(){
    	
    }
    public void setPermits(int slotLimit){
    	 semaphore = new Semaphore(slotLimit);
    }
  /*  public LoginQueueUsingSemaphore(int slotLimit) {
       
    }*/
 
    boolean tryLogin() {
        return semaphore.tryAcquire();
    }
 
    void logout() {
        semaphore.release();
    }
 
    int availableSlots() {
        return semaphore.availablePermits();
    }
    
    @Test
    public void givenLoginQueue_whenLogout_thenSlotsAvailable() {
        int slots = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(slots);
        LoginQueueUsingSemaphore loginQueue = new LoginQueueUsingSemaphore();
        loginQueue.setPermits(slots);
        IntStream.rangeClosed(0, slots)
          .forEach(user -> executorService.execute(loginQueue::tryLogin));
        executorService.shutdown();
        assertEquals(0, loginQueue.availableSlots());
        loginQueue.logout();
     
        assertTrue(loginQueue.availableSlots() > 0);
        assertTrue(loginQueue.tryLogin());
        assertTrue(loginQueue.availableSlots()==0);
        loginQueue.setPermits(1);
        assertTrue(loginQueue.availableSlots()==1);

        
    }
 
}
/*
 * https://www.baeldung.com/java-semaphore
 * */
