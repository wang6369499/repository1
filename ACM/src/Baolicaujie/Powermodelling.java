package Baolicaujie;

import java.util.Scanner;

/*次方求模
时间限制：1000 ms  |  内存限制：65535 KB
难度：3
描述
求a的b次方对c取余的值

 

输入
第一行输入一个整数n表示测试数据的组数（n<100）
每组测试只有一行，其中有三个正整数a,b,c(1=<a,b,c<=1000000000)
输出
输出a的b次方对c取余之后的结果*/
public class Powermodelling {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n--!=0){
			long a=s.nextLong();
			long b=s.nextLong();
			long c=s.nextLong();
			System.out.println(pow(a,b,c));
		}
	}
	 public static long pow(long a,long n,long b)//返回值是a的n次方对b取余后的值
	{
	    long result=1;
	    a=a%b;//积的取余等于取余的积取余
	    while(n>0)
	    {
	        if(n%2==1)
	            result=result*a%b;//n是奇数的话就要多乘一次
	        n=n/2;//二分
	        a=a*a%b;//积的取余等于取余的积取余
	    }
	    return result;
	}
}
//此题应注意一个数n次方后易超出界限，并且如果单纯一次次乘积会延缓速度，这里应用二分求更快
