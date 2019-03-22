package Baolicaujie;

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
public class Modeproblem {
	static int a[];
	static boolean d[];
	static int b=0;
	static int c,max,imax;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			max=0;
			int m=s.nextInt();
			a=new int[m];
			d=new boolean[m];
			for(int j=0;j<m;j++){
				a[j]=s.nextInt();
				d[j]=false;
			}
			imax=a[0];
			for(int k=0;k<m;k++){
				b=a[k];
				c=0;
				if(d[k])
					continue;
				for(int l=k;l<m;l++){
					if(b==a[l]){
						c++;
						d[l]=true;
					}
				}
				if(max<=c){
					max=c;
					
						if(max==c)
						a[k]=compare(imax,a[k]);
						imax=a[k];
				}
			}
			System.out.print(imax+"      "+max);
		}
	}
	public static int compare(int a,int b){
		if(a>b)
			return b;
		else
			return a;
	}
}
