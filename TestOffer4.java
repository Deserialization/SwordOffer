package cn.it.test2;


public class TestOffer4 {
	public static String fullSpace(StringBuffer stringBuffer){
		int numspace = 0;
		char[] ch = stringBuffer.toString().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				numspace++;
			}
		}
		char[] ch1 = new char[numspace * 2 + stringBuffer.length()];
		int len = numspace * 2 + stringBuffer.length() - 1;
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] != ' ') {
				ch1[len--] = ch[i];
			}else{
				ch1[len--] = '0';
				ch1[len--] = '2';
				ch1[len--] = '%';
			}
		}
		return String.valueOf(ch1);
	}
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("23 3 43");
		System.out.println(fullSpace(stringBuffer));
	}
}
