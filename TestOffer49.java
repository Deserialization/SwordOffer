package cn.it.test2;

import java.util.Arrays;


public class TestOffer49 {
	public int StrToInt(String string){
		int result = 0;
		if (string == null || string.isEmpty()) {
			return 0;			
		}
		int i = 0;
		if (string.charAt(0) == '+' || string.charAt(0) == '-') {
			i = 1;
		}
		for (; i < string.length(); i++) {
			char c = string.charAt(i);
			if (c <= '9' && c >= '0') {
				int j = c - '0';
				result = result * 10 + j;
			}else{
				return 0;
			}
		}
		if (string.charAt(0)=='-') {
			result = - result;
		}
		return result;
	}
    public static void main(String[] args) {
    	TestOffer49 p_Test_49 = new TestOffer49();
        System.out.println(p_Test_49.StrToInt("10"));
    }

}