package greedyalgorithm;

import java.util.Scanner;
/*�׳�֮��
ʱ�����ƣ�3000 ms  |  �ڴ����ƣ�65535 KB
�Ѷȣ�3
����
����һ���Ǹ�������n���ж�n�ǲ���һЩ������Щ���������ظ�ʹ�ã���Ϊ�������Ľ׳�֮�ͣ���9=1��+2!+3!������ǣ������Yes���������No��
����
��һ����һ������0<m<100,��ʾ��m��������ݣ�
ÿ�����������һ��������n<1000000;
���
����������������Yes���������No;
��������
2
9
10
�������
Yes
No*/
public class Thesumoffactorial {
	static boolean fact=false;
	static boolean v[];
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			int m=s.nextInt();
			v=new boolean[m];
			dfs(m,1,0);
			System.out.print(fact);
		}
	}
	public static int factorial(int a){
		int x=1;
		for(int i=2;i<=a;i++){
			x*=i;
		}
		return x;
	}
	public static void dfs(int m,int cur,int sum){
		if(sum==m){
			fact=true;
		}
		while(sum<m){
			if(!v[cur]){
				sum+=factorial(cur);
				v[cur]=true;
			}
			dfs(m,cur+1,sum);
			v[cur]=false;
		}
		
	} 
}/*import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int m,n;
n=sc.nextInt();
while(n-->0){
m=sc.nextInt();
if(Judge(m)){
System.out.println("Yes");
}else{
System.out.println("No");
}
}

}
public static boolean Judge(int m){//���Ĵ���
int[] jc=Jc();
boolean flag=false;
for(int i=8;i>=0;i--){
if(m>=jc[i] && m>0){
m=m-jc[i];
}
if(m==0){
flag=true;
}
}
return flag;
}
public static int[] Jc(){
int[] jc=new int[9];
int temp=1;
for(int i=0;i<9;i++){
temp=temp*(i+1);
jc[i]=temp;
}
return jc;
}
}*/
