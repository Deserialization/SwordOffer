package cn.it.test2;

public class TestOffer29_1 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };
		TestOffer29_1 p = new TestOffer29_1();
		System.out.println(p.moreThanHalfNum(array));
	}

	private int moreThanHalfNum(int[] array) {
		// TODO Auto-generated method stub
		if (array.length <= 0) 
			return 0;					
		int start = 0;
		int length = array.length;
		int end = length - 1;
		int middle = length >> 1;
		int index = Partition(array, start, end);
		while(index != middle){
			if (index > middle) {
				index = Partition(array, start, index - 1);
			}else{
				index = Partition(array, index + 1, end);
			}
		}
		int result = array[middle];
		int times = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == result) {
				times++;
			}
		}	
		if (times * 2 < length) {
			System.out.println(times);
			return 0;
		} else {
			return result;
		}	
	}

	private int Partition(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		int flag = (array[start] + array[end]) >> 2;
		while(start < end){
			while(array[end] > flag){
				end--;
			}
			swap(array, start, end);
			while(array[start] <= flag){
				start++;
			}
			swap(array, start, end);
		}		
		return start;
	}
	public void swap(int[] array, int num1, int num2) {
		// TODO Auto-generated method stub
		int temp = array[num1];
		array[num1] = array[num2];
		array[num2] = temp;
	}
}