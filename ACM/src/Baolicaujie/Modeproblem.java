package Baolicaujie;

import java.util.Scanner;
/*��������
 * ����
 * ��һ��Ϊn,��ʾ��������������n<30��
 * ÿ����Եĵ�һ��������m����ʾ���ؼ�s�е�Ԫ�ظ���Ϊm��
 * ��������һ���и���m��m<100����������10�����Ȼ��
 * ��������ֲ�ͬԪ�س��ִ�����ͬ�������
 * ���
 * ÿ��������һ�У���������������һ�����������ڶ��������������м��ÿո������
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
		// TODO �Զ����ɵķ������
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
