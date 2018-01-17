
public class CountSum {

	public static void main(String[] args) {
		int[][] counts = { {13, 11,  9},
				{ 9,  7, 12},
				{11,  5, 10},
				{10, 10,  5},
				{ 8,  7,  9},
				{ 8,  6,  5},
				{ 4,  8,  5}
		};
		
		System.out.println("sum of counts = " + sum(counts));

	}
	
	public static int sum(int[][] list) {
		int returnsum=0;
		for(int row=0; row<list.length; row++) {
			for (int col=0; col<list[0].length; col++) {
				returnsum+=list[row][col];
			}
		}
		return returnsum;
	}

}
