package cn.it.test2;

import java.util.Scanner;

public class TestOffer28 {
	public static void perm(char[] buf, int start, int end){
		if (start == end) {
			for (int i = 0; i <= end; i++) {
				System.out.print(buf[i]);			
			}
			System.out.println();			
		}else{
			for (int i = start; i <= end; i++) {
				char temp = buf[start];
				buf[start] = buf[i];
				buf[i] = temp;
				perm(buf, start + 1, end);
				temp = buf[start];
				buf[start] = buf[i];
				buf[i] = temp;
			}
		}
	}
    public static void main(String[] args){
	    char[ ] buf=new char[10];
	    Scanner scanner=new Scanner(System.in);
	    buf=scanner.next().toCharArray();
	    perm(buf, 0, buf.length-1);
    }


}

