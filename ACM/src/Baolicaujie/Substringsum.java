package Baolicaujie;

import java.util.Scanner;
/*�Ӵ���
 * ����һ��������{a1��a2������an}���ҳ������ǿ��Ӵ�{ax��ax-1������ay}��ʹ�������к��������
 * 1<=x<=y<=n
 * ����
 * ��һ����һ������N��N<=10����ʾ��������
 * ÿ��������ĵ�һ
 * ����һ������n��ʾ�����й���n�����������һ������n������l(-100=<l<=100),
 * ��ʾ�����е�����Ԫ�أ�0<=n<=1000000��
 * ���
 * ����ÿ�����������������������Ӵ���
 * eg
 * 1
 * 5	
 * 1	2	-1	3	-2*/
public class Substringsum {
	static int a[]=new int [1000000];
	static int max,n,sum;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int j=0;j<N;j++){
			n=s.nextInt();
			for(int i=0;i<n;i++)
				a[i]=s.nextInt();
				max=a[0];
				for(int h=0;h<n;h++)
					dfs(h);
				System.out.print(max);
			
		}
	}
	public static void dfs(int cur){
				for(int end=n-1;end>=cur;end--){
					sum=0;
					for(int j=cur;j<=end;j++){
						sum=a[j]+sum;
					}
					if(sum>max)
						max=sum;
				}		
			}
	}

