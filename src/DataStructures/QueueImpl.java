package DataStructures;

public class QueueImpl {
	static class Queue {
		static int size;
		static int[] arr;
		static int rear;

		Queue(int size) {
			arr = new int[size];
			this.size = size;
			rear = -1;
		}

		public boolean isEmpty() {
			return rear == -1;
		}
		
		// Enqueue, O(1)
		public void add(int data) {
			if (rear == size - 1) {
				System.out.println("Queue is full");
				return;
			}
			rear++;
			arr[rear] = data;
		}
		
		// Dequeue, O(n)
		public int remove() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}

			int front = arr[0];
			for (int i = 0; i < rear; i++) {
				arr[i] = arr[i + 1];
			}
			rear--;
			return front;
		}

		public int peek() {
			if (isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return arr[0];
		}

	}

	public static void main(String[] args) {
		Queue qq = new Queue(5);
		qq.add(0);
		qq.add(1);
		qq.add(2);
		qq.add(3);
		System.out.println("Front is " + qq.peek());

		while (!qq.isEmpty()) {
			System.out.println(qq.peek());
			qq.remove();
		}

	}

}
