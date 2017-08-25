package cn.it.test2;

import java.util.ArrayList;

public class TestOffer41_1 {
/*	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> qlist = new ArrayList<ArrayList<Integer>>();  
		if (sum < 3) {
			return qlist;
		}
		int small = 1;
		int big = 2;
		int currentSum = small + big;
		int middle = (1 + sum) / 2;
		while(small < middle){
			ArrayList<Integer> sq = new ArrayList<>();
			if (currentSum == sum) {
				for (int i = small; i <= big; i++) {
					//sq.add(i);
					System.out.println(sq.add(i));
				}
			}
			while(currentSum > sum && small < middle){
				currentSum -= small;
				small++;
				if (currentSum == sum) {
					for (int i = small; i <= big; i++) {
						
						System.out.println(sq.add(i));
					}
				}
			}
			if (sq.size() > 0) {
				qlist.add(sq);
				big++;
				currentSum += big;
			}
		}		
		return qlist;
	}*/
	
	public void findContinuesSequence(int sum) {
		if (sum < 3)
			return;
		int small = 1;
		int big = 2;
		int middle = (1 + sum) / 2;
		int curSum = small + big;
		while (small < middle) {
			if (curSum == sum) {
				printContineNum(small, big);
			}
			while (curSum > sum && small < middle) {
				curSum -= small;
				small++;
				if (curSum == sum)
					printContineNum(small, big);
			}
			big++;
			curSum += big;
		}
	}

	private void printContineNum(int small, int big) {
		for (int i = small; i <= big; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		TestOffer41_1 p=new TestOffer41_1();
		//int[] data={1,2,4,7,11,15};
		int sum=15;
		p.findContinuesSequence(sum);
		}
}