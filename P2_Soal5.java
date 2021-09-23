package com.welcome;

import java.util.Scanner;

public class P2_Soal5 {

	public static void main(String[] args) {
		 Scanner read = new Scanner(System.in);
		 String kata1,kata2;
		 kata1=read.nextLine();
		 kata2=read.nextLine();
		 System.out.println(kata1.length()+ kata2.length());
		 
		 if (kata1.compareTo(kata2)<kata2.compareTo(kata1)) {
			 System.out.println("NO");
		 }
		 else {System.out.println("YES");
		 
		 }
		 System.out.println(kata1.substring(0,1).toUpperCase()+kata1.substring(1)+" "+ kata2.substring(0,1).toUpperCase()+kata2.substring(1));
	}

}