package com.st.LinkedList;

public class LinkedList2 {

	/*Node head; // head of list

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		} // Constructor
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();

		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(20);
		llist.head.next = second;
		second.next = third;
		third.next = fourth;
		llist.printList();
		// llist.delete(1);
		System.out.println("===========");
		//llist.delete(23);
		llist.deleteHead();
		llist.printList();
	}

	private void delete(int value) {
		Node temp = head;
		Node prev = null;
		
		if (temp != null && temp.data == value) {
			head = temp.next; // Changed head
			return;
		}
		
		while (temp != null && temp.data != value) {
			prev = temp;
			temp = temp.next;
		}
		
		// If key was not present in linked list
		if (temp == null)
			return;
		
		// Unlink the node from linked list
		prev.next = temp.next;
	}
	
	public void deleteHead()
	{
		Node temp = head;
		if (temp != null) {
			head = temp.next; // Changed head
			return;
		}
		
			
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}*/

}
