package cn.it.test2;

import java.util.Arrays;


public class TestOffer46 {
	//就是与短路的性质终止递归，
	public int sumOfSum(int n){
		int sum = n;
		boolean ans = (n > 0) && (sum += sumOfSum(n - 1)) > 0;
		return sum;
	}
	public int sumOfSum1(int n){
		int sum = (int )(Math.pow(n, 2) + n);
		return sum >> 1;
	}
    public static void main(String[] args) {
    	TestOffer46 p_Test_46 = new TestOffer46();
        System.out.println(p_Test_46.sumOfSum1(10));
    }

}