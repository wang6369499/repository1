package Baolicaujie;


import java.util.Scanner;
/*围成一个n个人的圈，从1开始每隔一人去除一个人，直至仅有一个人幸存，输出此人的记号
 eg：10
 	 5
 	 
 	2048
 	1
 */
public class Thejosephusproblem {
	static int n;
	static int a[]=new int [10000];
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int N=n;//N判断还剩几人
		int j=1,h=1;// h指走过个数；j代表当前所指向的位置
		for(int i=1;i<=n;i++){
			a[i]=i;
		}
		
		while(N!=1){
			for(int k=1;k<=n;k++){
				if(a[k]!=0){
					j=k;
					break;
				}
			}
			while(j!=n+1){
				if(a[j]!=0){
					if(h%2==0){
						a[j]=0;
						N--;
					}
					h++;		
				}
				j++;
			}
			
		}
		for(int v=1;v<=n;v++){
			if(a[v]!=0)
			System.out.println(v);	
		}
		}
	}
	

