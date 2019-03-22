package sort;

import java.util.Scanner;
/*1550 ��ķ���
Accept: 348    Submit: 695
Time Limit: 1000 mSec    Memory Limit : 32768 KB
  Problem Description
����һ����Ȼ��N��
��дһ�����������������ĸС�ڵ���N�ļ�Լ�������
  Input
�����������������ݣ��봦��EOF������
ÿ�����ݰ���,һ����Ȼ��N��1<=N<=160����
  Output
ÿ����������ռһ�С�
  Sample Input
5
  Sample Output
0/1
1/5
1/4
1/3
2/5
1/2
3/5
2/3
3/4
4/5
1/1
*/
public class Pigsscore {
	public static void main(String args[]){
		double min;
		int imin = 1;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n+1];
		for(int i=0;i<=n;i++){
			a[i]=0;
		}
		min=(a[0]+0.0)/1;
		while(a[1]!=2){
			min=(a[1]+0.0)/1;
			imin=1;
			for(int i=1;i<=n;i++){
				if(min>((a[i]+0.0)/i)){
					min=((a[i]+0.0)/i);
					imin=i;
				}
			}
			System.out.println(a[imin]+"/"+imin);
			for(int i=1;i<=n;i++){
				if(min==((a[i]+0.0)/i))
					a[i]++;
			}
		}
	}
}
