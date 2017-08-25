package cn.it.test2;

import java.util.Arrays;


public class TestOffer47 {
	public int add(int num1, int num2){
		do {
			int sum = num1 ^ num2;
			int carry = (num1 & num2) << 1;
			num1 = sum;
			num2 = carry;
			
		} while (num2 != 0);
		return num1;
	}
    public static void main(String[] args) {
    	TestOffer47 p_Test_47 = new TestOffer47();
        System.out.println(p_Test_47.add(10,12));
    }

}