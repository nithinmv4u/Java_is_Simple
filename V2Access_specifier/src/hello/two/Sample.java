package hello.two;

import hello.one.*;

public class Sample {

	Sample(){
		Hello h=new Hello();
		//h.display();  not possible because access specifier is 'default'
		//h.run();			not possible 'private'
		h.travel();			//'public'
	}
	public static void main(String[] args) {
		

	}

}
