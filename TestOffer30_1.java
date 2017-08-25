package cn.it.test2;

public class TestOffer30_1 {
 
    // Ê¹ÓÃpartitionº¯Êı  
    public int partition(int[] arr, int left, int right) {  
        int result = arr[left];  
        if (left > right)  
            return -1;  
  
        while (left < right) {  
            while (left < right && arr[right] >= result) {  
                right--;  
            }  
            arr[left] = arr[right];  
            while (left < right && arr[left] < result) {  
                left++;  
            }  
            arr[right] = arr[left];  
        }  
        arr[left] = result;  
        return left;  
    }  
    public int[] getLeastNumbers(int[] input,int k){  
        if(input.length == 0 || k<= 0)  
            return null;  
        int[] output = new int[k];  
        int start = 0;  
        int end = input.length-1;  
        int index = partition(input,start,end);  
        while(index != k-1){  
            if(index > k-1){  
                end = index -1;  
                index = partition(input,start ,end);  
            }  
            else{  
                start = index+1;  
                index = partition(input,start ,end);  
            }  
        }  
        for(int i = 0;i<k;i++){  
            output[i] = input[i];  
        }  
        return output;  
    }  
    public static void main(String[] args){  
        int[] arr= {4,5,1,6,2,7,3,8};  
        TestOffer30_1 test = new TestOffer30_1();  
        int[] output=test.getLeastNumbers(arr, 4);  
        for(int i = 0;i<output.length ;i++){  
            System.out.print(output[i]+",");  
        }  
    }  
}  