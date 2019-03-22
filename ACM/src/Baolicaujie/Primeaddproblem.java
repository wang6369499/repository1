package Baolicaujie;

import java.util.Scanner;

public class Primeaddproblem {
	static int a[]=new int[1002];
	static int b[]=new int[1002];
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=0;i<n;i++){
			b[i]=s.nextInt();
		}
		for(int i=0;i<1000;i++)
			a[i]=i;
		choose();
		for(int i=0;i<n;i++){
			if(a[i]!=0)
				sum+=a[i];
		}
		System.out.println(sum);
		}
	public static void choose(){
		int i,j;
		a[1]=0;
		for(i=2;i<1000;i++){
			if(a[i]!=0)
				for(j=i*2;j<1000;j+=i)
					a[i]=0;
		}
	}
}
