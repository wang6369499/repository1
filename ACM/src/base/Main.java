package base;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i+=3){
            if(i+2<n){
            	if(a[i]!=a[i+2]){
            		System.out.println(a[i]);
            		break;
            	}
            }
            else{
            	System.out.println(a[i]);
            	break;
            }
            
        }
        
    }
}