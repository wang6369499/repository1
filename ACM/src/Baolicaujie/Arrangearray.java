package Baolicaujie;
/*����һ����������n������С�������������
 eg��1 2 3
 	 1 3 2
 	 2 1 3
 	 2 3 1
 	 3 1 2
 	 3 2 1*/
import java.util.Scanner;
//??????????/
public class Arrangearray {
	static int n;
	static int[] a=new int [n+100];
	static int cur=0;
	public Arrangearray() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		arrange(cur,n,a);
	}
	public static void arrange(int cur,int n,int a[]){
		if(cur==n){
			for(int i=0;i<n;i++){
				System.out.print(" "+a[i]);
				}
			System.out.println();
		}
		else{
			for(int i=1;i<=n;i++){
				boolean ok=true;
				for(int j=0;j<cur;j++){
					if(a[j]==i)
						ok=false;
					}
					if(ok){
						a[cur]=i;
						arrange(cur+1,n,a);
					}
				}
		}
	}
}
