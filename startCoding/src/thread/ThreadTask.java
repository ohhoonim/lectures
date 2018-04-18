package thread;

public class ThreadTask extends Thread{
	private int sleepTime = 1000;
	private String taskName;
	
	public ThreadTask(String taskName, int sleepTime) {
		this.taskName = taskName;
		this.sleepTime = sleepTime;
	}
	@Override
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
