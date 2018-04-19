package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTaskTest2 {
	public static void main(String[] args) throws Exception {
		
		ExecutorService executor = Executors.newFixedThreadPool(
					Runtime.getRuntime().availableProcessors());
		
		List<Callable<String>> callableList = new ArrayList<Callable<String>>();
		callableList.add(new CallableTask("task1", 65));
		callableList.add(new CallableTask("task2", 128));
		callableList.add(new CallableTask("task3", 32));
		callableList.add(new CallableTask("task4", 75));
		callableList.add(new CallableTask("task5", 235));
		callableList.add(new CallableTask("task6", 98));
		callableList.add(new CallableTask("task7", 23));
		
		List<Future<String>> futureList = executor.invokeAll(callableList);
		
		for (Future<String> future: futureList) {
			System.out.println(future.get());
		}
		
		executor.shutdown();
	}
}







