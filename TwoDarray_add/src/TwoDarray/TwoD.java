package TwoDarray;

import java.util.Scanner;

public class TwoD {
	public static int[][] getArray(int p,int q,Scanner m){
		int[][] abc=new int[p][q];
		for(int i=0;i<p;i++){
			for(int j=0;j<q;j++){
				abc[i][j]=m.nextInt();
			}
		}
		return abc;
	}
	public static int[][] addArray(int[][] h1,int[][] h2,int p,int q){
		int i,j;
		for(i=0;i<p;i++){
			for(j=0;j<q;j++){
				h1[i][j]+=h2[i][j];
			}
		}
		return h1;
	}
	public static void displayArray(int[][]d,int p,int q){
		for(int i=0;i<p;i++){
			for(int j=0;j<q;j++){
				System.out.print(d[i][j]+"	");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int x,y;
		System.out.println("Enter the array rows:");
		x=n.nextInt();
		System.out.println("Enter the array column:");
		y=n.nextInt();
		System.out.println("Enter numbers of Array 1:");
		int[][] arr1=getArray(x,y,n);
		System.out.println("Enter numbers of Array 2:");
		int[][] arr2=getArray(x,y,n);
		System.out.println("Array 1:");
		displayArray(arr1,x,y);
		System.out.println("Array 2:");
		displayArray(arr2,x,y);
		System.out.println("Result of addition:");
		arr1=addArray(arr1,arr2,x,y);
		displayArray(arr1, x, y);

	}

}
