package main;

import java.util.Scanner;
public class Main2 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		if(str1.length()!=str2.length()){
			System.out.println("1");
		}
		else if(str1.equals(str2)){
			System.out.println("2");
		}
		else if(str1.equalsIgnoreCase(str2)){
			System.out.println("3");
		}
		else{
			System.out.println("4");
		}
	}
}
