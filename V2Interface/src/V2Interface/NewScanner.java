package V2Interface;

public class NewScanner {
	Hello obj;
//	public void display() {
//		System.out.println("This is Interface");
//	}
	
	NewScanner(Hello obj){
		this.obj=obj;
	}
	void scanner() {
		
		
	String text="This is Interface";
	obj.display(text);
	}
	
	

}
