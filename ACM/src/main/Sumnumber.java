package main;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Sumnumber {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		Map<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		int x=0;
		m.put(a[0], 1);
		for(int j=1;j<n;j++){
			Integer freq=m.get(a[x]);
			m.put(a[j],freq==null?1:freq+1);
		}
		for(Integer in:m.keySet()){
			System.out.println(in+" "+m.get(in));
		}
	}

}
