package sort;

import java.util.Scanner;
/*FOJ 1685 跑跑卡丁车
Accept: 470    Submit: 1232
Time Limit: 1000 mSec    Memory Limit : 32768 KB
  Problem Description
cigam在宿舍闲着没事，又玩起了跑跑卡丁车，为了到达终点，他需要通过m段路，在通过每段路时，他可以利用加速器来加快速度，每段路最多只能使用一个加速器，假设一个加速器的加速效果为a,则本来需要用b分钟通过的一段路，就只需要b/a分钟通过,现在他拥有n个加速器，每个加速器只能使用一次，请你计算一下他至少需要多长的时间才能到达终点
  Input
第一行有两个整数m和n (1<=n<=m<=1000)，表示共有m段路程，n个加速器
第二行有m个整数ai(1<=i<=m),分别表示通过第i段路所需要的时间(1<=ai<=10000)
第三行有n个整数bi(1<=i<=n),分别表示第i个加速器的加速效果(2<=bi<=50)
  Output
一个数代表他到达终点所需要的最少时间，精确到小数点后两位数
  Sample Input
2 2
10 20
2 4
3 2
1 5 2
2 3
  Sample Output
10.00
3.67

*/
public class CrazyracingKartrider {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		double time=0;
		int j;
		int m=s.nextInt();
		int n=s.nextInt();
		double a[]=new double [m];
		double b[]=new double [n];
		for(int i=0;i<m;i++){
			a[i]=s.nextDouble();
		}
		for(int i=0;i<n;i++){
			b[i]=s.nextDouble();
		}
		sort(a);
		sort(b);
		for(j=0;j<n&&j<m;j++)
			time+=a[j]/b[j];
		while(j<m){
			time+=a[j];
			j++;
			}
		System.out.println((double) (Math.round(time*100)/100.0) );
	}
	public static void sort(double a[]){
		double t;
		for(int i=0;i<a.length;i++){
			
			for(int j=a.length-1;j>0;j--){
				if(a[j]>a[j-1]){
					t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
				}
			}
			
		}
	}

}
