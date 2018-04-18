package thread;

public class ThreadTaskTest {
	public static void main(String[] args) {
		Thread task1 = new ThreadTask("first", 100);
		Thread task2 = new ThreadTask("second", 130);
		
		long start = System.nanoTime();
		
		// ����: thread�� ���鶧 run() �޼ҵ带 override������
		//      ������ ������ run() �޼ҵ带 ���� ȣ���ϴ� ���� �ƴ϶�
		//      .start() �޼ҵ带 ȣ���ؼ� ���������� run() �޼ҵ尡 ����ǰ� ���ؾ��Ѵ�. 
		//      task1.run();  <== �̷��� �ϸ� �ȵȴ�.
		task1.start();
		task2.start();
		
		long end = System.nanoTime();
		
		System.out.println("���۽ð� : " + start);
		System.out.println("����ð� : " + end);
		System.out.println("�ҿ�ð� : " + (end - start));
	}
}
