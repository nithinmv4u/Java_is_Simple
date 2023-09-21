package Adj_array_multi;

import java.util.Scanner;

public class multi {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int i,a,arr[];
		System.out.println("Enter the array length:");
		a=n.nextInt();
		arr=new int[a];
		System.out.println("Enter the array numbers:");
		for(i=0;i<a;i++)
			arr[i]=n.nextInt();
		a--;
		for(i=0;i<a;i++)
			arr[i]=arr[i]*arr[i+1];
		//a[i+1]='\0';
		for(i=0;i<a;i++)
			System.out.print(arr[i]+" ");
	}

}
