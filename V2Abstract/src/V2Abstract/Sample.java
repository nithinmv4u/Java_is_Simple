package V2Abstract;

public class Sample extends Hello {
	
	void OnText(String text) {
		System.out.println(text);
		
	}
	Sample(){
		TextScanner ts=new TextScanner(this);
		ts.scan();
	}

	public static void main(String[] args) {
		Sample s=new Sample();

	}

}
