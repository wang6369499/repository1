package Baolicaujie;

import java.util.Scanner;
/*����
��һ¥�ݹ�m�����տ�ʼʱ���ڵ�һ������ÿ��ֻ�ܿ���һ���������Ҫ���ϵ�m�������ж����߷���

ע���涨��һ����һ����0���߷���

����
�����������Ȱ���һ������n(1<=n<=100)����ʾ����ʵ���ĸ�����Ȼ����n�����ݣ�ÿ�а���һ������m����1<=m<=40), ��ʾ¥�ݵļ�����
���
����ÿ������ʵ�����������ͬ�߷���������
��������
2
2
3
�������
1
2*/
public class Superstep {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
//����ÿ��̨���߷���������쳲���������ϵ
