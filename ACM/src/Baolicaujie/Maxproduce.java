package Baolicaujie;
/*����n��Ԫ����ɵ�����s������Ҫ�ҳ�һ���˻��������������С�����˻�����
 ������Ӧ���-1 */

import java.util.Arrays;
import java.util.Scanner;

public class Maxproduce {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long max=1;
		long a[]=new long[n],b[]=new long[n],c[]=new long[n];
		int i=0,j=0,k=0;
		while(i<n){
			a[i]=s.nextLong();
			if(a[i]>0){
				b[j]=a[i];
				j++;
			}
			else{
				c[k]=a[i];
				k++;
			}
			i++;
		}
		Arrays.sort(b);
		Arrays.sort(c);
		for(int y=0;y<j;y++)
			max=b[b.length-1-y]*max;
		if(k%2==0){
			for(int y=0;y<k;y++)
			max=c[y]*max;
		}
		else {
			for(int y=0;y<k-1;y++)
			max=c[y]*max;
		}
		if(max<0)
			max=-1;
		System.out.println(max);
	}
}
