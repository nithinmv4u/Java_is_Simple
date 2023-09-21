package Inc_tax;

import java.util.Scanner;

public class Incometax {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter total income: ");
		float a;
		float t;
		a=n.nextInt();
		Calculation c=new Calculation();
		t=c.tax(a);
		System.out.println("Income tax amount = "+t);
	}

}
