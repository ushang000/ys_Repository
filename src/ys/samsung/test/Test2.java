package ys.samsung.test;

import java.util.Scanner;

public class Test2 {
	int rabbits[] = new int[10];// 记录可以被吃掉的个数
	int number = 0;
	int fox_X;
	int fox_Y;
	String temp1;// 获取控制台每一行的值

	public Test2() {
		getRabbitNumber();
		if ("".equals(temp1)) {// 如果控制台输入结束，则输出结果
			for (int i = 1; i <= number; i++) {
				System.out.println("#" + i + " " + rabbits[i - 1]);
			}
		}
	}

	public void getRabbitNumber() {
		Scanner scanner = new Scanner(System.in); // 控制台输入字符
		do {
			temp1 = scanner.nextLine();// 获取控制台每一行的值
			if (temp1.equals("")) {// 判断控制台输入结束
				break;
			}
			String temp2[] = null;
			temp2 = temp1.split("\\s");// 将坐标值存入数组中
			for (int j = 3; j < temp2.length - 1; j = j + 2) {
				fox_X = Integer.parseInt(temp2[1]);// 狐狸的横坐标
				fox_Y = Integer.parseInt(temp2[2]);// 狐狸的纵坐标
				int aa = Integer.parseInt(temp2[j]);
				int bb = Integer.parseInt(temp2[j + 1]);
				if (fox_X == aa || fox_Y == bb
						|| Math.abs(fox_X - fox_Y) == Math.abs(aa - bb)
						|| (fox_X + fox_Y) == (aa + bb)) {//判断兔子是否可被吃掉
					rabbits[number]++;
				}
			}
			number++;
		} while (true);
	}

	public static void main(String[] str) {
		new Test2();
	}
}
// 测试数据
// 可被杀死的兔子数为 2 个
// 5 10 10 1 5 2 2 9 8 17 10 20 19
// 可被杀死的兔子数为 4 个
// 10 3 5 1 6 2 9 3 7 8 10 11 16 15 14 20 20 19 5 3 18 7 7
// 可被杀死的兔子数为 8 个
// 10 3 8 2 9 4 7 4 9 2 7 3 6 3 14 1 8 14 8 6 15 13 10