package cmet.ac.uk.threads;

public class MainThreads {

	public MainThreads() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		Thread mainThread = Thread.currentThread();
		System.out.println("current thread: " + mainThread);

		mainThread.setName("cis5003");
		System.out.println("After name change: " + mainThread);
		
//		for(int n = 10; n> 0; n--) {
//			System.out.println(n); 
//			Thread.sleep(1000);
//		}
		
		ChildThread t1 = new ChildThread("T1");
		ChildThread t2 = new ChildThread("T2");
		
		t1.threadObj.join();
		t2.threadObj.join();
		
		ChildThread t3 = new ChildThread("T3");
	}

}
