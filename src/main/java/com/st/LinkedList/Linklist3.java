package com.st.LinkedList;

public class Linklist3 {

	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public void printAll()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public void deleteHeadNode()
	{
		if(head == null) 
			return;
		head = head.next;
		/*return;*/	
	}
	public void deleteNode(int data)
	{	Node temp = head;
		Node pre = null;
		if(temp == null)
			return;
		if(temp != null && temp.data==data) {
			head = temp.next;
			return;
		}
		while(temp!=null && temp.data != data)
		{
			pre =temp;
			temp = temp.next;
		}
		pre.next = temp.next;
	}
	
	public static void main(String[] args) {
		
		Linklist3 ll3 = new Linklist3();
		ll3.head = new Node(10);
		ll3.head.next = new Node(11);
		ll3.printAll();
		System.out.println("===========");
		ll3.deleteHeadNode();
		ll3.printAll();
	}

}
