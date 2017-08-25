package cn.it.test2;

import java.util.ArrayList;

public class TestOffer41 {

	public ArrayList<Integer> FindNumberWithSum(int[] array, int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (array == null || array.length < 2) {
			return list;
		}
		int i = 0, j = array.length - 1;
		while(i < j){
			if (array[i] + array[j] == sum) {
				list.add(array[i]);
				list.add(array[j]);
			}else if (array[i] + array[j] > sum) {
				j--;
			}else{
				i++;
			}
		}
		return list;
	}	
}