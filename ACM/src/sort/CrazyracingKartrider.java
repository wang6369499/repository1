package sort;

import java.util.Scanner;
/*FOJ 1685 ���ܿ�����
Accept: 470    Submit: 1232
Time Limit: 1000 mSec    Memory Limit : 32768 KB
  Problem Description
cigam����������û�£������������ܿ�������Ϊ�˵����յ㣬����Ҫͨ��m��·����ͨ��ÿ��·ʱ�����������ü��������ӿ��ٶȣ�ÿ��·���ֻ��ʹ��һ��������������һ���������ļ���Ч��Ϊa,������Ҫ��b����ͨ����һ��·����ֻ��Ҫb/a����ͨ��,������ӵ��n����������ÿ��������ֻ��ʹ��һ�Σ��������һ����������Ҫ�೤��ʱ����ܵ����յ�
  Input
��һ������������m��n (1<=n<=m<=1000)����ʾ����m��·�̣�n��������
�ڶ�����m������ai(1<=i<=m),�ֱ��ʾͨ����i��·����Ҫ��ʱ��(1<=ai<=10000)
��������n������bi(1<=i<=n),�ֱ��ʾ��i���������ļ���Ч��(2<=bi<=50)
  Output
һ���������������յ�����Ҫ������ʱ�䣬��ȷ��С�������λ��
  Sample Input
2 2
10 20
2 4
3 2
1 5 2
2 3
  Sample Output
10.00
3.67

*/
public class CrazyracingKartrider {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s=new Scanner(System.in);
		double time=0;
		int j;
		int m=s.nextInt();
		int n=s.nextInt();
		double a[]=new double [m];
		double b[]=new double [n];
		for(int i=0;i<m;i++){
			a[i]=s.nextDouble();
		}
		for(int i=0;i<n;i++){
			b[i]=s.nextDouble();
		}
		sort(a);
		sort(b);
		for(j=0;j<n&&j<m;j++)
			time+=a[j]/b[j];
		while(j<m){
			time+=a[j];
			j++;
			}
		System.out.println((double) (Math.round(time*100)/100.0) );
	}
	public static void sort(double a[]){
		double t;
		for(int i=0;i<a.length;i++){
			
			for(int j=a.length-1;j>0;j--){
				if(a[j]>a[j-1]){
					t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
				}
			}
			
		}
	}

}
