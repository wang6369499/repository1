package Baolicaujie;

import java.util.ArrayList;
import java.util.List;

/*八皇后问题：
在8*8的棋盘上摆8个皇后，要求皇后不在同排、同列和对角线上，输出所有符合条件的解答*/
public class Eightqueenquestion {
	static int a[]=new int [8];
	static List[] l=new List[92];
	static int x=0;
	public Eightqueenquestion() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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

