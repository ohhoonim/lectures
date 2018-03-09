package thread;

public class TaskFirst extends Thread {
	
	private int sleepTime = 1000;
	
	public TaskFirst(int sleepTime) {
		this.sleepTime = sleepTime;
	}
	
	// Thread 클래스를 상속받아서 Thread를 만드는 경우
	// run() 메소드를 override 해줘야 한다. 
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(getName() + " : " + i);
			try {
				Thread.sleep(this.sleepTime); // <= 작업도중에 일정시간동안 동작을 멈추게 해준다.
			} catch (InterruptedException e) {
				
			}
		}
	}
}
