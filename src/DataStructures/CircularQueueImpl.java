package DataStructures;

import java.util.ArrayList;
import java.util.Queue;

public class CircularQueueImpl {
	static class CircularQueue {
		static int[] arr;
		static int size;
		static int front;
		static int rear;

		CircularQueue(int size) {
			arr = new int[size];
			this.size = size;
			rear = -1;
			front = -1;
		}

		public boolean isFull() {
			return (rear + 1) % size == front;
		}

		public boolean isEmpty() {
			return rear == -1 && front == -1;
		}

		public void add(int data) {
			if (isFull()) {
				System.out.println("Queue Full");
				return;
			}

			// if it is first element
			if (front == -1) {
				front = 0;
			}

			rear = (rear + 1) % size;
			arr[rear] = data;
		}

		public int remove() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int res = arr[front];
			// if only one element is there
			if (front == rear) {
				front = rear = -1;
			} else {
				front = (front + 1) % size;
			}

			return res;
		}

		public int peek() {
			if (isEmpty()) {
				System.out.println("Queue empty");
				return -1;
			}
			return arr[front];
		}

	}

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);
		cq.add(1);
		cq.add(2);
		cq.add(3);
		cq.add(4);
		cq.add(5);
		System.out.println("Removing:" + cq.remove());
		cq.add(10);

		while (!cq.isEmpty()) {
			System.out.println(cq.peek());
			cq.remove();
		}
	}
}
