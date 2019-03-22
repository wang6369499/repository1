package sort;
/* FOJ 1021 �ɴ���
Accept: 2057    Submit: 8172
Time Limit: 1000 mSec    Memory Limit : 32768 KB
  Problem Description
��N���ɴ����б��������ǵ��ܵ�Ϊֱ�߲�����ƽ�С�ÿ���ɴ�������λ�þ�����ͬ����i���ɴ����������ұ�Xi����ʼ������ʻ��Xi������ͬ����������ʼ����������ʱ���ڼ��ٵ�����ٶ�Vi����Զ���ִ��ٶȡ�����û���յ㣬������Զ������ȥ��
 
����������������������һ���ж��ٴ�"����"��
  Input
���������ɶ���������ɡ�ÿ�����ݸ�ʽ���£�
��һ��Ϊһ������N��1<=N<=250000����
��������N�У�ÿ����������Xi (0��Xi��10^6)��Vi(0<Vi<100)��������һ���ɴ�������λ�ú�����ٶȡ�
�����ķɴ���Ϣ��������λ��Xi���������У���X1<X2<X3<��<Xn��
���һ������N=0����־�������������Ҫ����
  Output

����ÿ�����ݣ������һ�а���һ����������"����"�Ĵ�����1000000��ģ��
  Sample Input
4
0 2
2 1
3 8
6 3
0
  Sample Output
2
*/
import java.util.Scanner;

public class Spaceshipgame {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int max;
		int a[]=new int [n+1];
		int b[]=new int [n];
		for(int i=0;i<=n;i++){
			a[i]=s.nextInt();
			if(a[i]==0&&i>=n)
				break;
			b[i]=s.nextInt();
			
		}
		System.out.println(sort(b,0));
	}
	public static int sort(int a[],int b){
		int max,t;
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					b++;
				}
			}
			
		}
		return b;
	}
}