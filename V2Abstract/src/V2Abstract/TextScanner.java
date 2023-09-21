package V2Abstract;

public class TextScanner {
	
	Hello obj;
	TextScanner(Hello obj) {
		this.obj=obj;
	}
	void scan() {
		
		
		
		
		String text="hello how are you!";
		obj.OnText(text);
	}

}
