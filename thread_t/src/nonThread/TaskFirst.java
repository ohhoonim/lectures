package nonThread;

public class TaskFirst {
	
	int sleepTime = 1000;
	String taskName ;
	
	public TaskFirst(String taskName, int sleepTime) {
		this.taskName = taskName;
		this.sleepTime = sleepTime;
	}
	
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(this.taskName + " : " + i);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {

			}
		}
	}
	
}
