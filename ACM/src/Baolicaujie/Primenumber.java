package Baolicaujie;
/*������
����������n��������1,2,3...n�����һ������ʹ��������������������Ϊ����������Ǵ�һ��ʼ��ʱ������
��ͬһ����ǡ�����һ�Ρ�n<=16
*/

import java.util.Scanner;

public class Primenumber {
	static int n;
	static boolean []vis=new boolean [40];
	static int []a=new int[20];
	static boolean []b=new boolean [40];
	public Primenumber() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int q=0;q<40;q++){
			vis[q]=false;
			b[q]=true;
		}	
		b[2]=true;
		for(int l=2;l<6;l++){
			if(b[l]){
				for(int y=l*l;y<36;y+=l)
					b[y]=false;
			}
			else 
				b[l]=true;
		}								//�����������������������Ż��㷨
		DFS(1);
	}
	public static boolean judge(int m){
		return b[m];
	}
	public static void DFS(int cur){
		int i;
		a[0]=1;
		if(cur==n&&judge(a[0]+a[n-1])){
			for(int x=0;x<n;x++)
				System.out.print(" "+a[x]);
			System.out.println();
		}
		else for(i=2;i<=n;i++){
			if(!vis[i]&&judge(i+a[cur-1])){
				a[cur]=i;
				vis[i]=true;
				DFS(cur+1);
				vis[i]=false;
			}
		}
	}
}
