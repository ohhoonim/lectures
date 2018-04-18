package thread;

public class NonThreadTask {
	
	private int sleepTime = 1000;
	private String taskName;
	
	public NonThreadTask(String taskName, int sleepTime) {
		this.taskName = taskName;
		this.sleepTime = sleepTime;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.taskName + " : " + i);
			try {
				Thread.sleep(sleepTime);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}
