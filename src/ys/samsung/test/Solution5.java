package ys.samsung.test;

import java.util.Scanner;
import java.io.FileInputStream;

/*
 As the name of the class should be Solution, using Solution.java as the filename is recommended.
 In any case, you can execute your program by running 'java Solution' command.
 */
class Solution5 {
	static int K;
	static int[] A;
	static int Answer;

	public static void main(String args[]) throws Exception {
		/*
		 * The method below means that the program will read from input.txt,
		 * instead of standard(keyboard) input. To test your program, you may
		 * save input data in input.txt file, and call below method to read from
		 * the file when using nextInt() method. You may remove the comment
		 * symbols(//) in the below statement and use it. But before submission,
		 * you must remove the freopen function or rewrite comment symbols(//).
		 */
		// System.setIn(new FileInputStream("input.txt"));

		/*
		 * Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 1; test_case++) {
			/*
			 * Read each test case from standard input.
			 */
			K = sc.nextInt();
			A = new int[4];
			for (int i = 0; i < 4; i++) {
				A[i] = sc.nextInt();
			}

			// ///////////////////////////////////////////////////////////////////////////////////////////
			/*
			 * Implement your algorithm here.
			 */
			// ///////////////////////////////////////////////////////////////////////////////////////////
			Answer = -1;
			int temp = 0;
			for (int i = 0; i < A.length; i++) {
				for (int j = i + 1; j < A.length; j++) {
					if (A[i] > A[j]) {
						temp = A[i];
						A[i] = A[j];
						A[j] = temp;
					}
				}
			}
			StringBuffer sBuffer = new StringBuffer();
			for (int i = 0; i < A.length; i++) {
				sBuffer.append(A[i]);
			}
			sBuffer.toString();
			int N = K / 6;
			int M = K % 6;
			if (M != 0) {
				sBuffer.deleteCharAt(N);
				int temp0 = Integer.parseInt(String.valueOf(sBuffer.charAt(0)));
				int temp1 = Integer.parseInt(String.valueOf(sBuffer.charAt(1)));
				int temp2 = Integer.parseInt(String.valueOf(sBuffer.charAt(2)));
				if (M == 1) {
					Answer = A[N] * 1000 + temp0 * 100 + temp1 * 10 + temp2;
				}
				if (M == 2) {
					Answer = A[N] * 1000 + temp0 * 100 + temp2 * 10 + temp1;
				}
				if (M == 3) {
					Answer = A[N] * 1000 + temp1 * 100 + temp0 * 10 + temp2;
				}
				if (M == 4) {
					Answer = A[N] * 1000 + temp1 * 100 + temp2 * 10 + temp0;
				}
				if (M == 5) {
					Answer = A[N] * 1000 + temp2 * 100 + temp0 * 10 + temp1;
				}
			}
			if (M == 0) {
				sBuffer.deleteCharAt(N - 1);
				int temp0 = Integer.parseInt(String.valueOf(sBuffer.charAt(0)));
				int temp1 = Integer.parseInt(String.valueOf(sBuffer.charAt(1)));
				int temp2 = Integer.parseInt(String.valueOf(sBuffer.charAt(2)));
				Answer = A[N - 1] * 1000 + temp2 * 100 + temp1 * 10 + temp0;
			}
			// Print the answer to standard output(screen).
			System.out.println("#" + test_case + " " + Answer);
		}
	}
}
