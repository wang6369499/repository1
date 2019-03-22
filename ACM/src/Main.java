import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int x;
		int a[], b[];
		do {
			x = s.nextInt();
			if (x == 0)
				break;
			a = new int[x];
			b = new int[x];
			for (int i = 0; i < x; i++) {
				a[i] = s.nextInt();
			}
			for (int i = 0; i < x; i++) {
				b[i] = s.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int n = 0, q, m = 0,p=0,w=0;
			for (q = a.length-1; q >= 0; q--) {
				for (int j = a.length-1-p; j >= w; j--) {
					if (a[q] > b[j]) {
						n++;
						p++;
						w++;
						break;
					}
					if (a[q] == b[m]) {
						x--;
						m++;
					}

				}
				if (a[q] < b[m]) {
					break;
				}
			}
			if(n>=(x+1)/2){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		} while (true);
	}

}
