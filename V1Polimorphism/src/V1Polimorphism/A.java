package V1Polimorphism;

public class A {
	int a;
	A(){
		System.out.println("Its A constructor");
	}
	A(int x){
		System.out.println("Its A Argument constructor");
	}
	void display() {		//method overloading//method overriding
		System.out.println("This is A");
	}
	void display(int c) {					//method overloading
		System.out.println("C is "+c);
	}

}
