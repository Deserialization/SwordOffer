package cn.it.test2;



public class TestOffer51 {

	public boolean duplicate(int[] numbers, int length, int[] duplicate) {
		int temp;
		if (length <= 1) {
			return false;
		}
		for (int i = 0; i < length; i++) {
			while(numbers[i] != i){
				if (numbers[numbers[i]] != numbers[i]) {
					temp = numbers[numbers[i]];
					numbers[numbers[i]] = numbers[i];
					numbers[i] = temp;
				}else{
					duplicate[0] = numbers[i];
					return true;
				}
			}
		}
		return false;
	}
}