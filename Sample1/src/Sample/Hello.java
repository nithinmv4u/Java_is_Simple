package Sample;


public class Hello {
	static int a=5;
	public static void main(String[] args) {
		System.out.println("hello how are you!");
		System.out.println("new project");
		int a=2,b=3;
		a=a+b;
		System.out.println("sum = "+a+" B is "+b);
		Brototype B=new Brototype();
		System.out.println("B is: "+b);
		System.out.println("B is: "+B.b);
		Hello h=new Hello();
		Hello h2=new Hello();
		h.a=6;
		h2.a=7;

		System.out.println("A is: "+h.a);

		System.out.println("A is: "+h2.a);
		
		
	}

}
