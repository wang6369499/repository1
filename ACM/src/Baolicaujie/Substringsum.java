package Baolicaujie;

import java.util.Scanner;
/*子串和
 * 给定一整形数列{a1，a2。。。an}，找出连续非空子串{ax，ax-1。。。ay}，使该子序列和最大，其中
 * 1<=x<=y<=n
 * 输入
 * 第一行是一个整数N（N<=10）表示测试组数
 * 每组测试数的第一
 * 行是一个整数n表示序列中共有n个整数，随后一行里有n个整数l(-100=<l<=100),
 * 表示数序列的所以元素（0<=n<=1000000）
 * 输出
 * 对于每组测试数据输出和最大的连续子串和
 * eg
 * 1
 * 5	
 * 1	2	-1	3	-2*/
public class Substringsum {
	static int a[]=new int [1000000];
	static int max,n,sum;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int j=0;j<N;j++){
			n=s.nextInt();
			for(int i=0;i<n;i++)
				a[i]=s.nextInt();
				max=a[0];
				for(int h=0;h<n;h++)
					dfs(h);
				System.out.print(max);
			
		}
	}
	public static void dfs(int cur){
				for(int end=n-1;end>=cur;end--){
					sum=0;
					for(int j=cur;j<=end;j++){
						sum=a[j]+sum;
					}
					if(sum>max)
						max=sum;
				}		
			}
	}

