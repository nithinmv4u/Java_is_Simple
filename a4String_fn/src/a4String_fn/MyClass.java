package a4String_fn;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c;
		System.out.println("Enter your Choice:\n1.String Length\n"
				+ "2.String Concatenation\n3.String Reverse\n4.Exit");
		c=s.nextInt();
		StrFn str=new StrFn();
		while (true){
			if(c==1)
				str.StringLength();
			else if(c==2)
				str.StringConcat();
			else if(c==3)
				str.StringRev();
			else if(c==4)
				break;
			else
				System.out.println("Invalid Entry..Fool..!");break;
		}

	}

}
