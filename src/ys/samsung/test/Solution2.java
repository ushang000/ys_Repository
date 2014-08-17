package ys.samsung.test;

import java.util.Scanner;
import java.io.FileInputStream;

/*
 As the name of the class should be Solution, using Solution.java as the filename is recommended.
 In any case, you can execute your program by running 'java Solution' command.
 */
class Solution2 {
	static int N;
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
			 * Read the test case from standard input.
			 */
			N = sc.nextInt();
			Answer = 0;
			StringBuffer result = new StringBuffer();
			int temp = N;
			int num = 1;
			while (N != 0) {
				temp = N % 2;
				N = N / 2;
				result.insert(0, temp);
			}
			System.out.println(result);
			result.toString();
			for (int i = 0; i < result.length(); i++) {
				Answer += num * (result.charAt(i) == '1' ? 1 : 0);
				num *= 2;
			}
			// ///////////////////////////////////////////////////////////////////////////////////////////
			/*
			 * Implement your algorithm here.
			 */
			// ///////////////////////////////////////////////////////////////////////////////////////////

			// Print the answer to standard output(screen).
			System.out.println("#" + test_case + " " + Answer);
		}
		System.out.println();
	}
}
