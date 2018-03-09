package runnable;

public class TaskFirst implements Runnable {

	int sleepTime = 1000;
	String taskName ;
	
	public TaskFirst(String taskName, int sleepTime) {
		this.sleepTime = sleepTime;
		this.taskName = taskName;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(taskName + " : " + i);
			try {
				Thread.sleep(this.sleepTime); 
			} catch (InterruptedException e) {
				
			}
		}
		
	}
	
}
