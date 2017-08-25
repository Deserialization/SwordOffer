package cn.it.test2;


public class TestOffer11_1 {
	public static double Power(double base,double exponent) {
		double result = base;
		double n = exponent;
		if (n < 0) {
			exponent = -exponent;
		}else if (n == 0) {
			return 1;
		}else{
			for (int i = 1; i < n; i++) {
				result *= base;
			}
		}
		return n < 0 ? 1 / result : result;
	}
}	


