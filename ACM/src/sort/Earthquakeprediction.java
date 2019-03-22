package sort;

import java.util.Scanner;
/*����Ԥ��
Accept: 379    Submit: 2049
Time Limit: 1500 mSec    Memory Limit : 32768 KB
  Problem Description
����������һ���о�����Ŀ�ѧ�ң�������������֪��ĳһ��ʱ���ڵĵؿ���������������С����ֵ֮�ͣ�������Ч��Ԥ������ķ�����
������֪һ��ʱ���n�εؿ��������Ĳ���ֵΪa1,a2,��an����ô��i �β�������С����ֵΪmin{|ai-aj| | i<j<=n}������i �β�������С����ֵ�����n-i�β���ֵ���i�β���ֵ֮��ľ���ֵ����С��ֵ���ر�أ���n�β�������С����ֵΪan��
���дһ�����������n�β�������С����ֵ֮�͡�
  Input
�����ж����������ݣ�����봦��EOFΪֹ
�������ݵ�һ����һ����n(1<=n<=105) ,��ʾ�����Ĵ�����
�ڶ�����n����������ʾn�εؿ��������Ĳ���ֵa1,a2,��an (0<=ai<=107 )��
  Output
���n�β�������С����ֵ֮�͡�
  Sample Input
4
2 0 3 10
  Sample Output
21
*/
public class Earthquakeprediction {
	static int n,min,m;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println(dfs(a,0,0));
	}
	public static int dfs(int a[],int cur,int sum){
		for(int i=0;i<n;i++){
			if(i==n-1){
				sum+=a[n-1];
			}
			else
				{
				min=Math.abs(a[i]-a[i+1]);
				for(int j=i+1;j<n-1;j++){
					m=Math.abs(a[i]-a[j+1]);
					if(min>m){
						min=m;
					}
				}
				sum+=min;
			}
		}
		return sum;
	}
}
