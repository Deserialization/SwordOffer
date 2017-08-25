package cn.it.test2;

public class TestOffer56 {
	public class Solution {

	    public Node EntryNodeOfLoop(Node pHead)
	    {
			if (pHead == null || pHead.next == null)
				return null;
			Node p1 = pHead;
			Node p2 = pHead;
			while (p2 != null && p2.next != null) {
				p1 = p1.next;
				p2 = p2.next.next;
				if (p1 == p2) {
					p1 = pHead;
					while (p1 != p2) {
						p1 = p1.next;
						p2 = p2.next;
					}
					if (p1 == p2)
						return p1;
				}
			}
			return null;
	    }
	}

}
