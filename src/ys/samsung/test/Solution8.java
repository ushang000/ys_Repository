package ys.samsung.test;

import java.util.Scanner;
import java.io.FileInputStream;

/*
	As the name of the class should be Solution, using Solution.java as the filename is recommended.
	In any case, you can execute your program by running 'java Solution' command.
 */
class Solution8
{
	static int N, B, M;
	static int[] R1, C1, R2, C2;
	static int Answer;

	public static void main(String args[]) throws Exception
	{
		/*
			The method below means that the program will read from input.txt, instead of standard(keyboard) input.
			To test your program, you may save input data in input.txt file,
			and call below method to read from the file when using nextInt() method.
			You may remove the comment symbols(//) in the below statement and use it.
			But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */
		// System.setIn(new FileInputStream("input.txt"));

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);

		/*
		   Your program should handle 10 test cases given.
		 */
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			/*
			  	Read each test case from standard input.
			 */
			N = sc.nextInt();
			B = sc.nextInt();
			M = sc.nextInt();
			R1 = new int [M];
			C1 = new int [M];
			R2 = new int [M];
			C2 = new int [M];
			for(int i = 0; i < M; i++)
			{
				R1[i] = sc.nextInt();
				C1[i] = sc.nextInt();
				R2[i] = sc.nextInt();
				C2[i] = sc.nextInt();
			}


			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.					*/
			/////////////////////////////////////////////////////////////////////////////////////////////
			// Answer = 0;
			for (int i = 1; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if(R1[j]==N-i && R2[j]==N-i){
						if(C1[j]==B){
							B=C2[j];
						}else if (C2[j]==B) {
							B=C1[j];
						}
					}
				}
			}
			Answer=B;

			// Print the answer to standard output(screen).
			System.out.println("#" + test_case + " " + Answer);
		}
	}
}


