package ys.samsung.test;

import java.util.Scanner;
import java.io.FileInputStream;

/*
 As the name of the class should be Solution, using Solution.java as the filename is recommended.
 In any case, you can execute your program by running 'java Solution' command.
 */
class Solution12 {
	static int V, E, A, B;
	static int Answer1, Answer2, Answer3, Answer4;
	static int[] Parent;
	static int[] Left;
	static int[] Right;
	static int[] temp;
	static int N;
	static int M;

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
		 * Your program should handle 10 test cases given.
		 */
		for (int test_case = 1; test_case <= 10; test_case++) {
			/*
			 * Read each test case from standard input. The number of vertices,
			 * the number of edges, and two vertices are stored in V, E, A, and
			 * B, respectively. The information of tree is stored in array
			 * Parent, Left, and Right. The index of parent, left child, and
			 * right child of vertex i are Parent[i], Left[i], and Right[i],
			 * respectively.
			 */
			V = sc.nextInt();
			E = sc.nextInt();
			A = sc.nextInt();
			B = sc.nextInt();
			temp = new int[V + 1];
			Parent = new int[V + 1];
			Left = new int[V + 1];
			Right = new int[V + 1];

			for (int i = 0; i < E; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();
				if (Left[p] == 0)
					Left[p] = c;
				else
					Right[p] = c;
				Parent[c] = p;
			}

			// ///////////////////////////////////////////////////////////////////////////////////////////
			/*
			 * Implement your algorithm here. The closest common ancestor, the
			 * size of the subtree, and the height of the subtree will be stored
			 * in variable Answer1, Answer2, and Answer3. The number of trees
			 * will be stored in variable Answer4, which is used when two
			 * vertices are not in the same tree.
			 */
			// ///////////////////////////////////////////////////////////////////////////////////////////
			Answer1 = 0;
			Answer2 = 0;
			Answer3 = 0;
			Answer4 = 0;

			temp[0] = A;
			N = 1;
			M = 2;
			int num1 = 0;
			int num = 0;
			int num2 = 1;

			int temp2[] = new int[V + 1];
			do {
				A = Parent[A];
				temp[N++] = A;

			} while (Parent[A] != 0);
			getParent(B);
			if (Answer1 == 0) {
				for (int i = 1; i < V; i++) {
					if (Parent[i] == 0) {
						Answer4++;
					}
				}
			}
			temp2[num1++] = Answer1;
			do {
				int num3 = 0;
				for (int i = 0; i < num2; i++) {
					if (Left[temp2[num]] != 0) {
						num3++;
						temp2[num1++] = Left[temp2[num]];
					}
					if (Right[temp2[num]] != 0) {
						num3++;
						temp2[num1++] = Right[temp2[num]];
					}
					num++;
				}
				Answer3++;
				num2 = num3;
				if (num == num1) {
					break;
				}
			} while (Answer1 != 0);
			Answer2 = num;
			// Print the answer to standard output(screen).
			if (Answer1 == 0)
				System.out.println("#" + test_case + " " + Answer4);
			else
				System.out.println("#" + test_case + " " + Answer1 + " "
						+ Answer2 + " " + Answer3);
		}
	}

	public static int getParent(int P) {
		do {
			for (int i = 0; i < temp.length; i++) {
				if (Parent[P] == temp[i]) {
					Answer1 = Parent[P];
					return i;
				}
			}
			return getParent(Parent[P]);
		} while (Parent[P] != 0);

	}
}
