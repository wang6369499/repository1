package Baolicaujie;

import java.util.Scanner;
/*孪生素数
 * 两个素数的距离小于等于2,即为孪生素数
 * 第一行给出n组测量数据组数
 * 接下来组测量数据给出m，表示找出m之前的所以孪生素数（o<m<1000000）
 * eg
 * 1
 * 14
 * 4
 * */
public class Twinprimes {
	static int m;
	static int a[]=new int[1000000];
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k=0;
		a[0]=a[1]=0;
		for(i=2;i<1000000;i++){
			a[i]=i;
		}
		for(i=2;i<1000;i++){
			if(a[i]!=0){
				for(j=i*i;j<1000000;j=j+i){
					a[j]=0;					//艾氏塞法快速求出所以素数
				}
			}
		}
		for(i=0;i<n;i++){
			m=s.nextInt();
			for(j=2;j<m;j++){
				if((a[j]!=0&&a[j+2]!=0)||(a[j]!=0&&a[j+1]!=0)){
					k++;
				}
			}
			System.out.println(k);
		}
	}

}
