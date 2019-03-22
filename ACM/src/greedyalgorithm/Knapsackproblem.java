package greedyalgorithm;

import java.util.Scanner;

public class Knapsackproblem {
	static int v[],m[];
/*背包问题
 * 
时间限制：3000 ms  |  内存限制：65535 KB
难度：3
描述
现在有很多物品（它们是可以分割的），我们知道它们每个物品的单位重量的价值v和重量w（1<=v,w<=10）；如果给你一个背包它能容纳的重量为m（10<=m<=20）,你所要做的就是把物品装到背包里，使背包里的物品的价值总和最大。
输入
第一行输入一个正整数n（1<=n<=5）,表示有n组测试数据；
随后有n测试数据，每组测试数据的第一行有两个正整数s，m（1<=s<=10）;s表示有s个物品。接下来的s行每行有两个正整数v，w。
输出
输出每组测试数据中背包内的物品的价值和，每次输出占一行。
样例输入
1
3 15
5 10
2 8
3 9
样例输出
65
*/
	public static void sort(int a[],int b[]){//插入排序（升序排列）
		int t,r;
		for(int i=1;i<a.length;i++){
			t=a[i];
			r=b[i];
			int j;
			for(j=i-1;j>=0;j--){
				if(a[j]>t){
					a[j+1]=a[j];
					b[j+1]=b[j];
				}
				else
					break;
			}
			a[j+1]=t;
			b[j+1]=r;
			
		}
	} 
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),sum=0;
		for(int i=0;i<n;i++){
			int x=s.nextInt();
			int limit=s.nextInt();
			v=new int[x];
			m=new int[x];
			for(int j=0;j<x;j++){
				v[j]=s.nextInt();
				m[j]=s.nextInt();
			}
			sort(v,m);
			int k=x-1;
			while(limit>0){
				if(limit-m[k]<0){
					sum+=v[k]*limit;
					break;
				}
				limit-=m[k];
				sum+=m[k]*v[k];
				k--;
			}
			System.out.println(sum);
		}
	}

}
