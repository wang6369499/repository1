package greedyalgorithm;

import java.util.Scanner;

public class Findpoint {
/*�ҵ�
ʱ�����ƣ�2000 ms  |  �ڴ����ƣ�65535 KB
�Ѷȣ�2
����
����ѧ��ʱ����ʦ����LYHһЩ�����䣬����ȡ�����ٵĵ㣬ʹ��ÿ����������������һ���㡣�����⼸��LYH̫æ�ˣ����ǰ������
����
����������ݡ�
ÿ������������һ��N����ʾ��N�������䣨N��100)��
������N�У�ÿ������������a��b(0��a��b��100������ʾ����������˵㡣
���
���һ����������ʾ������Ҫ�Ҽ����㡣
��������
4
1 5
2 4
1 4
2 3
3
1 2
3 4
5 6
1
2 2
�������
1
3
1
*/
	static int a[],b[];
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
	public static void compare(int a[],int b[]){
		int t,r;
		for(int i=0;i<a.length-1;i++){
			if(a[i]==a[i+1]){
				if(b[i]<b[i+1]){
					t=a[i];
					r=b[i];
					b[i]=b[i+1];
					b[i+1]=r;
					a[i]=a[i+1];
					a[i+1]=t;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),min,sum=0;
		a=new int [n];
		b=new int [n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			b[i]=s.nextInt();
		}
		sort(b,a);
		compare(b,a);
		for(int i=0;i<n;i++){
			if(b[i]>0){
				min=b[i];
				for(int j=i+1;j<n;j++){
					if(a[j]>min)
						break;
					else
						b[j]=-1;
				}
				sum++;
			}
		}
		System.out.println(sum);
	}

}
