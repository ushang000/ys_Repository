package ys.samsung.test;

import java.util.Scanner;
import java.io.FileInputStream;

/*
 As the name of the class should be Solution, using Solution.java as the filename is recommended.
 In any case, you can execute your program by running 'java Solution' command.
 */
class Solution14 {
	static int A[][] = new int[501][501];
	static int N, K;
	static int Answer1, Answer2, Answer3;

	public static void main(String args[]) throws Exception {
		/*
		 * The method below means that the program will read from input.txt,
		 * instead of standard(keyboard) input. To test your program, you may
		 * save input data in input.txt file, and call below method to read from
		 * the file when using nextInt() method. You may remove the comment
		 * symbols(//) in the below statement and use it. But before submission,
		 * you must remove the freopen function or rewrite comment symbols(//).
		 */
		System.setIn(new FileInputStream("sample_input2.txt"));

		/*
		 * Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);

		/*
		 * Your program should handle 10 test cases given.
		 */
		for (int test_case = 1; test_case <= 10; test_case++) {
			/*
			 * Read each test case from standard input. Read two integers N, K,
			 * and read the matrix and store it in A[1..N][1..N].
			 */
			N = sc.nextInt();
			K = sc.nextInt();
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					A[i][j] = sc.nextInt();
				}
			}

			// ///////////////////////////////////////////////////////////////////////////////////////////
			/*
			 * Implement your algorithm here. The answers to the case will be
			 * stored in variable Answer1, Answer2, Answer3.
			 */
			// ///////////////////////////////////////////////////////////////////////////////////////////
			int type1 = 0;
			int type2 = 0;
			int type3 = 0;
			Answer1 = Answer2 = Answer3 = 1;
			for (int i = 1; i <= N; i++) {
				int num2 = 1;
				int num3 = 1;
				for (int j = 1; j <= N; j++) {
					if (A[i][j] != 0) {
						if (j < N) {
							if (A[i][j] == A[i][j + 1]) {
								num2++;
							} else {
								if (num2 > 1) {
									type2++;
									Answer2 = Answer2 * num2;
									num2 = 1;
								}
							}
						} else {
							if (num2 > 1) {
								type2++;
								Answer2 = Answer2 * num2;
								num2 = 1;
							}
						}

					}
					if (A[j][i] != 0) {
						if (j < N) {
							if (A[j][i] == A[j + 1][i]) {
								num3++;
							} else {
								if (num3 > 1) {
									type3++;
									Answer3 = Answer3 * num3;
									num3 = 1;
								}
							}
						} else {
							if (num3 > 1) {
								type3++;
								Answer3 = Answer3 * num3;
								num3 = 1;
							}
						}
					}
					type1 = K - type2 - type3;
				}
			}
			Answer1 = Answer1 * type1;
			Answer2 = Answer2 * type2;
			Answer3 = Answer3 * type3;
			// Print the answer to standard output(screen).
			System.out.println("#" + test_case + " " + Answer1 + " " + Answer2
					+ " " + Answer3);
		}
	}
}
