package Baolicaujie;

import java.util.Scanner;

public class Thethreeorder {
/*����˳��
ʱ�����ƣ�1000 ms  |  �ڴ����ƣ�65535 KB
�Ѷȣ�3
����
���ڸ��㲻���ߵ�������A,B,C�����꣬����һ�������һ�������Σ����������ж�A��B��C��˳ʱ������Ļ�����ʱ������ģ�
����
ÿ����һ��������ݣ���6������x1,y1,x2,y2,x3,y3�ֱ��ʾA,B,C������ĺ������ꡣ������ֵ����0��10000֮�䣩
����0 0 0 0 0 0��ʾ�������
���
�������������˳ʱ������ģ������1����ʱ����������0
��������
0 0 1 1 1 3
0 1 1 0 0 0
0 0 0 0 0 0
�������
0
1*/
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s=new Scanner(System.in);
		double x1=s.nextDouble();
		double y1=s.nextDouble();
		double x2=s.nextDouble();
		double y2=s.nextDouble();
		double x3=s.nextDouble();
		double y3=s.nextDouble();
		double a=x1-x2;
		double b=y1-y2;
		double c=x1-x3;
		double d=y1-y3;
		if(a*d-c*b>0)
			System.out.print("1");
		else if(a*d-c*b<0)
			System.out.print("0");
	}

}//����ʸ������ж�����ʱ�뻹��˳ʱ��
