package Baolicaujie;


import java.util.Scanner;
/*Χ��һ��n���˵�Ȧ����1��ʼÿ��һ��ȥ��һ���ˣ�ֱ������һ�����Ҵ棬������˵ļǺ�
 eg��10
 	 5
 	 
 	2048
 	1
 */
public class Thejosephusproblem {
	static int n;
	static int a[]=new int [10000];
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int N=n;//N�жϻ�ʣ����
		int j=1,h=1;// hָ�߹�������j����ǰ��ָ���λ��
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
	

