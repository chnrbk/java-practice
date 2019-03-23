package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadWithResultExample {
	static ExecutorService exec = Executors.newCachedThreadPool();

	public static void main(String... strings) {
		Future<String> result = exec.submit(new Worker<String>());
		try {
			System.out.println(result.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		exec.shutdown();
	}
}

class Worker<T> implements Callable<T> {
	@Override
	public T call() throws Exception {
		return (T) "result";
	}
}