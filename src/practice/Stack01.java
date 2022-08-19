package practice;

import java.util.Stack;

public class Stack01 {
//	Q: Adding an element at bottom of the stack. | Reversing a stack. 
	
	private static void pushAtBottomRecursive(int data, Stack<Integer> s) {
		if (s.isEmpty()) {
			s.push(data);
			return;
		}

		int top = s.pop();
		pushAtBottomRecursive(data, s);
		s.push(top);

	}

	private static void pushAtBottomIterative(Integer data, Stack<Integer> st) {
		Stack<Integer> tempSt = new Stack<>();
		while (!st.isEmpty()) {
			int top = st.pop();
			tempSt.push(top);
		}
		st.push(data);
		while (!tempSt.isEmpty()) {
			int top = tempSt.pop();
			st.push(top);
		}

	}

	private static void reverseAStack(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverseAStack(s);
		pushAtBottomRecursive(top, s);
	}

	public static void main(String[] args) {
		// Insertion in bottom of stack.
		Stack<Integer> st = new Stack<>();
		Integer data = 12312;
		st.push(1);
		st.push(2);
		st.push(3);

//		pushAtBottomRecursive(data, st);
//		pushAtBottomIterative(data, st);
		reverseAStack(st);
		while (!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}

	}

}
