package cn.it.test2;


public class TestOffer10 {
	public int numberOf(int n) {
		int count = 0;
		while(n != 0){
			n &= n-1;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		TestOffer10 test=new TestOffer10();
		System.out.println(test.numberOf(9));
		
	}

}	


