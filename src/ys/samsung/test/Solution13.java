package ys.samsung.test;

import java.util.Scanner;
import java.io.FileInputStream;

/*
   As the name of the class should be Solution, using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution13
{
	static int P1, P2, P3;
	static int[] A;
	static int Answer;

	public static void main(String args[]) throws Exception
	{
		int i;
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

		// Read three positive integers specifying three positions.
		P1 = sc.nextInt();
		P2 = sc.nextInt();
		P3 = sc.nextInt();
		A = new int[100];
		// Read 100 positive integers and store them in A[0..99].
		for(i = 0; i < 100; i++)
			A[i] = sc.nextInt();

		/////////////////////////////////////////////////////////////////////////////////////////////
		/*
		   Implement your algorithm here.
		   The answer to the case will be stored in variable Answer.
		 */
		/////////////////////////////////////////////////////////////////////////////////////////////
		Answer = 0;
		Answer=A[P1-1]+A[P2-1]+A[P3-1];
		System.out.println(A[P1-1]+"  "+A[P2-1]+"  "+A[P3-1]);
		// Print the answer to standard output(screen).
		System.out.println(Answer);
	}
}

