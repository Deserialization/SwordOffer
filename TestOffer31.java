package cn.it.test2;

import java.util.Arrays;

public class TestOffer31 {

	public int FindGreatestSumOfSubArray(int[] array) {
		if (array == null || array.length == 0) {
			return 0;			
		}
		int sum = array[0];
		int tempSum = array[0];
		for (int i = 1; i < array.length; i++) {
			tempSum = (tempSum < 0) ? array[i] : array[i] + tempSum;
			sum =(tempSum > sum) ? tempSum : sum;
		}			
		return sum;		
	}
	public static void main(String[] args) {
		TestOffer31 p=new TestOffer31();
		int[] array={1,-2,3,10,-4,7,2,-5};
		System.out.println(p.FindGreatestSumOfSubArray(array));
		}
}
