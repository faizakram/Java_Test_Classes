package com.st.LinkedList;

public class SingleLinkList {

	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void printAll() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void delteNode(int i) {
		Node temp = head;
		Node prev = null;
		if (temp == null)
			return;

		if (temp == head && temp.data == i) {
			head = temp.next;
			temp = temp.next;
			prev = head;
		}

		while (temp != null) {
			if (temp.data == i && temp == prev) {
				head = temp.next;
				prev = head;
			}
			else if(temp.data == i)
				prev.next = temp.next;
			else if (temp.data != i)
				prev = temp;

			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		SingleLinkList single = new SingleLinkList();
		single.head = new Node(11);
		single.head.next = new Node(11);
		single.head.next.next = new Node(11);
		single.head.next.next.next = new Node(11);
		single.head.next.next.next.next = new Node(1);
		single.delteNode(11);
		single.printAll();
	}

}
