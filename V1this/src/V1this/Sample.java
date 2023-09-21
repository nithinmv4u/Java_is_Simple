package V1this;

public class Sample {
	int a=12,b=14;
	Sample(int a,int b){
		System.out.println("a ="+a+" b ="+b);
		System.out.println("out a="+this.a+" b= "+this.b);
		this.a=a;
		this.b=b;
		System.out.println("a ="+a+" b ="+b);
		System.out.println("out a="+this.a+" b= "+this.b);
		
		
	}

}
