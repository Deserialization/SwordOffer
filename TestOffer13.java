package cn.it.test2;

import javax.xml.transform.Templates;

public class TestOffer13 {
	public static Node deleteNode(Node head,Node delete){
		//特殊情况
		if (head == null || delete == null) {
			return head;
		}
		//删除的是头结点，则直接删除
		if (head == delete) {
			return head.next;
		}
		//删除的是尾节点 则遍历一遍找到上一个结点，然后在删除
		if (delete.next == null) {
			Node temp = head;
			while(temp.next != delete){
				temp = temp.next;
			}
			temp.next = null;
		}else{
			delete.value = delete.next.value;
			delete.next = delete.next.next;
		}
		
		return head;
	} 

}