package cn.it.test2;

import java.util.ArrayDeque;
import java.util.Queue;

import javax.imageio.ImageTypeSpecifier;

/**
 * @author Administrator
 * 1.q1和q2在任一时刻至少有一个为空，即如果有元素，所以元素只在同一个队列中。 
   2.当有元素需要插入时，将插入的元素插入到空的队列中，并将另一非空队列的元素转移到该队列中，
               于是插入的元素添加到了队列头中。
 *
 */
public class TestOffer7_1 {

	Queue<Integer> queue1 = new ArrayDeque<>();
	Queue<Integer> queue2 = new ArrayDeque<>();
	public void push(int node) {
		if (queue1.isEmpty() && queue2.isEmpty()) {
			queue1.add(node);
			return;
		}
		if (queue1.isEmpty()) {
			queue2.add(node);
			return;
		}
		if (queue2.isEmpty()) {
			queue1.add(node);
			return;
		}
	}
	public int pop() {
		if (queue1.isEmpty() && queue2.isEmpty()) {
			try {
				throw new Exception("为空");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		if (queue1.isEmpty()) {
			while(queue2.size()>1){
				queue1.add(queue2.poll());
			}
			return queue2.poll();
		}
		if (queue2.isEmpty()) {
			while(queue1.size()>1){
				queue2.add(queue1.poll());
			}
			return queue1.poll();
		}
	return (Integer) null;
	}
    public static void main(String[] args) {
    	TestOffer7_1 demo08 = new TestOffer7_1();
        demo08.push(1);
        demo08.push(2);
        demo08.push(3);
        demo08.push(4);
        System.out.println(demo08.pop());
        System.out.println(demo08.pop());
        demo08.push(5);
        System.out.println(demo08.pop());
        System.out.println(demo08.pop());
        System.out.println(demo08.pop());
    }


}	


