package V2Interface;

public class Sample implements Hello {
	
	public void display(String text) {
		System.out.println(text);
	}
	
	Sample(){
		NewScanner ns=new NewScanner(this);
		ns.scanner();
	}

	public static void main(String[] args) {
		Sample s=new Sample();

	}

}
