package thread;

public class NonThreadTaskTest {
	public static void main(String[] args) {
		
		NonThreadTask task1 = new NonThreadTask("first", 100);
		NonThreadTask task2 = new NonThreadTask("second", 130);
		
		long start = System.nanoTime();
		
		task2.run();
		task1.run();
		
		long end = System.nanoTime();
		
		System.out.println("���۽ð� : " + start);
		System.out.println("����ð� : " + end);
		System.out.println("�ҿ�ð� : " + (end - start));
		
	}
}
