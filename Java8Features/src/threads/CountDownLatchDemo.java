package threads;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    public static void main(String... s){
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Shall I start, type 'Start'");

    	String inputText = scanner.nextLine();
    	if(inputText.equalsIgnoreCase("Start")) {
    		
        final CountDownLatch cdl = new CountDownLatch(1);

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                int i = 5;
                while(i-- > 0)
                    System.out.println("I am from t1, t2  please wait for me");
                cdl.countDown();
            }
        });
        scanner.close();

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                	System.out.println("running t2");
                    cdl.await();
                    //t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("done");
            }
        });

        t2.start();
        t1.start();
    }
    }
}
