package thread;

public class RunnableTask implements Runnable{
	
	private String taskName;
	private int sleepTime = 1000;
	
	public RunnableTask(String taskName, int sleepTime) {
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
