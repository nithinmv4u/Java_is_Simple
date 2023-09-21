package Pattern;

import java.util.Scanner;

public class Array_pat {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int a=n.nextInt();
		int[] arr=new int[a];
		System.out.println("Enter array elements:");
		for(int i=0;i<a;i++) {
//			arr[i]=n.nextInt();
			arr[i]=(i+1);
		}
		Display d=new Display();
		d.displayArray(arr, a);

	}

}
