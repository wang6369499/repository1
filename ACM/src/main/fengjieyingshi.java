package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fengjieyingshi {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		int a[]=new int[100000001]; 
		for(int q=2;q<100000001;q++){
			a[q]=q;
		}	
		for(int l=2;l<=10000;l++){
			if(a[l]!=0){
				for(int y=l*l;y<100000001;y+=l)
					a[y]=0;
			}
		}	
		for(int q=2;q<100000001;q++){
			if(a[q]!=0){
				list.add(q);
			}
		}
		while(s.hasNextInt()){
			int n=s.nextInt();
			int m=0;
			while(n!=1){
				if(n%list.get(m)==0){
					n/=list.get(m);
					System.out.print(list.get(m)+" ");
				}
				else{
					m++;
				}
			}
		}
	}
}
