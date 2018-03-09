package basic_java;

import controlStatement.Like2Dimension;

public class ArrayMain {

	public static void main(String[] args) {
		// 2차원 배열을 1차원 배열로 표현하기
		int[][] arrNums = new int[3][6];

		arrNums[0][0] = 1;
		arrNums[0][1] = 23;
		arrNums[0][2] = 43;
		arrNums[0][3] = 3;
		arrNums[0][4] = 4;
		arrNums[0][5] = 5;

		arrNums[1][0] = 34;
		arrNums[1][1] = 3;
		arrNums[1][2] = 4;
		arrNums[1][3] = 5;
		arrNums[1][4] = 3;
		arrNums[1][5] = 4;

		arrNums[2][0] = 34;
		arrNums[2][1] = 34;
		arrNums[2][2] = 0;
		arrNums[2][3] = 5;
		arrNums[2][4] = 34;
		arrNums[2][5] = 2;

		Like2Dimension like2 = new Like2Dimension(arrNums);
		int rowIndex = 1;
		int rowSum = like2.rowSum(rowIndex);
		
		System.out.println(rowSum);
	}

}
