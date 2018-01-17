
public class Rotate {

	public static void main(String[] args) {
		int[][] myArray = {{1,2},{3,4},{5,6}};
		
		PrintArray.printArray(rotate(myArray));

	}

	public static int[][] rotate(int[][] arr){
		int aRows = arr.length;
		int aCols = arr[0].length;
		int[][] result = new int[aCols][aRows];
		for(int rows=0; rows<aRows; rows++)
			for(int cols=0; cols<aCols; cols++)
				result[cols][rows]=arr[rows][cols];
		return result;
	}
}
