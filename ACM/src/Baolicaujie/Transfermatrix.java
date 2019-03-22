package Baolicaujie;

import java.util.Scanner;
/*求转置矩阵问题
 输入一个三行三列转置矩阵，第一行一个整数n小于20；表示有n组数据，下面是n组数据
 每组有9个整型数，分别为矩阵每项*/
public class Transfermatrix {
	static int [][]a=new int [3][3];
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int i,j,k,t=0;
		int n=s.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<3;j++){
				for(k=0;k<3;k++){
					a[j][k]=s.nextInt();
				}
			}
			for(j=0;j<3;j++){
				for(k=0;k<j;k++){
					t=a[j][k];
					a[j][k]=a[k][j];
					a[k][j]=t;
				}
			}
			for(j=0;j<3;j++){
				for(k=0;k<3;k++){
					System.out.print(a[j][k]+"  ");
				}
				System.out.println();
			}
		}
	}

}
