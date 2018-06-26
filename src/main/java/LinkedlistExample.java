public class LinkedlistExample {

	Node head;
	
	static class Node{
		int data;
		Node next;
		public Node(int d) {
			// TODO Auto-generated constructor stub
			data = d;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedlistExample list = new LinkedlistExample();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		list.head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		list.printall();
		list.delete(3);
		System.out.println("===========");
		list.printall();
	}
	
	
	
	private void delete(int i) {
		Node temp = head;
		Node pre = null;
		if(temp != null && temp.data == i) {
			head = temp.next;
			return;
		}
		while(temp != null && temp.data != i)
		{
			pre = temp;
			temp = temp.next;
		}
		if(temp == null)
			return;
		pre.next = temp.next;
		
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

}
