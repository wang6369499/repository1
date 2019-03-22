package sort;


import java.util.Scanner;
/*众数问题
 * 输入
 * 第一行为n,表示测试数据组数（n<30）
 * 每组测试的第一行是整数m，表示多重集s中的元素个数为m、
 * 接下来的一行中给出m（m<100）个不大于10万的自然数
 * （不会出现不同元素出现次数相同的情况，
 * 输出
 * 每组测试输出一行，包含两个数，第一个是众数，第二个是其重数，中间用空格隔开）
 * eg
 * 1
 * 6	
 * 1	2	2	2	3	5
 * 2	3*/

public class Modeproblem{
	public static int [] sort(int a[],int b[],int min,int max){
		
		int j=0;
		for(int i=0;i<a.length;i++){
			a[i]-=min;
			b[a[i]]++;
		}
		return b;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			int m=s.nextInt(),max,min;
			int a[]=new int [m];
			a[0]=s.nextInt();
			max=a[0];
			min=a[0];
			int x,y;
			for(int j=1;j<m;j++){
				a[j]=s.nextInt();
				if(a[j]>max)
					max=a[j];
				if(a[j]<min)
					min=a[j];
			}
			int[] b=new int [max-min+1];
			b=sort(a,b,min,max);
			x=b[0];
			y=0;
			for(int k=0;k<b.length;k++){
				if(x<b[k]){
					x=b[k];
					y=k;
				}
			}
			System.out.println(y+min+" "+x);
		}
	}
}
