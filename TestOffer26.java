package cn.it.test2;

public class TestOffer26 {


		public static void main(String[] args) {
			TestOffer26 testClone = new TestOffer26();
			ComplexListNode root = new ComplexListNode();
			ComplexListNode node1 = new ComplexListNode();
			ComplexListNode node2 = new ComplexListNode();
			ComplexListNode node3 = new ComplexListNode();
			ComplexListNode node4 = new ComplexListNode();
			root.data = 1;
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			root.data = 1;
			node1.data = 2;
			node2.data = 3;
			node3.data = 4;
			node4.data = 5;
			root.sibling = node1;
			node1.sibling = root;
			node3.sibling = node1;
			ComplexListNode result = testClone.clone(root);
			System.out.println(result.data);
		}

		public ComplexListNode clone(ComplexListNode head) {
			cloneNodes(head);
			connectSiblingNodes(head);
			return reconnectNodes(head);
		}

		public void cloneNodes(ComplexListNode head) {
			ComplexListNode node = head;
			while (node != null) {
				ComplexListNode cloneNode = new ComplexListNode();
				cloneNode.data = node.data;
				cloneNode.next = node.next;
				cloneNode.sibling = null;
				node.next = cloneNode;
				node = cloneNode.next;
			}
		}

		public void connectSiblingNodes(ComplexListNode head) {
			ComplexListNode node = head;
			while (node != null) {
				ComplexListNode clonedNode = node.next;
				if (node.sibling != null) {
					clonedNode.sibling = node.sibling.next;
				}
				node = clonedNode.next;
			}
		}

		public ComplexListNode reconnectNodes(ComplexListNode head) {
			ComplexListNode node = head;
			ComplexListNode clonedHead = null;
			ComplexListNode clonedNode = null;
			if (node != null) {
				clonedNode = node.next;
				clonedHead = clonedNode;
				node.next = clonedNode.next;
				node = node.next;
			}
			while (node != null) {
				clonedNode.next = node.next;
				clonedNode = clonedHead.next;
				node.next = clonedNode.next;
				node = node.next;
			}
			return clonedHead;
		}
}

