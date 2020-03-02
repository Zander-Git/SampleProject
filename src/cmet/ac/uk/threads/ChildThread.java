package cmet.ac.uk.threads;

public class ChildThread implements Runnable {

	Thread threadObj;
	
	public ChildThread(String name) {
		threadObj = new Thread(this, name);
		threadObj.start();
	}

	@Override
	public void run() {
		try {
			for(int n = 10; n > 0; n--) {
				
				System.out.println(threadObj.getName() + ":" + n);
				Thread.sleep(1000);
				
			}
		}
		catch (InterruptedException e) {
			System.out.println("child thread interrupted");
		}
		System.out.println("child thread is exiting.");
	}

}
