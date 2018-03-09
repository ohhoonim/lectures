package runnable;

public class Main {
	public static void main(String[] args) {
		// 스레드를 생성하는 방법 2
		// Runnable 인터페이스를 구현 클래스를
		// 스레드 생성시 생성자의 파라미터로 넘겨준다.
//		TaskFirst taskFirst = new TaskFirst("first thread", 1000);		
		/*
		Runnable taskFirst = new TaskFirst("first thread", 1000);		
		Thread firstThread = new Thread(taskFirst);
		
		firstThread.start();
		*/
		/*
		Thread firstThread = new Thread(new TaskFirst("first thread", 1000));
		firstThread.start();
		*/
		
		/* Runnable 을 익명 클래스로 작성해본다면...
		 */
		Runnable taskFirst = new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000); 
					} catch (InterruptedException e) {
						
					}
				}
			}
		};
		
		Thread firstThread = new Thread(taskFirst);
		firstThread.start();
		
		
	}
}














