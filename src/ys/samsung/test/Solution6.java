package ys.samsung.test;

import java.util.Scanner;
import java.io.FileInputStream;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 As the name of the class should be Solution, using Solution.java as the filename is recommended.
 In any case, you can execute your program by running 'java Solution' command.
 */
class Solution6 {
	static int[][] Map = new int[501][501];
	static int Answer;
	static int N;

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

		/*
		 * Your program should handle 20 test cases given.
		 */
		for (int test_case = 1; test_case <= 1; test_case++) {
			/*
			 * Read each test case from standard input. A cell information of
			 * i-th row and j-th column is stored in Map[i][j]. (ex. If a number
			 * in the second row and the third column is one, one is stored in
			 * Map[2][3].)
			 */
			N = sc.nextInt();
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					Map[i][j] = sc.nextInt();
				}
			}

			// ///////////////////////////////////////////////////////////////////////////////////////////
			/*
			 * Implement your algorithm here. The answer will be stored in
			 * variable Answer.
			 */
			// ///////////////////////////////////////////////////////////////////////////////////////////
			Answer = 0;
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (Map[i][j] == 1) {
						getNumY(i, j+1);
						//getNumX(i+1, j);
						Answer++;
					}
					if (Map[i][j] == 0) {
						getY(i, j+1);
						//getX(i+1, j);
						Answer++;
					}
				}
			}

			// Print the answer to standard output(screen).
			System.out.println("#" + test_case + " " + Answer);
		}

	}

	public static int getNumY(int i, int j) {

		if (i <= N && j <= N ) {
			if ( Map[i][j] == 1) {
				Map[i][j] = 2;
				getNumY(i, j+1);
			}if (Map[i+1][j-1]==1) {
				Map[i+1][j-1]=2;
			}
			//getNumX(i+1, j);
		} else {
			return 0;
		}
		return getNumY(i, j+1)+getNumX(i+1, j);
	}

	public static int getNumX(int i, int j) {
		if (i <= N && j <= N ) {
			if ( Map[i][j] == 1) {
				Map[i][j] = 2;
				getNumX(i+1, j);
			}if (Map[i-1][j+1]==1) {
				Map[i-1][j+1]=2;
			}
			//getNumY(i, j+1);
		} else {
			return 0;
		}
		return getNumX(i+1, j)+getNumY(i, j+1);
	}

	public static int getY(int i, int j) {

		if (i <= N && j <= N ) {
			if ( Map[i][j] == 0) {
				Map[i][j] = 2;
				getY(i, j+1);
			}if (Map[i+1][j-1]==0) {
				Map[i+1][j-1]=2;
			}
			//getX(i+1, j);
		} else {
			return 0;
		}
		return getY(i, j+1)+getX(i+1, j);
	}

	public static int getX(int i, int j) {
		if (i <= N && j <= N ) {
			if ( Map[i][j] == 0) {
				Map[i][j] = 2;
				getX(i+1, j);
			}if (Map[i-1][j+1]==0) {
				Map[i-1][j+1]=2;
			}
			//getY(i, j+1);
		} else {
			return 0;
		}
		return getX(i+1, j)+getY(i, j+1);
	}
}
