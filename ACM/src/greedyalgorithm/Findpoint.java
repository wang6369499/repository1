package greedyalgorithm;

import java.util.Scanner;

public class Findpoint {
/*找点
时间限制：2000 ms  |  内存限制：65535 KB
难度：2
描述
上数学课时，老师给了LYH一些闭区间，让他取尽量少的点，使得每个闭区间内至少有一个点。但是这几天LYH太忙了，你们帮帮他吗？
输入
多组测试数据。
每组数据先输入一个N，表示有N个闭区间（N≤100)。
接下来N行，每行输入两个数a，b(0≤a≤b≤100），表示区间的两个端点。
输出
输出一个整数，表示最少需要找几个点。
样例输入
4
1 5
2 4
1 4
2 3
3
1 2
3 4
5 6
1
2 2
样例输出
1
3
1
*/
	static int a[],b[];
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
	public static void compare(int a[],int b[]){
		int t,r;
		for(int i=0;i<a.length-1;i++){
			if(a[i]==a[i+1]){
				if(b[i]<b[i+1]){
					t=a[i];
					r=b[i];
					b[i]=b[i+1];
					b[i+1]=r;
					a[i]=a[i+1];
					a[i+1]=t;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),min,sum=0;
		a=new int [n];
		b=new int [n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			b[i]=s.nextInt();
		}
		sort(b,a);
		compare(b,a);
		for(int i=0;i<n;i++){
			if(b[i]>0){
				min=b[i];
				for(int j=i+1;j<n;j++){
					if(a[j]>min)
						break;
					else
						b[j]=-1;
				}
				sum++;
			}
		}
		System.out.println(sum);
	}

}
