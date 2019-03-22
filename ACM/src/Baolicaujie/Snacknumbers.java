package Baolicaujie;

import java.util.Scanner;
/*蛇形填数
 * 在n*n方阵里填入1,2，。。。。n*n，按要求填充成蛇形
 * 输入方阵的维数n（n<=100）
 * 输出蛇形方阵
 * eg：
 * 3
 * 7	8	1
 * 6	9	2	
 * 5	4	3*/
public class Snacknumbers {
	static int a[][]=new int[101][101] ;
	static int n;
	static int i,j,l=1;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int x=0;
		i=0;
		j=n-1;
		dfs(0,n-1);
		for(int z=0;z<n;z++){
			for(int v=0;v<n;v++){
				System.out.print(a[z][v]+"      ");
			}
			System.out.println();
		}
	}
	public static void dfs(int u,int c){
		while((i<c)&&(j==c)){
			if(l!=1)
				i++;
			a[i][j]=l;
			l++;
		}
		while((i==c)&&(j>u)){//
			j--;
			a[i][j]=l;
			l++;	
		}
		while((j==u)&&(i>u)){
			i--;
			a[i][j]=l;
			l++;
		}
		while((i==u)&&(j<c-1)){
			j++;
			a[i][j]=l;
			l++;
		}
		if(u<c)
			dfs(u+1,c-1);
	}
}


