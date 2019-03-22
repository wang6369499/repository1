package sort;

import java.util.*;
/*1410 ��λ��
Accept: 670    Submit: 1900
Time Limit: 1000 mSec    Memory Limit : 32768 KB
  Problem Description
Mr. Right��һ����ֵ��Ⱥã����ǿ���һ�����ʾ����������еı�λ�ʵĳ嶯��һ�����ʵı�λ�ʾ��Ǹõ���������ĸ��һ�����С�
  Input
�������ݵ�һ��Ϊһ������n��1<=n<=10^5��֮��n��ÿ��ֻ����һ�����ʣ��������顣��Щ���ʹ�����Mr. Right���ֵ䡣ÿ�����ʳ��Ȳ�����9����ĸ������һ��Ϊһ������m��1<=m<=100����ʾMr. Right�������ĵ�������֮��m��ÿ�а���һ�����ʡ�����Ŀ�г��ֵ�ÿ�����ʶ�ֻ��Сд��ĸ��ɣ�
  Output
��ӦMr. Right������ÿ�����ʣ���������ֵ�������ı�λ�ʵĸ�����
  Sample Input
3
tea
ate
eat
3
ate
abc
tea
  Sample Output
3
0
3
*/
public class Anagrams {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String st1="",st2="";
		List <String> l =new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(),w=0;
		int n[];
		String string[]=new String[x];
		for(int i=0;i<x;i++){
			string[i]=s.next();
			l.add(string[i]);
		}
		int y=s.nextInt();
		n=new int[y];
		for(int i=0;i<y;i++){
			String s1=s.next();
			char ch1[]=s1.toCharArray();
			for(String s2:l){
				char[] ch2=s2.toCharArray();
				if(ch1.length==ch2.length){
					TreeMap <Character,Integer> list1=new TreeMap<Character,Integer>();
					TreeMap <Character,Integer> list2=new TreeMap<Character,Integer>();
					for(int p=0;p<ch1.length;p++){
						list1.put(ch1[p],p);
						list2.put(ch2[p],p);
					}
					for(Character char1:list1.keySet()){
						st1=char1+"";
					}
					for(Character char2:list2.keySet()){
						st2=char2+"";
					}
					if(st1.equals(st2)){
						n[w]++;
					}
				}
			}
			w++;
			
		}
		for(int r=0;r<y;r++)
			System.out.println(n[r]);
	}

}
