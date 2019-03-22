package Baolicaujie;

import java.util.Scanner;

public class choose {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		double b=s.nextDouble();
		int n=0;
		int A=(int)a;
		for(;a>=0;a--){
			int B=(int)((a*b-a*A)/b);
			for(int i=0;i<=B;i++)
				n++;
		}
		if(n>=100)
			System.out.println("yes");
		else
			System.out.println("No");
	}

}
