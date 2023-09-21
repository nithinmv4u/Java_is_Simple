package V2MultiThread.interfacing;

public class SampleThreads implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread count"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
