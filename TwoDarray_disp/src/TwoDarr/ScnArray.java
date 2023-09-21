package TwoDarr;

import java.util.Scanner;

public class ScnArray {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int x=n.nextInt();
		System.out.println("Enter columns: ");
		int y=n.nextInt();
		Fn_array f=new Fn_array();
		System.out.println("Enter values: ");
		int[][] arr=f.getArray(x,y,n);
		f.displayArray(arr,x,y);

	}

}
