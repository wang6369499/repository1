package main;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumber2 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		int j=1,i=0;
		while(i<n){
			if(i==n-1){
				System.out.println(a[i]+" "+j);
				break;
			}
			if(a[i]==a[i+1]){
				j++;
			}
			else{
				System.out.println(a[i]+" "+j);
				j=1;
			}
			i++;
		}
	}
}
