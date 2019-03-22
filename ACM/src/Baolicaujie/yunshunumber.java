package Baolicaujie;

import java.util.Scanner;

public class yunshunumber {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		for(int x=1;x<=n;x++)
			if(n%x==0)
				i++;
		System.out.println(i);
	}

}
