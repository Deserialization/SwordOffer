package cn.it.test2;

import java.util.ArrayList;
import java.util.List;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class TestOffer42 {
	public String ReverseSentence(String string) {
		if (string == null) {
			return string;
		}
		char[] cs = string.toCharArray();
		int begin = 0;
		int end = cs.length - 1;
		reverse(cs, begin, end);
		begin = end = 0;
		while(begin < cs.length){
			if (cs[begin] == ' ') {
				begin++;
				end++;
			}else if (end == cs.length || cs[end] == ' ') {
				reverse(cs, begin, --end);
				begin = ++end;
			}else {
				end++;
			}			
		}
		return new String(cs);
	}

	private void reverse(char[] string, int begin, int end) {
		// TODO Auto-generated method stub
		while(begin <= end){
			char temp = string[begin];
			string[begin] = string[end];
			string[end] = temp;
			begin++;
			end--;
		}
	}
    public static void main(String[] args) {
        String str = "hello world";
        TestOffer42 r = new TestOffer42();
        String s = r.ReverseSentence(str);
        System.out.println(s);
    }

}