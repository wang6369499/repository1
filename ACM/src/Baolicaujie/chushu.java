package Baolicaujie;

import java.util.Scanner;
//�����Ҵ���һЩ����
//1.��ο��ٶԶ���������д�С�Ƚ�
//�����뷨�������ǰ���С�������򣬱Ƚ����ڴ�С����
public class chushu {

	public chushu() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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


