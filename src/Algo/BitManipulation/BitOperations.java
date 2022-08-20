package Algo.BitManipulation;

public class BitOperations {
	public static void getBitOperation(int pos, int i) {
		// here we are checking (get) at a particular position(zero based indexing) bit
		// is 1 or 0
		// 1. left shift by position times
		int bitMask = 1 << pos;
		// 2. Find And of number and bitMask
		if ((bitMask & i) == 0) { // Single Ampersand (&) operation
			System.out.println("bit was zero");
		} else {
			System.out.println("bit was one");
		}
	}

	public static void setBitOperation(int pos, int i) {
		// here we are modifying a bit at a particular postition
		// 1. Left shift by position times
		int bitMask = 1 << pos;
		// 2. Or opertaion of bitMask and Number.
		int newNumber = bitMask | i; // Single pipe (|) operation
		System.out.println("After Modification: " + newNumber);
	}

	public static void clearBitOperation(int pos, int i) {
		// here we are clearing a bit at particular position to Zero.
		// 1. First left shift by position times.
		int bitMask = 1 << pos;
		// 2. ( And with Not ) of bitMask and Number
		// 2.a Not
		int notOfBitMask = ~(bitMask);
		// 2.b AND
		int newNumber = notOfBitMask & i;
		System.out.println("Clearing bit to 0: " + newNumber);
	}

	public static void updateBitOperation(int pos, int i, int operation) {
		// here we are updating a bit at a particular position
		// We have two things either to make that bit to 1 or to 0

		// for (1 ko 0 bana na): bitmask(1<<pos) then AND with NOT. (this is clear)
		// for(0 ko 1 bana na): bitmask(1<<pos) then OR. (this is set)
		// operation = 1// update bit to 1 else update to 0
		int bitMask = 1 << pos;
		if (operation == 1) {
			// set
			int newNumber = bitMask | i;
			System.out.println("Updating to 1: " + newNumber);
		} else {
			int notOfBitMask = ~(bitMask);
			int newNumber = notOfBitMask & i;
			System.out.println("Updating to 0: " + newNumber);
		}

	}

	public static void main(String[] args) {
		int i = 5;
		int pos = 2;
		int operation = 1;
		getBitOperation(pos, i);
		setBitOperation(pos, i);
		clearBitOperation(pos, i);
		updateBitOperation(pos, i, operation);

	}

}
