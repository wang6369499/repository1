package greedyalgorithm;

import java.util.Scanner;

/*��ľ���ϵ�����
ʱ�����ƣ�3000 ms  |  �ڴ����ƣ�65535 KB
�Ѷȣ�2
����
����һ�ζ�ľ�۵����л����ľ�ۿ����ڸۿ��⵽������֮��û������һ����ľ�����ֻ�ܳ��������ˣ��ҳ˿͵����������ܳ�����ľ�۵���������������Ҫ����������λ�еĻ���������Ҫ�ҳ����԰��������ÿ͵����ٵĶ�ľ��������������дһ�����򣬶����ľ�۵������������ÿ���Ŀ��ÿλ�ÿ͵����������ݸ����Ĺ��򣬼���Ҫ���������ÿͱ�������ٵĶ�ľ������������������
����
��һ������s,��ʾ�������ݵ�������
ÿ�����ݵĵ�һ�а�����������w��n��80<=w<=200,1<=n<=300��wΪһ����ľ�۵���������,nΪ������
��������һ������Ϊÿ���˵����������ܴ��ڴ��ĳ���������
���
ÿ����������Ҫ�����ٶ�ľ�۵�������
��������
3
85 6
5 84 85 80 84 83
90 3
90 45 60
100 5
50 50 90 40 60
�������
5
3
3
*/
public class Thecanoeonthetrip {
	
		public static void sort(int a[]){//���������������У�
			int t;
			for(int i=1;i<a.length;i++){
				t=a[i];
				int j;
				for(j=i-1;j>=0;j--){
					if(a[j]>t){
						a[j+1]=a[j];
					}
					else
						break;
				}
				a[j+1]=t;
				
			}
		} 
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m;
		int limit,min,max;
		int sum[]=new int [n];
		int a[];
		for(int i=0;i<n;i++){
			limit=s.nextInt();
			m=s.nextInt();
			a=new int[m];
			for(int j=0;j<m;j++){
				a[j]=s.nextInt();
			}
			sort(a);
			max=m-1;
			min=0;
			while(max>min){
				if((a[max]+a[min])<=limit){
					a[max]=0;
					a[min]=0;
					sum[i]++;
					max-=1;
					min+=1;
				}
				else
					max-=1;
			}
			for(int in:a){
				if(in!=0)
					sum[i]++;
			}
		}
		for(int summ:sum){
			System.out.println(summ);
		}
	}
}
