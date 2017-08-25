package cn.it.test2;

public class TestOffer17_1 {
	public static Node merge(Node node1,Node node2) {
		if (node1 == null) {
			return node2;
		}
		if (node2 == null) {
			return node1;
		}
		Node head = null;
		Node current = null;
		while(node1 != null && node2 != null){
			if (node1.value <= node2.value) {				
				if (head == null) {
					head = current = node1;
				}else{
					current.next = node1;
					current = current.next;
				}			
			node1 = node1.next;
			}
			else{
				if (head == null) {
					head =current = node2;
				}else{
					current.next = node2;
					current = current.next;
				}
			}
			node2 = node2.next;
		}
		if (node1 == null) {
			current.next = node2;
		}else{
			current.next = node1;
		}
		return head;
	}
}