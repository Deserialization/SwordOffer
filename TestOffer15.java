package cn.it.test2;

public class TestOffer15 {
	public static Node FindToTile(Node head,int k) {
		//就是输入的链表头指针为null,那么整个链表也就是为空，所以此时倒数k个节点也就是位空。k=0，也是空，没有意义
		if (head == null || k <= 0) {
			return null;
		}
		Node aNode = head;
		Node bNode = null;
		//就是如果节点少于k，在for循 环中可能就会出现空指针异常。所以在for循环中就应该加一个if判断。
		for (int i = 0; i < k - 1; i++) {
			if (aNode.next != null) {
				aNode = aNode.next;
			}else{
				return null;
			}
		}
		bNode = head;
		while(aNode.next != null){
			aNode = aNode.next;
			bNode = bNode.next;
		}		
		return head;
	}
	public static void main(String[] args) {
		Node head=new Node(0);
		Node second=new Node(1);
		Node third=new Node(2);
		Node forth=new Node(3);
		head.next=second;
		second.next=third;
		third.next=forth;
		head.value=1;
		second.value=2;
		third.value=3;
		forth.value=4;
		TestOffer15 test=new TestOffer15();
		Node resultNode=test.FindToTile(head, 3);
		System.out.println(resultNode.value);
		}

}