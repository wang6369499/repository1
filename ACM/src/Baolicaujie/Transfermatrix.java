package Baolicaujie;

import java.util.Scanner;
/*��ת�þ�������
 ����һ����������ת�þ��󣬵�һ��һ������nС��20����ʾ��n�����ݣ�������n������
 ÿ����9�����������ֱ�Ϊ����ÿ��*/
public class Transfermatrix {
	static int [][]a=new int [3][3];
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s=new Scanner(System.in);
		int i,j,k,t=0;
		int n=s.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<3;j++){
				for(k=0;k<3;k++){
					a[j][k]=s.nextInt();
				}
			}
			for(j=0;j<3;j++){
				for(k=0;k<j;k++){
					t=a[j][k];
					a[j][k]=a[k][j];
					a[k][j]=t;
				}
			}
			for(j=0;j<3;j++){
				for(k=0;k<3;k++){
					System.out.print(a[j][k]+"  ");
				}
				System.out.println();
			}
		}
	}

}
