package cn.it.test2;

public class TestOffer16 {
	public Node reverseNode(Node head){
		Node pre = null;
		Node next = null;
		if (head == null) {
			return null;
		}
		while(head != null){
			next = head.next;
			if (next == null) {
				next = head; 
			}
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
	
    public static void main(String[] args) {
        Node head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node forth=new Node(4);
        head.next=second;
        second.next=third;
        third.next=forth;
        TestOffer16 test=new TestOffer16();
        Node resultNode=test.reverseNode(head);
        System.out.println(resultNode.value);
        }

}