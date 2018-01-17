
public class ShiftArray {

	public static void main(String[] args) {
		int[] newArray = {11,12,13,14,15};
		shiftArray(newArray, 27);
		PrintArray.printArray(newArray);

	}

	public static void shiftArray(int[] arr, int num) {
		int len = arr.length;
		for (int i=len-1; i>0; i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=num;
	}
}
