package ys.samsung.test;

import java.util.Scanner;
import java.io.FileInputStream;
/*
   As the name of the class should be Solution, using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution1
{
	static int[] A;
	static int num0=0,num1=0,num2=0;
	static int Answer1, Answer2;

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
		   Read the test case from standard input.
		*/
		A = new int [100];
		for(int i = 0; i < 100; i++)
		{
			A[i] = sc.nextInt();
		}
		

		/////////////////////////////////////////////////////////////////////////////////////////////
		/*
		   Implement your algorithm here.
		   The answer will be stored in variable Answer.
		*/
		/////////////////////////////////////////////////////////////////////////////////////////////
		// Answer1 = 0; Answer2 = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i]==0) {
				num0++;
			}else if (A[i]==1) {
				num1++;
			}else if (A[i]==2) {
				num2++;
			}
		}
		if (num0>num1&&num0>num2) {
			Answer1=0;
			Answer2=num0;
		}else if (num1>num0&&num1>num2) {
			Answer1=1;
			Answer2=num1;
		}else if (num2>num0&&num2>num1) {
			Answer1=2;
			Answer2=num2;
		}
		// Print the answer to standard output(screen).
		System.out.println(Answer1 + " " + Answer2);
	}
}


