
public class main2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[][]=new int[9][9];
		for(int i=0;i<9;i++){
			if(i<4){
				for(int j=5+i;j<9;j++){
					a[i][j]=1;
				}
			}
			if(i>4){
				for(int j=0;j<i-4;j++){
					a[i][j]=1;
				}
			}
		}
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
