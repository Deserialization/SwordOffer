package cn.it.test2;

public class TestOffer3 {
	public static boolean Find(int[][] array,int target){
		int row = 0;
		int col = array[0].length - 1;
		while(row <= array.length - 1 && col >= 0){
			if (target == array[row][col]) {
				return true;
			}else if (target >= array[row][col]) {
				row++;
			}else {
				col--;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] testarray=new int[4][4];
		testarray[0][0]=1;
		testarray[0][1]=2;
		testarray[0][2]=8;
		testarray[0][3]=9;
		testarray[1][0]=2;
		testarray[1][1]=4;
		testarray[1][2]=9;
		testarray[1][3]=12;
		testarray[2][0]=4;
		testarray[2][1]=7;
		testarray[2][2]=10;
		testarray[2][3]=13;
		testarray[3][0]=6;
		testarray[3][1]=8;
		testarray[3][2]=11;
		testarray[3][3]=15;
		System.out.println(Find(testarray, 11));
	}
}
