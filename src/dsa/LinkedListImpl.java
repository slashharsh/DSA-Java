package dsa;

public class LinkedListImpl {
	Node head;

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

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
		System.out.print("null");

	}

	public static void main(String[] args) {
		LinkedListImpl ll = new LinkedListImpl();
		ll.addFirst("this");
		ll.addFirst("is");
		ll.addLast("a linkedlist?");
		ll.printList();

	}

}
