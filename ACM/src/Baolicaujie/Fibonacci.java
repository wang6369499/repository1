package Baolicaujie;

import java.util.Scanner;
//ok
public class Fibonacci { 
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n,j;
		n=s.nextInt(); 
		int a[]=new int[10000];
		a[1]=a[0]=1;
		for(j=2;j<20;j++){
			a[j]=a[j-1]+a[j-2];
			}
		for(j=0;j<20;j++){
			if(n==a[j]){
				System.out.println(j+1);
				break;
				}
		}
		
	}

}
