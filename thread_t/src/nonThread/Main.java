package nonThread;

public class Main {
	public static void main(String[] args) {
		
		TaskFirst cloneFirstTask = new TaskFirst("첫번째 작업", 1237);
		TaskFirst cloneSecondTask = new TaskFirst("두번째 작업", 123);
		
		cloneFirstTask.run();
		cloneSecondTask.run();	
		
	}
}
