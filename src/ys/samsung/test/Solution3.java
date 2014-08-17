package ys.samsung.test;

import java.util.Scanner;
import java.io.FileInputStream;
/*
   As the name of the class should be Solution, using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution3
{
	static int[][] A = new int[9][9];
	static int[] Answer = new int[15];

	static int K;

	public static void main(String args[]) throws Exception
	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */
		//System.setIn(new FileInputStream("input.txt"));

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);

		/*
		   Your program should handle 10 test cases given.
		 */
		for(int test_case = 1; test_case <= 1; test_case++)
		{
			/*
			   Read each test case from standard input.
			   Read the matrix with K modifications, and store it in A.
			 */
			K = sc.nextInt();
			for(int i = 0; i < 9; i++)
			{
				for(int j = 0; j < 9; j++)
				{
					A[i][j] = sc.nextInt();
				}
			}

			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer will be stored in array Answer.
			   Total 3*K numbers should be stored, as each modification is printed as 3 numbers.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////
			StringBuffer sBuffer=new StringBuffer();
			int temp = 0;
			for (int i = 0; i < 9; i++) {
				
				for (int j = 0; j < 9; j++) {
					for (int j2 = j+1; j2 < 9; j2++) {
						for (int k = 0; k < 9; k++) {
						if (A[i][j]==A[i][j2]) {
							if(A[i][j2]==A[k][j2]){
								int a=i+1;
								int b=j2+1;
								sBuffer.append(a);
								sBuffer.append(b);
								//Answer[0]=i+1;
								//Answer[1]=j2+1;												
							}else {
								sBuffer.delete(0, 1);
								int a=i+1;
								int b=j+1;
								sBuffer.append(a);
								sBuffer.append(b);
								//Answer[0]=i+1;
								//Answer[1]=j+1;
							}	
							temp=i;
						}	
						}
					}				
				}
			}
			boolean b=true;
			for (int k2 = 1; k2 < 10; k2++) {
				for (int l = 0; l <9; l++) {
					if (k2==A[temp][l]) {	
						b=false;
					}			
				}
				if(b==true){
					sBuffer.append(k2);
					//Answer[2]=k2;
				}
				b=true;
			}
			System.out.println(sBuffer.toString());
			for (int i = 0; i < 3*K; i++) {
				Answer[i]=sBuffer.charAt(i);
			}
			// Print the answer to standard output(screen).
			System.out.print("#" + test_case);
			for(int i = 0; i < 3 * K; i++)
			{
				System.out.print(" " + Answer[i]);
			}
			System.out.println();
		}
	}
}


