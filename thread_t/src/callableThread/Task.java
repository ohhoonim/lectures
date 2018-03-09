package callableThread;

import java.util.concurrent.Callable;

public class Task implements Callable<Long>{

	int sleepTime = 1000;
	String taskName ;
	
	public Task(String taskName, int sleepTime) {
		this.taskName = taskName;
		this.sleepTime = sleepTime;
	}
	
	@Override
	public Long call() throws Exception {
		long start = System.nanoTime();
		for(int i = 0; i < 20; i++) {
			System.out.println(this.taskName + " : " + i);
			Thread.sleep(this.sleepTime);
		}		
		long end = System.nanoTime();
		
		return (end-start)/1000;
	}

}
