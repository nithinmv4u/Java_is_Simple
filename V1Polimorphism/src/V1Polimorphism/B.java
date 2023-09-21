package V1Polimorphism;

public class B extends A {
	//int b=17;
	B(){
		System.out.println("Its B constructor");
	}
	B(int x){
		super(10);//call constructor
		System.out.println("Its B Argument constructor");
	}
	void display() {		//method overriding
		System.out.println("This is B");
	}
	void hello() {
		super.display(); //method overriding
	}

	public static void main(String[] args) {
		int c=17;
		B b=new B(10);
		b.display();
		b.display(c);
		b.hello();
	}

}
