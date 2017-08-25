package cn.it.test2;

import java.time.OffsetTime;
import java.util.Arrays;

public class TestOffer32 {
	public static void main(String[] args) {
		TestOffer32 p = new TestOffer32();
		System.out.println(p.countOne(123));
	}

	public long countOne(long n) {
		long count = 0;
		long i = 1;
		long current = 0, after = 0, before = 0;
		while ((n / i) != 0) {
			current = (n / i) % 10; // 当前位数字
			before = n / (i * 10); // 高位数字
			after = n - (n / i) * i; // 低位数字
			if (current > 1)
				count = count + (before + 1) * i;
			else if (current == 0)
				count = count + before * i;
			else if (current == 1)
				count = count + before * i + after + 1;
			i = i * 10;
		}
		return count;
	}
}
