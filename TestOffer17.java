package cn.it.test2;

public class TestOffer17 {

	public Node merge(Node node1,Node node2){
		if (node1 == null) {
			return node2;
		}
		if (node2 == null) {
			return node1;
		}
		Node head = null;
		if (node1.value <= node2.value) {
			head = node1;
			head.next = merge(node1.next, node2);
		}
		if (node1.value > node2.value) {
			head = node2;
			head.next = merge(node1, node2.next);
		}
		return head;		
	}
    public static void main(String[] args) {
        Node list1 = new Node(1);
         list1.next = new Node(3);
         list1.next.next = new Node(5);
         list1.next.next.next = new Node(7);
         // Node list2 = null;
         Node list2 = new Node(2);
         list2.next = new Node(2);
         list2.next.next = new Node(6);
         list2.next.next.next = new Node(8);
         TestOffer17 m = new TestOffer17();
         Node mergeList = m.merge(list1, list2);
         m.printList(mergeList);

 }

 void printList(Node mergeList) {
     while (mergeList != null) {
         System.out.print(mergeList.value + ",");
         mergeList = mergeList.next;
     }
 }

	
}