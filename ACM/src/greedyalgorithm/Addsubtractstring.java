package greedyalgorithm;
/*+-字符串
时间限制：1000 ms  |  内存限制：65535 KB
难度：1
描述
Shiva得到了两个只有加号和减号的字符串，字串长度相同。Shiva一次可以把一个加号和它相邻的减号交换。他想知道最少需要多少次操作才能把第一个字符串变换成第二个字符串。你现在要去帮助他完成那个这个问题。
输入
多组测试数据

每组数据有两行，每行包含一个由”+”和”-“最成的字符串。每个子符串长度不超过5000。
输出
仅一个整数，输出最少需要操作的次数。如果答案不存在，输出-1。
样例输入
++-+--+ 
-++--++ 
样例输出
4
*/
import java.util.Scanner;

public class Addsubtractstring {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int x=0,y=0,count=0;
		char ch;
		String s1=s.next();
		String s2=s.next();
		char char1[]=s1.toCharArray();
		char char2[]=s2.toCharArray();
		if(char1.length!=char2.length)
			System.out.println("-1");
		else{
			for(int i=0;i<char1.length;i++){
				if(char1[i]=='+'){
					x++;
				}
				if(char2[i]=='+'){
					y++;
				}
			}
			if(x!=y)
				System.out.println("-1");
			else{
				for(int j=0;j<char1.length;j++){
					if(char1[j]!=char2[j]){
						for(int k=j+1;k<char1.length;k++){
							if((char1[k]!=char2[k])&&(char1[k]==char2[j])){
								count+=(k-j);
								ch=char1[j];
								char1[j]=char1[k];
								char1[k]=ch;
								break;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}

}
