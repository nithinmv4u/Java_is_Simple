package num_pattern;

import java.util.Scanner;

public class num_pattern {

	public static void main(String[] args) {
		System.out.println("Enter limit: ");
		Scanner a=new Scanner(System.in);
		int i,j,p,q = 0;
		p=a.nextInt();
		for(i=0;i<=p;i++){
			for(j=0;j<=i&&q<p;j++)
				System.out.print(++q+"	");
			System.out.println();
			if(q>=p)
				break;
		}
	}
}
