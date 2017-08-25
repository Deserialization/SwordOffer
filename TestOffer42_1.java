package cn.it.test2;

import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.List;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class TestOffer42_1 {
    public String leftRotateString(String string,int n){
        int len = string.length();
        if (len == 0) {
            return "";
        }
        n = n % len;
        string += string;
        return string.substring(n, len + n);
    }
    public String leftRotateString1(String string,int n){
    	char[] chars = string.toCharArray();
    	if (chars.length < n) {
			return " ";
		}
    	reverse(chars, 0, n - 1);
    	reverse(chars, n, chars.length - 1);
    	reverse(chars, 0, chars.length - 1);
        StringBuilder sb = new StringBuilder(chars.length);
        for (char c : chars) {
			sb.append(c);
		}
    	return sb.toString();
    }
    private void reverse(char[] chars, int i, int j) {
		// TODO Auto-generated method stub
    	char temp ;
    	while(i < j){
    		temp = chars[i];
    		chars[i] = chars[j];
    		chars[j] = temp;
    		i++;
    		j--;
    	}
	}
	public static void main(String[] args) {
    	TestOffer42_1 p=new TestOffer42_1();
        String string="student";
        //p.leftRotateString(string,2);
        System.out.println(p.leftRotateString1(string,2));
        }


}