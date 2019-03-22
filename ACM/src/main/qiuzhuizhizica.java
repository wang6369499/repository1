package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class qiuzhuizhizica {
	public static Integer calu(List<Integer> list){
		int min=list.get(0),max=list.get(0),i=0;
		while(i<list.size()-1){
			i++;
			if(list.get(i)<min)
				min=list.get(i);
			if(list.get(i)>max)
				max=list.get(i);
		}
		return max-min;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			list.add(s.nextInt());
		}
		while(m>0){
			int x=s.nextInt(),y=s.nextInt();
			List<Integer> l=list.subList(x-1,y);
			m--;
			System.out.println(calu(l));
		}
	}
}
