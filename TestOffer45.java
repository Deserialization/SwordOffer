package cn.it.test2;

import java.util.Arrays;


public class TestOffer45 {
	//�ڵ�n��ʾ����n���ڵ㣬m��ʾ���ǵ�m��ɾ���Ľڵ�
	public int LastRemaining(int n, int m){
		if (n == 0|| m == 0) {
			return -1;			
		}
		int s = 0;
		for (int i = 2; i < n; i++) {
			s = (s + m) % i;
		}
		return s;
	}
}