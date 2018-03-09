package threadpool;

public class Task implements Runnable {

	int sleepTime = 1000;
	String taskName ;
	
	public Task(String taskName, int sleepTime) {
		this.sleepTime = sleepTime;
		this.taskName = taskName;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.println(this.taskName + " : " + i);
			try {
				Thread.sleep(this.sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
