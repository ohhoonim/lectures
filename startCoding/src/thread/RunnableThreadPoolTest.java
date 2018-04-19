package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableThreadPoolTest {
	public static void main(String[] args) {
		
		// 1. 스레드 풀 생성
		ExecutorService executor = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		// 2. 스레드 풀에 작업(스레드)을 등록하고 실행
		Runnable task1 = new RunnableTask("task1", 23);
		Runnable task2 = new RunnableTask("task2", 7);
		Runnable task3 = new RunnableTask("task3", 62);
		Runnable task4 = new RunnableTask("task4", 48);
		
//		Thread thread1 = new Thread(task1);  // <== 스레드풀을 사용하지 않는 경우
		
		executor.execute(task1);
		executor.execute(task2);
		executor.execute(task3);
		executor.execute(task4);
		
		// 3. 스레드풀 종료
		executor.shutdown();
		
	}
}
