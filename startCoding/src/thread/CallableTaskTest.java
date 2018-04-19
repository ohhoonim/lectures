package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTaskTest {
	public static void main(String[] args) throws Exception {
		
		ExecutorService executor = Executors.newFixedThreadPool(
							Runtime.getRuntime().availableProcessors());
		
		Callable<String> task1 = new CallableTask("call task1", 173);
		Callable<String> task2 = new CallableTask("call task2", 563);
		
		Future<String> task1Result = executor.submit(task1);
		Future<String> task2Result = executor.submit(task2);
		
		String strResult1 = task1Result.get();
		String strResult2 = task2Result.get();
		
		System.out.println(strResult1);
		System.out.println(strResult2);
		
	}
}
