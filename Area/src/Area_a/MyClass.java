package Area_a;

import java.util.Scanner;

public class MyClass {
	public static void circle(Scanner m,Area cir){
		System.out.println("Enter the radius:");
		double a=m.nextInt();
		double b=cir.circle(a);
		System.out.println("Area of circle : "+b);
	}
	private static void triangle(Scanner m,Area cir) {
		System.out.println("Enter the height:");
		int a=m.nextInt();
		System.out.println("Enter the base:");
		int b=m.nextInt();
		double c=cir.triangle(a, b);
		System.out.println("Area of triangle : "+c);
	}

	private static void rectangle(Scanner m,Area cir) {
		System.out.println("Enter the length:");
		int a=m.nextInt();
		System.out.println("Enter the width:");
		int b=m.nextInt();
		double c=cir.rectangle(a, b);
		System.out.println("Area of rectangle : "+c);
	}

	private static void square(Scanner m,Area cir) {
		System.out.println("Enter the length:");
		int a=m.nextInt();
		double b=cir.square(a);
		System.out.println("Area of circle : "+b);
	}

	public static void main(String[] args) {
		System.out.println("Enter your choice\r\n1.Circle\r\n2.Square\r\n3.Rectangle\r\n4.Triangle\r\n");
		final Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		Area arr=new Area();
		switch (a){
		case 1:circle(n,arr); 
		break;
		case 2:square(n,arr);
		break;
		case 3:rectangle(n,arr);
		break;
		case 4:triangle(n,arr);
		break;
		}

	}

}
