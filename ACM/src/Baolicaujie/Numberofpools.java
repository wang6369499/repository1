package Baolicaujie;

import java.util.Scanner;
/*ˮ����Ŀ
 * ��һ������һ������N����ʾ����N������
 * ÿһ�����ݶ���������õ�ͼ������m��0<m<100)������n��0<n<100����Ȼ�������������m��ÿ��n����
 * ��1����ˮ�أ�0������棩
 * ����õ�ͼˮ�صĸ���
 * ע�⣺ÿ��ˮ�ص����������ĸ�λ�������ˮ�صĻ�������ͬһ��ˮ��
 * eg
 * 2
 * 3	4
 * 1	0	0	0
 * 0	0	1	1
 * 1	1	1	0
 * ���2
 * 5	5	
 * 1	1	1	1	0
 * 0	0	1	0	1
 * 0	0	0	0	0
 * 1	1	1	0	0
 * 0	0	1	1	1*/
public class Numberofpools {
	static int m,n,b;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
	


