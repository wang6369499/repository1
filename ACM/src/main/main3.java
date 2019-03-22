package main;

import java.util.*;
public class main3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		while(str!="0"){
			Integer n=0;
			char ch[]=str.toCharArray();
			String stri[]=new String[ch.length];
			for(int i=0;i<ch.length;i++){
				stri[i]=ch[i]+"";
			}
			for(int i=0;i<ch.length;i++){
				n+=Integer.valueOf(stri[i]);
			}
			System.out.println(n);
			str=s.next();
		}
	}

}
