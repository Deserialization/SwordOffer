package cn.it.test2;


public class TestOffer9 {

/*	public int fib(int n){
		int a = 0;
		int b = 1;
		int c = 0;
		if (n == 0) {
			return a;
		}
		if (n==1) {
			return b;
		}
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}*/
	public int fib(int n){
		int a = 1;
		int b = 2;
		int c = 4;
		int d = 0;
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		if (n == 3) {
			return 4;
		}
		for (int i = 4; i <= n; i++) {
			d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
		return d;
	}	


}	


