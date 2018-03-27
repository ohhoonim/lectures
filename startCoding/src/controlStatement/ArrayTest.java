package controlStatement;

public class ArrayTest {
	public static void main(String[] args) {
		// 배열 선언
		// 배열을 선언할 때는 반드시 배열의 길이(방의 갯수)를
		// 지정해주어야 한다. 
		int[] a = new int[10];
		
		// 배열에서의 방번호를 인덱스(index)라고 한다. 
		// index 는 0 부터 시작한다. 
		// 마지막 index 값은 '배열의 길이 - 1' 이다.
		a[0] = 10; 
		int temp = a[0];
		System.out.println(temp);
		
		a[4] = 34;
		System.out.println(a[4]);
		 
		//a[11] = 23;
		//System.out.println(a[11]);
		// <== 에러가 난다.
		// ArrayIndexOutOfBoundsException
		
		// 배열의 길이를 가져오기
		System.out.println( a.length );
		
		System.out.println("----------------");
		
		boolean[] hasMoney = new boolean[5];
		
		hasMoney[0] = true;
		hasMoney[1] = false;
		hasMoney[2] = false;
		hasMoney[3] = true;
		hasMoney[4] = false;
		
		if (hasMoney[1] && hasMoney[3]) {
			System.out.println("둘다 true");
		} else {
			System.out.println("둘다 true는 아니다.");
		}
		
		System.out.println("----------------");
		// 배열 생성시 초기값 넣어주기
		int[] arrNum = {12, 43, 56, 23, 67};
		System.out.println(arrNum.length);
		System.out.println(arrNum[3]); // 23
		
		arrNum[3] = 54;
		System.out.println(arrNum[3]); // 54
		// 배열의 각 인덱스에 들어있는 값은 변경할 수 있으나, 
		// 배열의 길이는 한번 정해지면 변경할 수 없다. 
		System.out.println("----------------");
		// 문제....
		// arrNum의 1번 인덱스와 3번 인덱스에 있는 값을 교환하시오.
		System.out.println(arrNum[1]); // <= 43
		System.out.println(arrNum[3]); // <= 54
		
		int tmp = arrNum[1];
		arrNum[1] = arrNum[3];
		arrNum[3] = tmp;
		
		System.out.println(arrNum[1]); // <= 54
		System.out.println(arrNum[3]); // <= 43
		
		// 다차원 배열 - 2차원 배열  까지만 살펴보겠습니다. 
		
		int[][] arr2d = {
				  {25, 65, 93, 15, 1}
				, {56, 35, 96}
				, {78, 45, 12, 23, 56}
				, {65, 98, 87, 54, 21}
		};
		
		System.out.println(arr2d[0][2]); // <== 93
		
		System.out.println(arr2d.length);    // <== 4
		System.out.println(arr2d[0].length); // <== 5
		
		System.out.println(arr2d[1].length); // <== 3
		// 하지만 2차원배열 사용시 배열의 길이를 다르게 설정하는 것은 권장되지 않는다.
		// 반복문을 사용할 때 ArrayIndexOutOfBoundsException 이 나타날
		// 가능성이 크기 때문이다. 
		
	}
}















