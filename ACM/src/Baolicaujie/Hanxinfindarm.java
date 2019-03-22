package Baolicaujie;

import java.util.Scanner;

public class Hanxinfindarm {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		for(int i=10;i<=100;i++){
			if(i%3==a&&i%5==b&&i%7==c){
				System.out.println(i);
			}
		}
	}

}
