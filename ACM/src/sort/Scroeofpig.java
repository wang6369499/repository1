package sort;

import java.util.Scanner;

public class Scroeofpig {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner（System.in);
		int n=s.nextInt();
		int a[][]=new int [n][n+1];
		for(int i=0;i<n;i++){
			for(int j=1;j<=i+1;j++)
				a[i][j]=j;
		}
	}

}
