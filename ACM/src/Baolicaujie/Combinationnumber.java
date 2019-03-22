package Baolicaujie;

import java.util.Scanner;
//???????/
public class Combinationnumber {
	static int n,r,x=0;
	static int a[]=new int[10];
	static boolean b[]=new boolean[10];
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		r=s.nextInt();
		int p;
		int c[]=new int[r];
		for(int i=1;i<=n;i++){
			a[i]=i;
			b[i]=true;
		}
		while(n==0){
			p=0;
			for(int j=5;j>0;j--){
				if(b[j]){
					c[p]=j;
					b[j]=false;
					p++;
				}					
				if(p==r-1){
					break;
				}	
			}
		}
	}

}

