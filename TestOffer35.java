package cn.it.test2;
/*
import java.util.HashMap;
import java.util.Scanner;

public class TestOffer35 {

	static HashMap<Character, Integer> map = new HashMap<>();

	public static int First(String str) {
		if (str == null) {
			return -1;
		}
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if (map.containsKey(str.charAt(i))) {
				int value = map.get(str.charAt(i));			
				map.put(str.charAt(i), value + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		for (int i = 0; i < length; i++) {
			if (map.get(str.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			String str = scanner.next();
			System.out.println(First(str));
		}
	}
}
*/

public class TestOffer35 {
//ÈýÂ·¿ìÅÅ£º
	/*    public void sortColors(int[] nums) {
        int[] count = new int[3]; 
        for(int i = 0; i< nums.length; i++){
            count[nums[i]]++;
        }
        int index = 0;
        for(int i =0; i < count[0]; i++){
            nums[index++] = 0;
        }
        for(int i =0; i < count[1]; i++){
            nums[index++] = 1;
        }
        for(int i =0; i < count[2]; i++){
            nums[index++] = 2;
        }
    }*/
}