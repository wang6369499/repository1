package Baolicaujie;

import java.util.Scanner;

public class Thethreeorder {
/*三点顺序
时间限制：1000 ms  |  内存限制：65535 KB
难度：3
描述
现在给你不共线的三个点A,B,C的坐标，它们一定能组成一个三角形，现在让你判断A，B，C是顺时针给出的还是逆时针给出的？
输入
每行是一组测试数据，有6个整数x1,y1,x2,y2,x3,y3分别表示A,B,C三个点的横纵坐标。（坐标值都在0到10000之间）
输入0 0 0 0 0 0表示输入结束
输出
如果这三个点是顺时针给出的，请输出1，逆时针给出则输出0
样例输入
0 0 1 1 1 3
0 1 1 0 0 0
0 0 0 0 0 0
样例输出
0
1*/
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		double x1=s.nextDouble();
		double y1=s.nextDouble();
		double x2=s.nextDouble();
		double y2=s.nextDouble();
		double x3=s.nextDouble();
		double y3=s.nextDouble();
		double a=x1-x2;
		double b=y1-y2;
		double c=x1-x3;
		double d=y1-y3;
		if(a*d-c*b>0)
			System.out.print("1");
		else if(a*d-c*b<0)
			System.out.print("0");
	}

}//利用矢量叉积判断是逆时针还是顺时针
