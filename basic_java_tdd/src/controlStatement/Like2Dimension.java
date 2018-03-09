package controlStatement;

public class Like2Dimension {

	private int [] arrNums;
	private int colSize;
	private int rowSize;
	
	public Like2Dimension(int[][] arrNums) {
		this.translateArrNums(arrNums);
	}
	
	public int rowSum(int rowIdx) {
		int rowSum = 0;
		for(int col = 0; col < colSize; col++) {
			rowSum += this.arrNums[rowIdx * colSize + col];
		}
		return rowSum;
	}
	
	public int getCellValue(int rowIdx, int colIdx) {
		int idx = 0;
		idx = rowIdx * colSize + colIdx;
		return arrNums[idx];
	}
	
	private void translateArrNums(int[][] arrNums) {
		this.rowSize = arrNums.length;
		this.colSize = arrNums[0].length;
		
		int arrNumsSize = this.rowSize * this.colSize;
		this.arrNums = new int[arrNumsSize];
		
		for (int y = 0; y < this.rowSize; y++) {
			for (int x = 0; x < this.colSize; x++) {
				this.arrNums[y * this.colSize + x] = arrNums[y][x];
			}
		}
	}
}








