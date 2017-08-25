package cn.it.test2;

public class TestOffer38 {

/*	public static int GetNumberofK(int []array,int k){
		int count=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==k) {
				count++;
			}		
		}	
		return count;
	}	
	public static void main(String[] args) {
		
        int[] array={1,3,3,3,3,4,4,4,5};  
        int k=4;  
        System.out.println(GetNumberofK(array,k));  
	}*/
	
	
	
    public int getNumberOfK(int [] array , int k) {
        if(array.length == 0) return 0;
        int start = getFirst(array,k,0,array.length-1);
        int end = getEnd(array,k,0,array.length-1);
        if(start>-1&&end>-1) return (end-start+1);
        return 0;
     }
     public int getFirst(int[] array, int k, int start, int end){
         if(start > end) return -1;
         int mid = (start+end)/2;
         if(array[mid] == k){
             if(mid>0&&array[mid-1]!=k || mid==0){
                 return mid;
             }else{
                 end = mid-1;
             }
         }else if(array[mid]>k){
             end = mid-1;
         }else{
             start = mid+1;
         }
         return getFirst(array,k,start,end);
     }
     public int getEnd(int[] array, int k, int start, int end){
         if(start > end) return -1;
         int mid = (start+end)/2;
         if(array[mid] == k){
             if(mid<end&&array[mid+1]!=k || mid == end){
                 return mid;
             }else{
                 start = mid+1;
             }
         }else if(array[mid] < k){
             start = mid+1;
         }else{
             end = mid-1;
         }
         return getEnd(array,k,start,end);
     }
     public static void main(String[] args) {
    	 TestOffer38 p=new TestOffer38();
         int[] array={1,2,3,3,3,3,4,5};
         System.out.println(p.getNumberOfK(array, 3));
         }


}