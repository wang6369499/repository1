package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n!=0){
			int m=s.nextInt();
			int a[]=new int[m];
			for(int i=0;i<m;i++){
				a[i]=s.nextInt();
			}
			Arrays.sort(a);
			int max=1,j=1;
			for(int i=0;i<m-1;i++){
				if(a[i]==a[i+1]){
					j++;
				}
				else{
					if(max<j){
						max=j;
					}
					j=1;
				}
			}
			System.out.println(max);
			n--;
		}
	}
}
