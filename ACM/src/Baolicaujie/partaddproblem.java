package Baolicaujie;
/*部分和问题
 * 给定整数a1，a2....an，判断是否可以从中选出若干数，使其和恰为k*/
import java.util.Scanner;

public class partaddproblem {
	static int n,k;
	static int[] a=new int[20];
	static int[] b=new int[20];
	public partaddproblem() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		if(dfs(0,0)){
			System.out.println("yes");
			for(int i=0;i<n;i++)
				if(b[i]==1)
					System.out.print(a[i]+" ");
		}
	}
	public static boolean dfs(int cur,int sum){
		if(n==cur)
			return sum==k;
		if(dfs(cur+1,sum)){
			b[cur]=0;
			return true;
		}
		if(dfs(cur+1,sum+a[cur])){
			b[cur]=1;
			return true;
		}
		return false;
	}
}
