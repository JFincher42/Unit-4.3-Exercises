
public class PrintArray {

	public static void main(String[] args) {
		int[] myArray = {17, -3, 42, 8, 16, -4, 9};
		int[][] my2DArray = {{ 4, 5, 6},{ 7, 8, 9},{ 1, 2, 3}};
		
		printArray(myArray);
		System.out.println();
		printArray(my2DArray);

	}
	
	public static void printArray(int[] list) {
		int length = list.length;
		System.out.print("[");
		for (int i=0; i<length-1; i++)
			System.out.print(list[i] + ", ");
		System.out.print(list[length-1] + "]");
	}

	public static void printArray(int[][] list) {
		int outerLength = list.length;
		System.out.print("[");
		for (int outer=0; outer<outerLength-1; outer++) {
			printArray(list[outer]);
			System.out.println(",");
		}
		printArray(list[outerLength-1]);
		System.out.print("]");
	}


}
