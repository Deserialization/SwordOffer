package cn.it.test2;

import java.util.Arrays;
import java.util.Comparator;

public class TestOffer33 {
	public String printMinNumber(int[] number){
		if (number == null || number.length == 0) {
			return null;					
		}
		int len = number.length;
		String[] string = new String[len];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < string.length; i++) {
			string[i] = String.valueOf(number[i]);
		}
		Arrays.sort(string, new Comparator<String>(){
			@Override
			public int compare(String s1, String  s2){
				String c1 = s1 + s2;
				String c2 = s2 + s1;
				return c1.compareTo(c2);
			}
			
		});
		for (int i = 0; i < string.length; i++) {
			sb.append(string[i]);
		}
	
			
		return sb.toString();
		
	}
	public static void main(String[] args) {
		TestOffer33 test=new TestOffer33();
		int[] array={3,32,321};
		System.out.println(test.printMinNumber(array));
		}
	
}
