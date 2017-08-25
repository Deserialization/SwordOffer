package cn.it.test2;

import java.util.Arrays;
import java.util.Comparator;

public class TestOffer34 {
	public static void main(String[] args) {
		TestOffer34 p=new TestOffer34();
		System.out.println(p.GetUglyNumber(3));
		}
	public int GetUglyNumber(int n) {
		if (n < 0) 
			return 0;		
		int[] uglyArray = new int[n];
		uglyArray[0] = 1;
		int multply2 = 1;
		int multply3 = 1;
		int multply5 = 1;
		for (int i = 1; i < uglyArray.length; i++) {
			int min = min(multply2 * 2, multply3 * 3, multply5 * 5);
			uglyArray[i] =min;
			while(multply2 * 2 <= min)
				multply2++;
			while(multply3 * 3 <= min)
				multply3++;
			while(multply5 * 5 <= min)
				multply5++;
			
		}
		
		return uglyArray[n - 1];
	}
	//求三个数最小值
	private int min(int i, int j, int k) {
		int min = (i < j) ? i : j;
		return (min < k) ? min : k;
	}

}
