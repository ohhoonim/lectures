package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableThreadPoolTest2 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		Runnable[] tasks = {
				new RunnableTask("task1", 234),
				new RunnableTask("task2", 524),
				new RunnableTask("task3", 54),
				new RunnableTask("task4", 134),
				new RunnableTask("task5", 34),
				new RunnableTask("task6", 68),
				new RunnableTask("task7", 52),
				new RunnableTask("task8", 78),
		};
		
		for (Runnable task: tasks) {
			executor.execute(task);
		}
		
		executor.shutdown();
		
	}
}
