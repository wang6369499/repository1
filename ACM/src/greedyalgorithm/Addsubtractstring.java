package greedyalgorithm;
/*+-�ַ���
ʱ�����ƣ�1000 ms  |  �ڴ����ƣ�65535 KB
�Ѷȣ�1
����
Shiva�õ�������ֻ�мӺźͼ��ŵ��ַ������ִ�������ͬ��Shivaһ�ο��԰�һ���Ӻź������ڵļ��Ž���������֪��������Ҫ���ٴβ������ܰѵ�һ���ַ����任�ɵڶ����ַ�����������Ҫȥ����������Ǹ�������⡣
����
�����������

ÿ�����������У�ÿ�а���һ���ɡ�+���͡�-����ɵ��ַ�����ÿ���ӷ������Ȳ�����5000��
���
��һ�����������������Ҫ�����Ĵ���������𰸲����ڣ����-1��
��������
++-+--+ 
-++--++ 
�������
4
*/
import java.util.Scanner;

public class Addsubtractstring {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
