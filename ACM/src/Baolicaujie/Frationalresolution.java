package Baolicaujie;
/*输入正整数k，找到所有的正整数x>=y，使得1/k=1/x+1/y*/
import java.util.Scanner;

public class Frationalresolution {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int o=0;
		for(int i=n+1;i<=2*n;i++){
			double x=(i*n+0.0)/(i-n);
			int y=(int)x;
			if(y==x){
				System.out.println("1/"+n+"="+"1/"+i+"+1/"+y);
				o++;
			}
		}
		System.out.println(o);
	}

}
