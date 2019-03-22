package Baolicaujie;

import java.util.Scanner;

public class Happyxiaoming {
	static int []v;
	static int []w;
	static boolean []a;
	static int N,n,k,max=0,sum=0;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			Scanner s=new Scanner(System.in);
			N=s.nextInt();
			for(int i=0;i<N;i++){
				n=s.nextInt();
				k=s.nextInt();
				for(int j=0;j<k;j++){
					v[j]=s.nextInt();
					w[j]=s.nextInt();
					a[j]=true;
				}
				dfs(0);
			}
	}
	public static void dfs(int cur){
		if(cur==k){
			System.out.println(max);
		}
		else{
			for(int i=cur;sum<n;i++){
				if(a[i]){
					sum+=v[i];
					max+=v[i]*w[i];
					a[i]=false;
				}
			}
			}
	}

}
