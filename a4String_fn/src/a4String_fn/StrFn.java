package a4String_fn;

import java.util.Scanner;

public class StrFn {
	
	Scanner z=new Scanner(System.in);
	char[] a,b;
	char[] c=new char[100];
	String abc;

	public void StringLength() {
		System.out.println("Enter the String:");
		abc=z.nextLine();
		a=abc.toCharArray();
		int i;
//		for(i=0;i<a.length;i++)
//			System.out.println(a[i]+" ");
		for(i=0;i<a.length;i++);
		System.out.println("Length of given string is: "+i);
		
	}

	public void StringConcat() {
		System.out.println("Enter the String 1 :");
		abc=z.nextLine();
		a=abc.toCharArray();
		System.out.println("Enter the String 2 :");
		abc=z.nextLine();
		b=abc.toCharArray();
		System.out.println(abc+" "+a+" "+b);
		int i;
//		for(i=0;i<a.length;i++)
//			System.out.println(a[i]+" ");
		int x=a.length+b.length;
		for(i=0;i<a.length;i++)
			c[i]=a[i];
//		System.out.println(c+" "+a+" "+b);
		for(;i<x;i++) {
			c[i+1]=b[i];
			System.out.println(a[i+1]+" ");
		}
		System.out.println("Concatenated string is: "+a);
		
	}

	public void StringRev() {
		// TODO Auto-generated method stub
		
	}

}
