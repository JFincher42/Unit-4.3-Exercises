import java.util.Arrays;

public class RowsAndCols {

	public static void main(String[] args) {
		int[][] nums = {
				{2,8,1,6},
				{1,6,5,3},
				{3,2,6,4},
				{2,9,7,2},
				{9,3,1,5}
		};
		
		System.out.println("Rows = " + nums.length);
		System.out.println("Cols = " + nums[0].length);

		System.out.println("nums[0][2]                = " + nums[0][2]);
		System.out.println("nums                      = " + nums);
		System.out.println("Arrays.toString(num[3])   = " + Arrays.toString(nums[3]));
		System.out.println("Arrays.toString(nums)     = " + Arrays.toString(nums));
		System.out.println("Arrays.deepToString(nums) = " + Arrays.deepToString(nums));
	}

}
