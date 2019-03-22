package sort;

import java.util.Scanner;
/*地震预测
Accept: 379    Submit: 2049
Time Limit: 1500 mSec    Memory Limit : 32768 KB
  Problem Description
怀特先生是一名研究地震的科学家，最近他发现如果知道某一段时间内的地壳震动能量采样的最小波动值之和，可以有效地预测大地震的发生。
假设已知一段时间的n次地壳震动能量的采样值为a1,a2,…an，那么第i 次采样的最小波动值为min{|ai-aj| | i<j<=n}，即第i 次采样的最小波动值是其后n-i次采样值与第i次采样值之差的绝对值中最小的值，特别地，第n次采样的最小波动值为an。
请编写一个程序计算这n次采样的最小波动值之和。
  Input
本题有多组输入数据，你必须处理到EOF为止
输入数据第一行有一个数n(1<=n<=105) ,表示采样的次数。
第二行有n个整数，表示n次地壳震动能量的采样值a1,a2,…an (0<=ai<=107 )。
  Output
输出n次采样的最小波动值之和。
  Sample Input
4
2 0 3 10
  Sample Output
21
*/
public class Earthquakeprediction {
	static int n,min,m;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println(dfs(a,0,0));
	}
	public static int dfs(int a[],int cur,int sum){
		for(int i=0;i<n;i++){
			if(i==n-1){
				sum+=a[n-1];
			}
			else
				{
				min=Math.abs(a[i]-a[i+1]);
				for(int j=i+1;j<n-1;j++){
					m=Math.abs(a[i]-a[j+1]);
					if(min>m){
						min=m;
					}
				}
				sum+=min;
			}
		}
		return sum;
	}
}
