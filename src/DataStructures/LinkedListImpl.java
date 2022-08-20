package DataStructures;

public class LinkedListImpl {
	Node head;
	int size;

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}
	//1. Insert Element 
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	//2. Insert Element
	public void addLast(String data) {
		Node newNode = new Node(data);
		Node cN = head;
		if (head == null) {
			head = newNode;
			return;
		}
		while (cN.next != null) {
			cN = cN.next;
		}
		cN.next = newNode;

	}
	//3. Delete Element
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		head = head.next;
		size--;
	}
	
	//4. Delete Element
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node last = head.next;
		while(last.next != null) {
			last = last.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	
	//5. Print Element
	public void printList() {
		Node cN = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (cN != null) {
			System.out.print(cN.data + "->");
			cN = cN.next;
		}
		System.out.println("null");

	}
	// 7 Size
	public void size() {
		System.out.println(size);
	}
	
	/* Other operations */
	
	//1. Reversing a Linked List.
	
	public void reverseLinkedList() {
		
		if(head == null || head.next == null) {
			return;
		}
		Node prevNode, currNode;
		
		prevNode = head;
		currNode = head.next;
		while(currNode != null) {
			// Traverse
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			//Update
			prevNode = currNode;
			currNode = nextNode;
		}
		
		// In the end 
		head.next = null;
		head = prevNode;
		
	}

	public static void main(String[] args) {
		LinkedListImpl ll = new LinkedListImpl();
		ll.addLast("this");
		ll.addLast("is");
		ll.addLast("a");
		ll.addLast("linked");
		ll.addLast("list");
		ll.printList();
//		ll.deleteFirst();
//		ll.printList();
//		ll.deleteLast();
//		ll.printList();
		ll.size();
		ll.reverseLinkedList();
		ll.printList();

	}

}
