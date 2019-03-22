package Baolicaujie;

import java.util.Scanner;

public class zerooffactorial {
/*描述
计算n!的十进制表示最后有多少个0
输入
第一行输入一个整数N表示测试数据的组数(1<=N<=100)每组测试数据占一行，都只有一个整数M(0<=M<=10000000)
输出
输出M的阶乘的十进制表示中最后0的个数比如5!=120则最后的0的个数为1
样例输入
6
3
60
100
1024
23456
8735373
样例输出
0
14
24
253
5861
2183837*/
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			int m=s.nextInt();
			int x=0;
			for(int j=0;j<=m;j++){
				int h=j;
				while(h!=0){
					if(h%5!=0){
						break;
					}
					else{
						x++;
						h=h/5;
					}
				}
			}
			System.out.println(x);
		}
	}
}
//此题要求0的个数，实际只需求1-n之间的数有多少能被5整除，并且能被除的可以被多少个5整除

