package cn.it.test2;


public class TestOffer29 {
	public int MoreThanHalfNum_Solution(int[] array) {
		//遍历每个元素并记录次数，若与之前保存的元素相同，则次数加一，否则减一，
		int count = 0;
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			if (temp == array[i])
				count++;
			else if (count > 0)
				count--;
			else {
				temp = array[i];
				count = 1;
			}
		}

		count = 0;
		for (int i = 0; i < array.length; i++) {
			if (temp == array[i])
				count++;
			System.out.println(count + "----");
		}
		return count > array.length / 2 ? temp : 0;
	}
	public static void main(String[] args) {
		int[] array={1,2,3,2,2,2,5,4,2};
		TestOffer29 p=new TestOffer29();
		System.out.println(p.MoreThanHalfNum_Solution(array));
		}
}
