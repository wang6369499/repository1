package Baolicaujie;

import java.util.Arrays;
import java.util.Scanner;
//??????????/
public class pengwaterthingone {
	static double o=20;
	public static void main(String[] args) {
		// 	TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		for(int i=0;i<m;i++){
			int n=s.nextInt();
			double a[]=new double[n];
			for(int j=0;j<n;j++){
				a[j]=s.nextDouble();
			}
			int x=0;
			Arrays.sort(a);
			while(a[x]>Math.sqrt(2)){
				double w=o-a[x];
				if(w<=0)
					System.out.println(x+1);
				x++;
			}
		}
	}

}
