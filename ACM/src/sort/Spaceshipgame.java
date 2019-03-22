package sort;
/* FOJ 1021 飞船赛
Accept: 2057    Submit: 8172
Time Limit: 1000 mSec    Memory Limit : 32768 KB
  Problem Description
有N个飞船进行比赛，它们的跑道为直线并互相平行。每个飞船的起跑位置均不相同。第i个飞船从起跑线右边Xi处开始向右行驶（Xi各不相同）。比赛开始后，它能在零时间内加速到最大速度Vi并永远保持此速度。比赛没有终点，即会永远进行下去。
 
你的任务是算出比赛过程中一共有多少次"超车"。
  Input
输入数据由多组数据组成。每组数据格式如下：
第一行为一个整数N（1<=N<=250000）。
接下来的N行，每行两个整数Xi (0≤Xi≤10^6)和Vi(0<Vi<100)，描述了一辆飞船的起跑位置和最大速度。
给出的飞船信息按照起跑位置Xi的升序排列，即X1<X2<X3<…<Xn。
最后一组数据N=0，标志输入结束，不需要处理。
  Output

对于每组数据，输出仅一行包含一个整数，即"超车"的次数对1000000的模。
  Sample Input
4
0 2
2 1
3 8
6 3
0
  Sample Output
2
*/
import java.util.Scanner;

public class Spaceshipgame {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int max;
		int a[]=new int [n+1];
		int b[]=new int [n];
		for(int i=0;i<=n;i++){
			a[i]=s.nextInt();
			if(a[i]==0&&i>=n)
				break;
			b[i]=s.nextInt();
			
		}
		System.out.println(sort(b,0));
	}
	public static int sort(int a[],int b){
		int max,t;
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					b++;
				}
			}
			
		}
		return b;
	}
}