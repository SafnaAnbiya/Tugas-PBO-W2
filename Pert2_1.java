package com.welcome;
import java.util.Scanner;
import java.util.Iterator;
public class Pert2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner read = new Scanner(System.in);
		 System.out.println("Nilai: ");
		 System.out.println("can be fitted : ");
		 if (read.hasNextByte()==true) {
			 System.out.println("*byte");
		 }
		 if (read.hasNextInt()==true) {
			 System.out.println("*Int");
		 }
		 if (read.hasNextShort()==true) {
			 System.out.println("*Short");
		 }
		 if (read.hasNextLong()==true) {
			 System.out.println("*Long");
		 }
		 else {System.out.println("Can't be fitted anywhere");
		 }
		 
		/* int X;
		 Scanner read = new Scanner(System.in);

		for(int i=0;i<=6;i++){
		System.out.println("Nilai: ");
		X = read.nextInt();


		if(X<0){
		System.out.println("Minus: ");
		X=X*(-1);
		}


		String binary = Integer.toBinaryString(X);
		System.out.println("Bilangan binernya adalah : " + binary);
		System.out.println(binary.length());

		if(binary.length()<=8){
		    System.out.println(X);
		    System.out.println("Can be fitted:");
		    System.out.println(" * Short");
		    System.out.println(" * Int");
		    System.out.println(" * Long");
		}else if (binary.length()>9 && binary.length()<=16) {
		    System.out.println(X);
		    System.out.println("Can be fitted:");
		    System.out.println(" * Short");
		    System.out.println(" * Int");
		    System.out.println(" * Long");
		}else if ( binary.length()>17 && binary.length()<=32) {
		    System.out.println(X);
		    System.out.println("Can be fitted:");
		    System.out.println(" * Int");
		    System.out.println(" * Long");
		}else if ( binary.length()>33 && binary.length()<=64 ) {
		    System.out.println(X);
		    System.out.println("Can be fitted:");
		    System.out.println(" * Long");
		   }else if(binary.length()>65){
		    System.out.println(X);
		    System.out.println(" Nilai Can't be fitted anywhere ");
		    }
		    }
		 }*/
		}
}
