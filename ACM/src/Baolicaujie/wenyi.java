package Baolicaujie;

import java.util.Scanner;

public class wenyi {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s=new Scanner(System.in);
		long n=s.nextInt();
		long sum=0,l=0;
		for(long i=1;i<=n;i++){
			l+=i;
			sum+=l;
			}
		System.out.print(sum);
	}

}
