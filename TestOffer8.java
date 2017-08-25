package cn.it.test2;


public class TestOffer8 {

	public static int minNum(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		if (array[0] <= array[array.length - 1]) {
			return array[0];
		}
		int begin = 0;
		int end = array.length - 1;
		int mid = (begin + (end - begin))>>2;
		int minValue = array[0];
		while(begin > end){
			if (array[begin] > array[mid]) {
				end = mid;
				minValue = Math.min(minValue, array[mid]);
			}else if (array[begin] < array[mid]) {
				begin = mid;
				minValue =Math.min(minValue, array[mid]);
			}else {
				for (int i = begin; i <= end; i++) {
					minValue = Math.min(minValue, array[i]);
				}
				break;
			}
			
		}
		
		return minValue;
	}
public static void main(String[] args) {
    int array[]={2,3,4,4};
    int FindMinNum=minNum(array);
    System.out.println(FindMinNum);
}

}	


