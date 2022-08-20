package Algo.others;

public class BackTrackingPermutation {
	// Time complexity is O(n*n!): N to Steps lag rahe hai (A-> AB ->ABC) or total n! arrangements hai

	public static void stringPermutations(String str, String perm, int idx) {
		if (str.length() == 0) {
			System.out.println(perm);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char curChar = str.charAt(i); // ABC -> A ko liya
			String newStr = str.substring(0, i) + str.substring(i + 1); // A ke aage ki string ko liya (BC) fir uske aage
			stringPermutations(newStr, perm + curChar, idx + 1); // uske aage agli subString ka recursion tree banega and so on..
		}
	}

	public static void main(String[] args) {
		String str = "ABCDE";
		stringPermutations(str, "", 0);

	}

}