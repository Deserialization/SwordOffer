package cn.it.test2;

public class TestOffer40 {
	//这个表示的是数组中只有一个不重复的数字
	/*public static int find(int[] array){		
		int  res = 0;
		for (int i = 0; i < array.length; i++) {
			res = res ^ array[i];
		}
		return res; 
	}*/
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]){
		if (array == null || array.length < 2) {
			return;
		}
		int res = 0;
		for (int i = 0; i < array.length; i++) {
			res ^= array[i];
		}
		int rightFistIs1 = findFirstIndexis1(res);
		for (int i = 0; i < array.length; i++) {
			if (isBit1(array[i], rightFistIs1)) {
				num1[0] ^= array[i];
			}else{
				num2[0] ^= array[i];
			}
		}
	}

	private int findFirstIndexis1(int res) {
		// TODO Auto-generated method stub
		int index = 0;
		while(((res & 1) == 0) && index < 32){
			res = res >> 1;
			index++; 
		}
		return index;
	}

	private boolean isBit1(int num, int index) {
		// TODO Auto-generated method stub
		num = num >> index;
		return ((num & 1) == 1) ? true : false;		
	}
    public static void main(String[] args) {
        int[] array = new int[]{2,4,3,6,3,2,5,5};
        int[] num1 = new int[]{0};
        int[] num2 = new int[]{0};
        new TestOffer40().FindNumsAppearOnce(array, num1, num2);
        System.out.println(num1[0] + "," + num2[0]);
    }

}