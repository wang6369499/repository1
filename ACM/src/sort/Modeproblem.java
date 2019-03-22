package sort;


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

public class Modeproblem{
	public static int [] sort(int a[],int b[],int min,int max){
		
		int j=0;
		for(int i=0;i<a.length;i++){
			a[i]-=min;
			b[a[i]]++;
		}
		return b;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			int m=s.nextInt(),max,min;
			int a[]=new int [m];
			a[0]=s.nextInt();
			max=a[0];
			min=a[0];
			int x,y;
			for(int j=1;j<m;j++){
				a[j]=s.nextInt();
				if(a[j]>max)
					max=a[j];
				if(a[j]<min)
					min=a[j];
			}
			int[] b=new int [max-min+1];
			b=sort(a,b,min,max);
			x=b[0];
			y=0;
			for(int k=0;k<b.length;k++){
				if(x<b[k]){
					x=b[k];
					y=k;
				}
			}
			System.out.println(y+min+" "+x);
		}
	}
}
