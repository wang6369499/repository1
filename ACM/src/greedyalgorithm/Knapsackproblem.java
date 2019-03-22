package greedyalgorithm;

import java.util.Scanner;

public class Knapsackproblem {
	static int v[],m[];
/*��������
 * 
ʱ�����ƣ�3000 ms  |  �ڴ����ƣ�65535 KB
�Ѷȣ�3
����
�����кܶ���Ʒ�������ǿ��Էָ�ģ�������֪������ÿ����Ʒ�ĵ�λ�����ļ�ֵv������w��1<=v,w<=10�����������һ�������������ɵ�����Ϊm��10<=m<=20��,����Ҫ���ľ��ǰ���Ʒװ�������ʹ���������Ʒ�ļ�ֵ�ܺ����
����
��һ������һ��������n��1<=n<=5��,��ʾ��n��������ݣ�
�����n�������ݣ�ÿ��������ݵĵ�һ��������������s��m��1<=s<=10��;s��ʾ��s����Ʒ����������s��ÿ��������������v��w��
���
���ÿ����������б����ڵ���Ʒ�ļ�ֵ�ͣ�ÿ�����ռһ�С�
��������
1
3 15
5 10
2 8
3 9
�������
65
*/
	public static void sort(int a[],int b[]){//���������������У�
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
		// TODO �Զ����ɵķ������
		
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
