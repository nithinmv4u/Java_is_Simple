package Pattern;

public class Display {
	public static int Check(int[] c,int j) {
		if(c[j]%2!=0) {
			j+=2;
		}
		return j;
	}
	public void displayArray(int[] arr,int x) {
		int j=0,q=2,r=3;
		do {
			int p=0;
			for(;j<x;j++) {
				System.out.print(arr[j]+"	");
				p++;
				j=Check(arr,j);
				if(p>=q) {
					q=q+2;j++;
					System.out.println();
					break;
				}
			}
			p=0;
			for(;j<x;j++) {
				System.out.println(arr[j]+"	");
				p++;
				j=Check(arr,j);
				if(p>=r) {
					r=r*2;j++;
					break;
				}
			}
		}while(j<x);
	}

}
