package singleLinkedlist;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// ����
		int a;; // ��һ����
		int x = ~0, y = 0, z = 0;// ״̬ 1 2 3��������ģ3Ϊ0 1 2��
		int t = 0,m = 0; // ��Ϊ�滻����
		for(int i = 0; i < n; i++) {
			a = sc.nextInt();
			t = (~a & z) | (a & y);
			m = (~a & y) | (a & x);
			x = (~a & x) | (a & z);
			y = m;
			z = t;
		}
		System.out.println(y);
	}
}