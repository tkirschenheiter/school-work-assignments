
public class threadLab {
	public static void main(String[] args) {
	    // Create tasks
	    
		Runnable printFa = new printPhrase("Fa ", 1);
		Runnable printla = new printPhrase("la ", 8);
	    

	    // Create threads
	 
	    Thread thread = new Thread(printFa);
	    Thread thread2 = new Thread(printla);
	    

	    // Start threads
	  
	    thread.start();
	    thread2.start();
	  }
}

	
	class printPhrase implements Runnable {
		private String stringToPrint;
		private int times;
		
		public printPhrase(String a, int x) {
			stringToPrint = a;
			times = x;
		}
		
		public void run() {
		    for (int i = 0; i < times; i++) {
		      System.out.print(stringToPrint);
		    }
		}
	}
