package cn.it.test2;

public class TestOffer36 {
    int cnt;
    public int InversePairs(int [] array) {
        cnt = 0;
        if (array != null)
            mergeSortUp2Down(array, 0, array.length - 1);
        return cnt;
    }

    public void mergeSortUp2Down(int[] a, int start, int end)
    {
        if (start >= end)
            return;
        int mid = (start + end) >> 1;
        mergeSortUp2Down(a, start, mid);
        mergeSortUp2Down(a, mid + 1, end);

        merge(a, start, mid, end);
    }

    public void merge(int[] a, int start, int mid, int end)
    {
        int[] tmp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end)
        {
            if (a[i] <= a[j])
                tmp[k++] = a[i++];
            else
            {
                tmp[k++] = a[j++];
                cnt += mid - i + 1;
                cnt%=1000000007;
            }
        }
        while (i <= mid)  //j先走完
            tmp[k++] = a[i++];
        while (j <= end)  //i先走完
            tmp[k++] = a[j++];
        for (k = 0; k < tmp.length; k++)
            a[start + k] = tmp[k]; //辅助数组重新将排序好的数组填回int[]a
    }
    public static void main(String[] args) {
        int[] array = new int[]{7,5,6,4};
        int count = new TestOffer36().InversePairs(array);
        System.out.println(count);
    }

}