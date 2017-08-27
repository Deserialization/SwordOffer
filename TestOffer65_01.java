package cn.it.test2;

import java.util.Arrays;
import java.util.LinkedList;

public class TestOffer65_01 {

	public static void main(String[] args) {
		TestOffer65_01 test = new TestOffer65_01() ;  
        int []arr = {4 ,3 ,5 ,4 ,3 ,3 ,6 ,7} ;  
        int w = 3 ;  
        int []res =  test.getMaxWindow(arr, w) ;  
        System.out.println(Arrays.toString(res));
	}
	public int[] getMaxWindow(int[] array, int w){
		if (array == null || w < 1 || array.length < w) {
			return null;
		}
		LinkedList<Integer> qmax = new LinkedList<Integer>();
		int[] res = new int[array.length - w + 1];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			while(!qmax.isEmpty() && array[qmax.peekLast()] <= array[i]){
				qmax.pollLast();//弹出队尾元素的下标
			}
			qmax.addLast(i);//放入队尾下标
			if (qmax.peekFirst() == i - w) {//队头取值但不移除
				qmax.pollFirst();//弹出过期元素
			}
			if (i > w - 1) {
				//从 w -1 位开始保存窗口最大值 
				res[index++] = array[qmax.peekFirst()];
			}
			
		}
		return res;
	}
}
