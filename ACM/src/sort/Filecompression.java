package sort;

import java.util.*;
/*1409 �ļ�ѹ��
Accept: 521    Submit: 1847
Time Limit: 1000 mSec    Memory Limit : 32768 KB
  Problem Description
����ļ���ѹ����һֱ������׷���Ŀ�ꡣ�������������������һ���㷨������Ȼֻ�ǵ����ض��ļ��������ţ�������ѹ���ļ������ǶԾ������㷨��������ļ�����ѹ�����ڴ��������¶��ܻ�ñ�ԭ�������ѹ���ʡ�
���㷨�������£���һ������Ϊn���ַ���S�����ȸ���������n���ַ��������е�i���ַ�����S����ѭ����λi-1�εõ�����ʾ������Ȼ�����n���ַ����������ַ���С����������������ַ��������ַ���ͬ�������ǵ����λ�ò��䡣���Ű��������ַ�����β�ַ���������һ���µ��ַ���S'�����ĳ�����Ϊn��������Ȼ��S�е��ַ���һ�����š�������S'�Լ�S�����ַ���S'�е����p�����磺

S = example

1������n���ַ�����
example
xamplee
ampleex
mpleexa
pleexam
leexamp
eexampl	
2�����ַ�������
ampleex
example
eexampl
leexamp
mpleexa
pleexam
xamplee
3�������
S' = xelpame
p = 7
����Ӣ�ﵥ�ʹ���������ԣ�ĳЩ��ĸ���ֵ�Ƶ�ʺܸߣ������ ����ͬ����ĸ�кܴ�������һ�𣬴Ӷ���� ��ѹ���ʡ���Ȼ�����㷨������Ӣ�ﵥ�ʵ����ԣ�Ȼ����ʵ���У����Ƿ����������������������͵��ļ�ѹ����

�����дһ������ģ����㷨�����й��̣������ַ���S�����S'��p��
  Input
����������С���һ��Ϊһ����n��1<=n<=10000����ʾS�ĳ��ȣ��ڶ���Ϊ�ַ���S���ַ���ȫ����Сд��ĸ��ɣ�û�������ַ���
  Output
������У���һ��ΪS'���ڶ���Ϊ����p��
  Sample Input
7
example
  Sample Output
xelpame
7
*/

public class Filecompression {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Set <String>set=new TreeSet<String>();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=0,p=1;
		String s[]=new String [x+1];
		String string="";
		s[0]=sc.next();
		char c,ch1,ch2 = 0;
		//System.out.println(s1);
		while(y!=x){
			set.add(s[y]);
			char[] ch=s[y].toCharArray();
			c=ch[0];
			
			for(int i=0;i<x-1;i++)
				ch[i]=ch[i+1];
			ch[x-1]=c;
			s[y+1]="";
			for(int i=0;i<x;i++){
				s[y+1]+=ch[i];
			}
			y++;
			
		}
		Iterator i=set.iterator();
		while(i.hasNext()){
			String st1=(String) i.next();
			string +=""+st1.charAt(x-1);
			ch2=string.charAt(0);
		}
		System.out.println(string);
		for(String s0:set){
			ch1=s0.charAt(0);
			if(ch1==ch2)
				System.out.println(p);
			p++;
		}

	}
}
