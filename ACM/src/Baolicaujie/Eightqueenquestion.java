package Baolicaujie;

import java.util.ArrayList;
import java.util.List;

/*�˻ʺ����⣺
��8*8�������ϰ�8���ʺ�Ҫ��ʺ���ͬ�š�ͬ�кͶԽ����ϣ�������з��������Ľ��*/
public class Eightqueenquestion {
	static int a[]=new int [8];
	static List[] l=new List[92];
	static int x=0;
	public Eightqueenquestion() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		dfs(0);
	}
	public static void dfs(int cur){
		int i,j;
		if(cur==8){
			for(int n=0;n<8;n++)
				l[x].add(a[n]);
			System.out.println(l[x++]);
		}
		else for(i=0;i<8;i++){
			boolean ok=true;
			a[cur]=i;
			for(j=0;j<cur;j++)
				if(a[cur]==a[j]||a[cur]-cur==a[j]-j||a[cur]+cur==a[j]+j){
					ok=false;
					break;
				}
				if(ok)
					dfs(cur+1);
			}
			
		}
	}

