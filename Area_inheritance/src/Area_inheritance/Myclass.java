package Area_inheritance;

import java.util.Scanner;

public class Myclass extends Area {
	
	static Scanner n=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter your choice\r\n1.Circle\r\n2.Square\r\n3.Rectangle\r\n4.Triangle\r\n");
		int a=n.nextInt();
		Myclass max=new Myclass();
		switch (a){
		case 1:max.circle(); 
		break;
		case 2:max.square();
		break;
		case 3:max.rectangle();
		break;
		case 4:max.triangle();
		break;
		}

	}
	void circle(){
		System.out.println("Enter the radius:");
		double a=n.nextInt();
		a=super.circle(a);
		System.out.println("Area of circle : "+a);
		
	}
	void square() {
		System.out.println("Enter the length:");
		double a=n.nextInt();
		double b=super.square(a);
		System.out.println("Area of circle : "+b);
	}
	void rectangle() {
		System.out.println("Enter the length:");
		double a=n.nextInt();
		System.out.println("Enter the width:");
		double b=n.nextInt();
		a=super.rectangle(a, b);
		System.out.println("Area of rectangle : "+a);
	}
	void triangle() {
		System.out.println("Enter the height:");
		double a=n.nextInt();
		System.out.println("Enter the base:");
		double b=n.nextInt();
		a=super.triangle(a, b);
		System.out.println("Area of triangle : "+a);
	}


}
