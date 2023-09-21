package V2Abstract2;

public class Sample extends Hello {
	
	void OnText(String text) {
		System.out.println(text);
		
	}
	
	Sample(){
		this.scanner();
	}

	public static void main(String[] args) {
		Sample s=new Sample();

	}

}
