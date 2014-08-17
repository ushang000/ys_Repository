package ys.samsung.test;

import java.util.Scanner;
import java.io.FileInputStream;

/*
 As the name of the class should be Solution, using Solution.java as the filename is recommended.
 In any case, you can execute your program by running 'java Solution' command.
 */
//************************************************
//打飞机阿列克山大发就的可发就的发的
//sdfagfdglkdlgkdsfdfd
class Solution {
	public static void main(String args[]) throws Exception {
		/*
		 * The method below means that the program will read from input.txt,
		 * instead of standard(keyboard) input. To test your program, you may
		 * save input data in input.txt file, and call below method to read from
		 * the file when using nextInt() method. You may remove the comment
		 * symbols(//) in the below statement and use it. But before submission,
		 * you must remove the freopen function or rewrite comment symbols(//).
		 */
		// System.setIn(new FileInputStream("res/input.txt"));

		/*
		 * Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		/*
		 * Read each test case from standard input.
		 */

		for (int test_case = 1; test_case <= T; test_case++) {

			// ///////////////////////////////////////////////////////////////////////////////////////////
			/*
			 * Please, implement your algorithm from this section.
			 */
			// ///////////////////////////////////////////////////////////////////////////////////////////
			int N = sc.nextInt();
			int numA1=0;
			int numA2=1;
			int numB1=0;
			int numB2=0;
			int numC1=0;
			int numC2=0;
			int K[][] = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					K[i][j] = sc.nextInt();	
				}
			}
			for (int i = 0; i < K.length; i++) {
				for (int j = 0; j < K.length; j++) {
					if (K[i][j]!=0) {
						if (K[i][j]==K[i][j+1]) {
							numA2++;
						}
						if (K[j][i]==K[j+1][i]) {
							numA1++;
						}
					}else {
						if (numA1>1) {
							break;
						}
					}
				}
			}
			// Print the answer to standard output(screen).
			System.out.println("#" + test_case);
		}
	}
}
