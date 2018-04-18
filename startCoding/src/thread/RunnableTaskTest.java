package thread;

public class RunnableTaskTest {
	public static void main(String[] args) {
		/*
		Runnable task1 = new RunnableTask("first", 100);
		Runnable task2 = new RunnableTask("second", 733);
		
		Thread firstThread = new Thread(task1);
		Thread secondThread = new Thread(task2);
		
		firstThread.start();
		secondThread.start();
		*/
		
		Thread firstThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("firstthread:" + i);
					try {
						Thread.sleep(231);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}
		} );
		
		Thread secondThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i = i + 3) {
					System.out.println("secondthread:" + i + "  // 3씩 증가중..");					
					try {
						Thread.sleep(514);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}
		});
		
		firstThread.start();
		secondThread.start();
		
		
	}
}











