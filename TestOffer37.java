package cn.it.test2;

import java.util.List;

public class TestOffer37 {

	public Node FinFirstCommonNode(Node head1, Node head2){
		int pListLengthOf1 = 0;
		int pListLengthOf2 = 0;
		Node temp = head1;
		while(temp != null){
			pListLengthOf1++;
			temp = temp.next;
		}
		temp = head2;
		while(temp != null){
			pListLengthOf2++;
			temp = temp.next;
		}
		int pNodeDif = pListLengthOf1 - pListLengthOf2;
		Node pListNodeLong = head1;
		Node pListNodeShort = head2;
		if (pNodeDif < 0) {
			pListNodeLong = head2;
			pListNodeShort = head1;
			pNodeDif = pListLengthOf2 - pListLengthOf1;
		}
		for (int i = 0; i < pNodeDif; i++) {
			pListNodeLong = pListNodeLong.next;
		}
		while(pListNodeLong != null && pListNodeShort != null
				&& pListNodeLong.value != pListNodeShort.value){
			pListNodeLong = pListNodeLong.next;
			pListNodeShort = pListNodeShort.next;
		}
		Node pNode = pListNodeLong;
		return pNode;
	}

}