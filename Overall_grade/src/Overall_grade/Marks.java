package Overall_grade;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		float a,b,c,result;
		System.out.print("Enter the values\nWritten test: ");
		a=n.nextInt();
		System.out.print("Lab exams: ");
		b=n.nextInt();
		System.out.print("Assignments: ");
		c=n.nextInt();
		Grade g=new Grade();
		result=g.grade(a,b,c);
		System.out.println("Result: "+result);
	}

}
