package cn.it.test2;


public class TestOffer10_1 {
	
	public int numberOf(int n, int m) {
		int x = n ^ m;	
		int count = 0;
	/*	while(x != 0){
			x &= x-1;
			count++;
		}*/
		int i;
		for (i = 0; x != 0; i++) {
			x = x & (x - 1);
		}
		return i;
	}

	public static void main(String[] args) {
		TestOffer10_1 test=new TestOffer10_1();
		System.out.println(test.numberOf(9,2));
	}
}	


