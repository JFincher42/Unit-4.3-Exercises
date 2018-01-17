
public class MatrixMult {

	public static void main(String[] args) {
		int[][] array1 = {{1,2,3},{3,4,5},{5,6,7}};
		int[][] array2 = {{1,3},{5,7},{9,11}};
		
		PrintArray.printArray(mult(array1, array2));
	}
	
	
	
	
	
	public static int[][] mult(int[][] a1, int[][] a2){
		int a1Rows = a1.length;
		int a2Rows = a2.length;
		int a1Cols = a1[0].length;
		int a2Cols = a2[0].length;
		if (a1Cols != a2Rows)
			return null;
		
		int[][] result = new int[a1Rows][a2Cols];
		for (int i=0; i<a1Rows; i++) {
			for (int j=0; j<a2Cols; j++) {
				for (int x=0; x<a1Cols; x++) {
					result[i][j] += a1[i][x]*a2[x][j];
				}
			}
		}
		return result;
	}
		

}
