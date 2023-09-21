package Test;

public class Sub_class {
	int num=0;

	public Sub_class(String name) {
		System.out.println("This is :"+name);
		num=num+10;
		System.out.println("NUM :"+num);
	}
	public void next() {
		Sub_class s=new Sub_class("haihello");
	}

}
