package sort;

import java.util.*;
/*1410 变位词
Accept: 670    Submit: 1900
Time Limit: 1000 mSec    Memory Limit : 32768 KB
  Problem Description
Mr. Right有一个奇怪的嗜好，就是看见一个单词就有找它所有的变位词的冲动。一个单词的变位词就是该单词所有字母的一个排列。
  Input
输入数据第一行为一个整数n，1<=n<=10^5，之后n行每行只包含一个单词，不含词组。这些单词构成了Mr. Right的字典。每个单词长度不大于9个字母。接着一行为一个整数m，1<=m<=100，表示Mr. Right将看见的单词数。之后m行每行包含一个单词。（题目中出现的每个单词都只由小写字母组成）
  Output
对应Mr. Right看到的每个单词，输出落在字典里的它的变位词的个数。
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
		// TODO 自动生成的方法存根
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
