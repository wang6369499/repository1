package Baolicaujie;

import java.util.Scanner;
//此题我存在一些问题
//1.如何快速对多个变量进行大小比较
//更正想法：将他们按大小依次排序，比较相邻大小即可
public class chushu {

	public chushu() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k,l,x;
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				if(i==j)
					continue;
				for(k=0;k<10;k++){
					if(i==j||j==k)
						continue;
					for(l=0;l<10;l++){
						if(i==j||j==k||k==l)
							continue;
						for(x=0;x<10;x++){
							if(i==j||j==k||k==l||l==x)
								continue;
							int o=(i*10000+j*1000+k*100+l*10+x);
							int y=(i*10000+j*1000+k*100+l*10+x)*n;
							if(y>100000)
								continue;
							int a[]=new int [5];
							for(int q=0;q<5;q++){
								a[q]=y%10;
								y=y/10;
							}
							if(a[0]!=a[1]&&a[1]!=a[2]&&a[2]!=a[3]&&a[3]!=a[4]&&a[4]!=a[5]&&a[5]!=i&&i!=j&&j!=k&&k!=l&&l!=x){
								System.out.println(y+"/"+o+"="+n);
							}
								
							}
							
						}
					}
				}
			}
		}
	}


