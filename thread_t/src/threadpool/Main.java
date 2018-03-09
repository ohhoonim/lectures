package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		
		// 1. 스레드 풀 생성
		ExecutorService executor = Executors.newFixedThreadPool(
					Runtime.getRuntime().availableProcessors()
				);
		long start = System.nanoTime();
		// 2. 스레드 풀에 작업스레드를 등록하고 실행
		executor.execute(new Task("작업1조", 10)); //  200
		executor.execute(new Task("작업2조", 23)); //  460
		executor.execute(new Task("작업3조", 46)); //  920
		executor.execute(new Task("작업4조", 71)); // 1420
		                                           // 4초
		long end = System.nanoTime();
		System.out.println("소요시간 : " + (end - start) + " 초");
		
		// 3. 스레드 풀 종료
		executor.shutdown();       //<== 풀에 등록된 모든 스레드를 실행하고 종료
		// executor.shutdownNow(); //<== 강제종료
		
		
	}
}
