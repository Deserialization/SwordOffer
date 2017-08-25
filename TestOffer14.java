package cn.it.test2;

public class TestOffer14 {
	public static void reOrderArray(int[] array) {
		int i = 0;
		int j = array.length - 1;
		if (array == null ||array.length == 0) {
			return;
		}
		while(i < j){//while不满足的时候就交换，满足就移动
			while(i < j && isEven(array[i])){
				i++;
			}
			while(i < j && isEven(array[j])){
				j--;
			}
			int temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}
	}

	static boolean isEven(int n) {

		return (n % 2 == 1);
	}
	public static void main(String args[]) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		TestOffer14 test = new TestOffer14();
		test.reOrderArray(array);
		for (int item : array)
			System.out.print(item);
	}

}