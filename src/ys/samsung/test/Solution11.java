package ys.samsung.test;

import java.util.Scanner;
import java.io.FileInputStream;

/*
 As the name of the class should be Solution, using Solution.java as the filename is recommended.
 In any case, you can execute your program by running 'java Solution' command.
 */
class Solution11 {
	static int V, E;
	static int[] E1, E2;
	static int Answer1;
	static int[] Answer2;
	static int[] citys;
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
		Answer2 = new int[3];

		/*
		 * Your program should handle 15 test cases given.
		 */
		for (int test_case = 1; test_case <= 15; test_case++) {
			/*
			 * Read each test case from standard input. The number of cities and
			 * edges are stored in V and E, respectively. Cities connected by
			 * i-th edge is E1[i] and E2[i].
			 */
			V = sc.nextInt();
			E = sc.nextInt();
			E1 = new int[E];
			E2 = new int[E];
			citys=new int[2*E];
			for (int i = 0; i < 2*E; i++) {
				//E1[i] = sc.nextInt();
				//E2[i] = sc.nextInt();
				citys[i]= sc.nextInt(); 
			}

			// ///////////////////////////////////////////////////////////////////////////////////////////
			/*
			 * Implement your algorithm here. The size of a minimum critical set
			 * is stored in variable Answer1, and elements of the set are stored
			 * in array Answer2.
			 */
			// ///////////////////////////////////////////////////////////////////////////////////////////
			int[] num=new int[citys.length-1];
			if (test_case <= 10) {
				Answer1 = 1;
				for (int i = 0; i < citys.length-1; i++) {
					num[i]=1;
					for (int j = i+1; j < citys.length; j++) {
						if (citys[i]==citys[j]) {
							num[i]++;
						}
					}
				}
				for (int i = num.length-1; i >=1 ; i--) {
					for (int j = i-1; j >=0 ; j--) {
						if (num[i]>num[j]) {
							Answer2[0]=citys[i];
						}else {
							Answer2[0]=citys[j];
						}
					}
				}			
			}
			
			// Print the answer to standard output(screen).
			System.out.print("#" + test_case + " " + Answer1);
			for (int i = 0; i < Answer1; i++)
				System.out.print(" " + Answer2[i]);
			System.out.println();
		}
	}
}
