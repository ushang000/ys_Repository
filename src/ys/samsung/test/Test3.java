package ys.samsung.test;

import java.util.Scanner;

public class Test3 {

	String line1, line2;
	int temp1;
	public Test3() {
		getCity();
		System.out.println(temp1);
	}

	public void getCity() {
		Scanner scanner = new Scanner(System.in); // ����̨�����ַ�
		do {
			line1 = scanner.nextLine();// ��ȡ����̨ÿһ�е�ֵ
			if (line1.length() > 3) {
				line2 = line1;
			}
			if (line1.equals("")) {// �жϿ���̨�������
				break;
			}
			int temp = line1.charAt(0);// ���и���
			String citys[] = null;
			String citytemp[] = {"0"};
			
			citys = line2.split("\\s");// ������ֵ����������
			for (int i = 1; i <= temp; i = i++) {
				temp1=i;
				do {
					if (citys.length!=citytemp.length) {
						citys=citytemp;
						for (int j = 0, k = 0; j < citys.length; k++, j++) {
								if (temp1 == Integer.parseInt(citys[j])) {
									if (j % 2 == 0) {
										// citys[j+1];
										temp1=Integer.parseInt(citys[j+1]);
										--k;
										j++;
									} else {
										k = k - 2;
										temp1=Integer.parseInt(citys[j-1]);
									}								
								}
								citytemp[k] = citys[j];				
						}
					}else {
						temp1=i;
						break;
					}
					
				} while (citys.length>0);
				
			}

		} while (true);
	}
	
	public static void main(String[] str) {
		new Test3();
	}
}
