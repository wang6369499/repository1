package Baolicaujie;

import java.util.Scanner;
/*水池数目
 * 第一行输入一个整数N，表示共有N组数据
 * 每一组数据都是先输入该地图的行数m（0<m<100)与列数n（0<n<100），然后输入接下来的m行每行n个数
 * （1代表水池，0代表地面）
 * 输出该地图水池的个数
 * 注意：每个水池的上下左右四个位置如果是水池的话，看成同一个水池
 * eg
 * 2
 * 3	4
 * 1	0	0	0
 * 0	0	1	1
 * 1	1	1	0
 * 输出2
 * 5	5	
 * 1	1	1	1	0
 * 0	0	1	0	1
 * 0	0	0	0	0
 * 1	1	1	0	0
 * 0	0	1	1	1*/
public class Numberofpools {
	static int m,n,b;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=0;i<N;i++){
			m=s.nextInt();
			n=s.nextInt();
			b=0;
			int [][]a=new int [m][n];
			for(int j=0;j<m;j++){
				for(int k=0;k<n;k++){
					a[j][k]=s.nextInt();
				}
			}
			for(int j=0;j<m;j++){
				for(int k=0;k<n;k++){
					if(dfs(j,k,a))
						b++;
				}
			}
			System.out.println(b);
		}
	}
	public static boolean dfs(int l,int p,int a[][]){
		if(a[l][p]!=0){
			a[l][p]=0;
			if(p<n-1)
				dfs(l,p+1,a);
			if(l<m-1)
				dfs(l+1,p,a);
			if(l!=0)
				dfs(l-1,p,a);
			if(p!=0)
				dfs(l,p-1,a);
			
			return true;
		}
		else 
			return false;
	}
}
	


