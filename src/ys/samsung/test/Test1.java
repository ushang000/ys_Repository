package ys.samsung.test;

import java.util.Random;

public class Test1 {
	int size=1000;//size是设定的矩阵的大小，可调节
	int a[][] = new int[size][size];

	public Test1() {

		Random random = new Random();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				a[i][j] = Math.abs(random.nextInt()) % 10;
				//System.out.print(a[i][j]+" ");
			}
			//System.out.println();
		}
		//输出最终结果
		System.out.println("输出最终结果: "+maxa());

	}

	public int maxa() {
		int y = 0;
		int temp = 0;
		System.out.println();
		//输出1-9出现的个数
		System.out.println("输出1-9出现的个数: "+geta(1) + "," + geta(2) + "," + geta(3) + ","
				+ geta(4) + "," + geta(5) + "," + geta(6) + "," + geta(7) + ","
				+ geta(8) + "," + geta(9));
		int aR[] = { geta(1) * 1, geta(2) * 2, geta(3) * 3, geta(4) * 4,
				geta(5) * 5, geta(6) * 6, geta(7) * 7, geta(8) * 8, geta(9) * 9 };
		for (int i = 0; i < 9; i++) {
			if (aR[i] > temp) {
				temp = aR[i];
				y = i+1;
			}
		}
		//输出总和最大的值
		System.out.println("输出总和最大的值: "+temp);
		return y;
	}

	public int geta(int x) {
		int temp1 = 0;//最终个数
		//int x = 1;//要统计的数字
		int a1[] = new int[4*size];
		for (int i = 0; i < size; i++) {
			a1[i] = 1;// 个数统计
			a1[size + i] = 1;
			a1[2*size + i] = 1;
			a1[3*size + i] = 1;
			//水平统计
			for (int j = 0; j < size; j++) {
				if (a[i][j] == x) {
					if (j < size-1) {
						if (a[i][j + 1] == x) {
							a1[i]++;
						} else {
							if (a1[i] > temp1) {
								temp1 = a1[i];
							}
							a1[i] = 1;
						}
					}
				}
				//竖直统计
				if (a[j][i] == x) {
					if (j < size-1) {
						if (a[j + 1][i] == x) {
							a1[size + i]++;
						} else {
							if (a1[size + i] > temp1) {
								temp1 = a1[size + i];
							}
							a1[size + i] = 1;
						}

					}
				}

			}
			//正向对角统计
			if (a[i][i] == x) {
				if (i < size-1) {
					if (a[i + 1][i + 1] == x) {
						a1[2*size + i]++;
					} else {
						if (a1[2*size + i] > temp1) {
							temp1 = a1[2*size + i];
						}
						a1[2*size + i] = 1;
					}
				}
			}
			//反向对角统计
			if (a[i][size-1 - i] == x) {
				if (i < size-1) {
					if (a[i + 1][size-2 - i] == x) {
						a1[3*size + i]++;
					} else {
						if (a1[3*size + i] > temp1) {
							temp1 = a1[3*size + i];
						}
						a1[3*size + i] = 1;
					}
				}
			}
		}
		return temp1;
	}

	public static void main(String[] str) {
		new Test1();
	}
}
