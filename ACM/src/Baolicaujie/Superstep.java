package Baolicaujie;

import java.util.Scanner;
/*描述
有一楼梯共m级，刚开始时你在第一级，若每次只能跨上一级或二级，要走上第m级，共有多少走法？

注：规定从一级到一级有0种走法。

输入
输入数据首先包含一个整数n(1<=n<=100)，表示测试实例的个数，然后是n行数据，每行包含一个整数m，（1<=m<=40), 表示楼梯的级数。
输出
对于每个测试实例，请输出不同走法的数量。
样例输入
2
2
3
样例输出
1
2*/
public class Superstep {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int [40];
		arr[1]=1;
		arr[2]=2;
		for(int i=3;i<40;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		while(n-->0){
			int N=s.nextInt();
			System.out.println(arr[N-1]);
		}
		
	}
	
}
//此题每节台阶走法总数符合斐波那契数关系
