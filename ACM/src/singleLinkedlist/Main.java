package singleLinkedlist;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 个数
		int a;; // 第一个数
		int x = ~0, y = 0, z = 0;// 状态 1 2 3（二进制模3为0 1 2）
		int t = 0,m = 0; // 作为替换传递
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