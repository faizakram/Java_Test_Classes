package com.st.tanu;

public class LinkListExample {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int val) {
			data = val;
			next = null;
		}
		
	}
	
	public void printall()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public void deleteHead()
	{
		if(head!= null)
		{
			head = head.next;
		}
	}
	public void delete(int val)
	{
		Node temp = head;
		Node pre=null;
		if(temp!=null && temp.data == val)
		{
			head = temp.next;
			return;
		}
		while(temp != null && temp.data != val)
		{
			pre = temp;
			temp = temp.next;
		}
		if (temp == null)
			return;
		pre.next = temp.next;
	}

	public static void main(String[] args) {
		LinkListExample llsit = new LinkListExample();
		llsit.head = new Node(10);
		llsit.head.next = new Node(20);
		llsit.head.next.next = new Node(30);
		llsit.printall();
		llsit.delete(20);
		System.out.println("=============");
		llsit.printall();
	}

}
