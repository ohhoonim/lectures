package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableThreadPoolTest {
	public static void main(String[] args) {
		
		// 1. ������ Ǯ ����
		ExecutorService executor = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		// 2. ������ Ǯ�� �۾�(������)�� ����ϰ� ����
		Runnable task1 = new RunnableTask("task1", 23);
		Runnable task2 = new RunnableTask("task2", 7);
		Runnable task3 = new RunnableTask("task3", 62);
		Runnable task4 = new RunnableTask("task4", 48);
		
//		Thread thread1 = new Thread(task1);  // <== ������Ǯ�� ������� �ʴ� ���
		
		executor.execute(task1);
		executor.execute(task2);
		executor.execute(task3);
		executor.execute(task4);
		
		// 3. ������Ǯ ����
		executor.shutdown();
		
	}
}
