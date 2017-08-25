package cn.it.test2;

import java.util.Arrays;


public class TestOffer44 {
	public boolean isCountious(int[] numbers){
		int numberZero = 0;
		int numberOfNumber = 0;
		if (numbers.length == 0) {
			return false;
		}
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == 0) {
				numberZero++;
				// 跳出本次循环，以免发生两个零认为是对子
				continue;
			}
			if (numbers[i] == numbers[i + 1]) {
				return false;
			}
			//3-2 在-1就说明本来就连续
			numberOfNumber += numbers[i + 1] - numbers[i] - 1;
		}
		return numberOfNumber <= numberZero ? true : false;
	}
	public static void main(String[] args) {
		int[] array={0,7,0,8,9};
		TestOffer44 test=new TestOffer44();
		System.out.println(test.isCountious(array));
		}
}