package sort;

import java.util.*;
/*1409 文件压缩
Accept: 521    Submit: 1847
Time Limit: 1000 mSec    Memory Limit : 32768 KB
  Problem Description
提高文件的压缩率一直是人们追求的目标。近几年有人提出了这样一种算法，它虽然只是单纯地对文件进行重排，本身并不压缩文件，但是对经这种算法调整后的文件进行压缩，在大多数情况下都能获得比原来更大的压缩率。
该算法具体如下：对一个长度为n的字符串S，首先根据它构造n个字符串，其中第i个字符串由S向左循环移位i-1次得到（见示例）。然后把这n个字符串按照首字符从小到大排序。如果两个字符串的首字符相同，则它们的相对位置不变。接着把排序后的字符串的尾字符依次连成一个新的字符串S'。它的长度仍为n，而且显然是S中的字符的一种重排。最后输出S'以及S的首字符在S'中的序号p。例如：

S = example

1、构造n个字符串：
example
xamplee
ampleex
mpleexa
pleexam
leexamp
eexampl	
2、将字符串排序：
ampleex
example
eexampl
leexamp
mpleexa
pleexam
xamplee
3、输出：
S' = xelpame
p = 7
由于英语单词构造的特殊性，某些字母出现的频率很高，因此在 中相同的字母有很大几率排在一起，从而提高 的压缩率。虽然这种算法利用了英语单词的特性，然而在实践中，人们发现它几乎适用于所有类型的文件压缩。

请你编写一个程序模拟该算法的运行过程，输入字符串S，输出S'和p。
  Input
输入包含两行。第一行为一整数n，1<=n<=10000，表示S的长度；第二行为字符串S，字符串全部由小写字母组成，没有其它字符。
  Output
输出两行，第一行为S'，第二行为整数p。
  Sample Input
7
example
  Sample Output
xelpame
7
*/

public class Filecompression {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
