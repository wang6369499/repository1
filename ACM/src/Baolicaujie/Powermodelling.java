package Baolicaujie;

import java.util.Scanner;

/*�η���ģ
ʱ�����ƣ�1000 ms  |  �ڴ����ƣ�65535 KB
�Ѷȣ�3
����
��a��b�η���cȡ���ֵ

 

����
��һ������һ������n��ʾ�������ݵ�������n<100��
ÿ�����ֻ��һ�У�����������������a,b,c(1=<a,b,c<=1000000000)
���
���a��b�η���cȡ��֮��Ľ��*/
public class Powermodelling {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n--!=0){
			long a=s.nextLong();
			long b=s.nextLong();
			long c=s.nextLong();
			System.out.println(pow(a,b,c));
		}
	}
	 public static long pow(long a,long n,long b)//����ֵ��a��n�η���bȡ����ֵ
	{
	    long result=1;
	    a=a%b;//����ȡ�����ȡ��Ļ�ȡ��
	    while(n>0)
	    {
	        if(n%2==1)
	            result=result*a%b;//n�������Ļ���Ҫ���һ��
	        n=n/2;//����
	        a=a*a%b;//����ȡ�����ȡ��Ļ�ȡ��
	    }
	    return result;
	}
}
//����Ӧע��һ����n�η����׳������ޣ������������һ�δγ˻����ӻ��ٶȣ�����Ӧ�ö��������
