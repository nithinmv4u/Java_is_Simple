package Test;

public class InstanceCounter {

	   private static int numInstances = 0;

	   protected static int getCount() {
	      return numInstances;
	   }

	   private void addInstance() {
	      numInstances++;
	   }

//	   InstanceCounter() {
//	      InstanceCounter.addInstance();
//	   }

	   public static void main(String[] arguments) {
	      System.out.println("Starting with " + InstanceCounter.getCount() + " instances");

	      for (int i = 0; i < 500; ++i) {
	         InstanceCounter n=new InstanceCounter();
	         n.addInstance();
	      }
	      System.out.println("Created " + InstanceCounter.getCount() + " instances");
	   }
}

