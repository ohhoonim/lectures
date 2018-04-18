package thread;

public class ThreadTaskTest {
	public static void main(String[] args) {
		Thread task1 = new ThreadTask("first", 100);
		Thread task2 = new ThreadTask("second", 130);
		
		long start = System.nanoTime();
		
		// 주의: thread를 만들때 run() 메소드를 override했지만
		//      실행할 때에는 run() 메소드를 직접 호출하는 것이 아니라
		//      .start() 메소드를 호출해서 간접적으로 run() 메소드가 실행되게 끔해야한다. 
		//      task1.run();  <== 이렇게 하면 안된다.
		task1.start();
		task2.start();
		
		long end = System.nanoTime();
		
		System.out.println("시작시간 : " + start);
		System.out.println("종료시간 : " + end);
		System.out.println("소요시간 : " + (end - start));
	}
}
