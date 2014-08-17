package ys.samsung.test;

import java.util.Scanner;
import java.io.FileInputStream;

/*
   As the name of the class should be Solution, using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution4
{
	static int N;
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
		   Read each test case from standard input.
		 */

		N = sc.nextInt();
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		/*
		   Implement your algorithm here.
		   The answer will be stored in variable Answer.
		 */
		/////////////////////////////////////////////////////////////////////////////////////////////
		// Answer = 0;
		Answer=1;
		do {
			Answer*=N;
		} while (Answer<=1000);

		// Print the answer to standard output(screen).
		System.out.println(Answer);
	}
}


