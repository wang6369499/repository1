package Baolicaujie;

import java.util.Scanner;

public class comingdangerous {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int x,y;
		x=(int)(n-4*m)/2;
		y=(int)(6*m-n)/2;
		if((x*6+y*4!=n)||x<0||y<0){
			System.out.println("impossible");
		}
		else 
			System.out.println(x+" Ghouls\n"+y+" Crypt Fiends");
	}

}
