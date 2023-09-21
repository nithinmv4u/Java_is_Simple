package V2MultiThread.interfacing;

public class Hello {

	public static void main(String[] args) {
		
		SampleThreads st=new SampleThreads();
		Thread t=new Thread(st);
		t.start();
		SampleThreads st1=new SampleThreads();
		Thread t1=new Thread(st);
		t1.start();
		SampleThreads st2=new SampleThreads();
		Thread t2=new Thread(st);
		t2.start();


	}

}
