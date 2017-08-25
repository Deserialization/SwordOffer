package cn.it.test2;

public class TestOffer2 {
/*	private static final TestOffer2 instance = new TestOffer2();
	private TestOffer2(){};
	public static TestOffer2 getInstance() {
		return instance;
	}*/
	private static TestOffer2 instance = null;
	private TestOffer2() {
		
	}
	private static TestOffer2 instance(){
		if (instance == null) {
			instance = new TestOffer2();		
		}
		return instance;
	}
	

}
