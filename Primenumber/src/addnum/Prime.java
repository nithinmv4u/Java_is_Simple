package addnum;
import java.util.Scanner;

public class Prime {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x,y=0;
		x=a.nextInt();
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
				y++;
		}
		if(y==2)
			System.out.println("Its a prime number");
		else
			System.out.println("Not a prime number");

	}

}
