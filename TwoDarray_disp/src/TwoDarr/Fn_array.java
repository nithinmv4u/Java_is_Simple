package TwoDarr;

import java.util.Scanner;

public class Fn_array {
	//Scanner m=new Scanner(System.in);
	public int[][] getArray(int a,int b,Scanner m) {
		int[][] arr =new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr[i][j]=m.nextInt();
			}
		}
		return arr;
	}
	public void displayArray(int[][] array,int a,int b) {
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(array[i][j]+"	");
			}
			System.out.println();
		}
	}

}
