package Baolicaujie;

import java.util.Scanner;

public class zerooffactorial {
/*����
����n!��ʮ���Ʊ�ʾ����ж��ٸ�0
����
��һ������һ������N��ʾ�������ݵ�����(1<=N<=100)ÿ���������ռһ�У���ֻ��һ������M(0<=M<=10000000)
���
���M�Ľ׳˵�ʮ���Ʊ�ʾ�����0�ĸ�������5!=120������0�ĸ���Ϊ1
��������
6
3
60
100
1024
23456
8735373
�������
0
14
24
253
5861
2183837*/
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			int m=s.nextInt();
			int x=0;
			for(int j=0;j<=m;j++){
				int h=j;
				while(h!=0){
					if(h%5!=0){
						break;
					}
					else{
						x++;
						h=h/5;
					}
				}
			}
			System.out.println(x);
		}
	}
}
//����Ҫ��0�ĸ�����ʵ��ֻ����1-n֮������ж����ܱ�5�����������ܱ����Ŀ��Ա����ٸ�5����

