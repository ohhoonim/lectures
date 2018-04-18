package thread;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

	private String taskName;
	private int sleepTime = 1000;
	
	public CallableTask(String taskName, int sleepTime) {
		this.taskName = taskName;
		this.sleepTime = sleepTime;
	}
	
	@Override
	public String call() throws Exception {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.taskName + " : " + i);
			try {
				Thread.sleep(sleepTime);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return this.taskName + "의 작업이 끝났습니다.";
	}

}
