package demo;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String args[]) {
		int a,b;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your value of a");
		a=sc.nextInt();
		System.out.println("enter your value of b");
		b=sc.nextInt();
		System.out.println("enter your value of c");
		c=sc.nextInt();
		if(c == a+b) {
			System.out.println("Add");
			
		}
			
		else if(c == a-b) {
			System.out.println("subtract");
			
		}
		else if(c == a*b) {
			System.out.println("Multiply");
			
		}
		else if(c == a/b) {
			System.out.println("Divide");
			
		}
		else if(c == a%b) {
			System.out.println("Modulo");
		
		}else 
			System.out.println("not possible");
	}
}
