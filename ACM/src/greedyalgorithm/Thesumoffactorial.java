package greedyalgorithm;

import java.util.Scanner;
/*阶乘之和
时间限制：3000 ms  |  内存限制：65535 KB
难度：3
描述
给你一个非负数整数n，判断n是不是一些数（这些数不允许重复使用，且为正数）的阶乘之和，如9=1！+2!+3!，如果是，则输出Yes，否则输出No；
输入
第一行有一个整数0<m<100,表示有m组测试数据；
每组测试数据有一个正整数n<1000000;
输出
如果符合条件，输出Yes，否则输出No;
样例输入
2
9
10
样例输出
Yes
No*/
public class Thesumoffactorial {
	static boolean fact=false;
	static boolean v[];
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			int m=s.nextInt();
			v=new boolean[m];
			dfs(m,1,0);
			System.out.print(fact);
		}
	}
	public static int factorial(int a){
		int x=1;
		for(int i=2;i<=a;i++){
			x*=i;
		}
		return x;
	}
	public static void dfs(int m,int cur,int sum){
		if(sum==m){
			fact=true;
		}
		while(sum<m){
			if(!v[cur]){
				sum+=factorial(cur);
				v[cur]=true;
			}
			dfs(m,cur+1,sum);
			v[cur]=false;
		}
		
	} 
}/*import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int m,n;
n=sc.nextInt();
while(n-->0){
m=sc.nextInt();
if(Judge(m)){
System.out.println("Yes");
}else{
System.out.println("No");
}
}

}
public static boolean Judge(int m){//核心代码
int[] jc=Jc();
boolean flag=false;
for(int i=8;i>=0;i--){
if(m>=jc[i] && m>0){
m=m-jc[i];
}
if(m==0){
flag=true;
}
}
return flag;
}
public static int[] Jc(){
int[] jc=new int[9];
int temp=1;
for(int i=0;i<9;i++){
temp=temp*(i+1);
jc[i]=temp;
}
return jc;
}
}*/
