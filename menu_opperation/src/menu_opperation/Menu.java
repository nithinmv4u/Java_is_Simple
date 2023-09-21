package menu_opperation;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Operation o1=new Operation();
		Scanner n=new Scanner(System.in);
		System.out.println("Options:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nPlease Enter your Choice (number):");
		int p,q = 0,x,y;
		p=n.nextInt();
		System.out.println("Enter two numbers");
		x=n.nextInt();
		y=n.nextInt();
		switch (p)
		{
		case 1:q=o1.addition(x, y);
		break;
		case 2:q=o1.subtraction(x, y);
		break;
		case 3:q=o1.multiply(x, y);
		break;
		case 4:q=o1.divide(x, y);
		break;
		}
		System.out.println("Result: "+q);
	}

}
