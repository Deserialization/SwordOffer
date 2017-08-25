package cn.it.test2;

public class TestOffer57 {

	public Node deleteDuplication(Node pHead) {

		if (pHead == null)
			return null;
		Node p = pHead;
		Node n = new Node(0);
		Node pre = n;
		n.next = pHead;
		boolean flag = false;
		while (p != null) {
			Node q = p.next;
			if (q == null)
				break;
			if (q.value == p.value) {
				while (q != null && q.value == p.value) {
					q = q.next;
				}
				pre.next = q;
				p = q;
			} else {
				if (!flag) {
					n.next = p;
					flag = true;
				}
				pre = p;
				p = q;
			}
		}
		return n.next;
	}
}

