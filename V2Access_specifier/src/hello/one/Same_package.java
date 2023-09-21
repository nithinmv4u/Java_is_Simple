package hello.one;

public class Same_package extends Hello {
	
	public Same_package() {
		
		Hello h=new Hello();
		h.display();
		//h.run();			not possible 'private'
		display();
		//run();			not possible 'private'
		h.passenger(); 		//'protected'
		passenger(); 		//'protected'
		travel();   		//'public'
	}

}
