package thread;

public class Main {
	public static void main(String[] args) {
		
		// 첫번째 TaskFirst 실행
		Thread firstThread = new TaskFirst(1432);
		firstThread.start(); 
		// 스레드를 실행시킬 때는 run() 메소드가 아니라 
		// start() 메소드를 호출해야한다.
		
		// 두번째 TaskFirst 실행 
		Thread secondThread = new TaskFirst(467);
		secondThread.start();
		
		
	}
}
