package cmet.ac.uk.threads;

public class Resource {
	
	public void sharedOperation(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		System.out.println("]");
	}

}
