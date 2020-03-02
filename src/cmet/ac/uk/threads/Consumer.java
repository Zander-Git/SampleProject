package cmet.ac.uk.threads;

public class Consumer implements Runnable {

	String msg;
	Resource shardedResource;
	Thread thread;
	
	public Consumer(Resource res) {
		this.shardedResource = res;
		thread = new Thread(this, "Consumer");
		thread.start();
	}
	
	
	@Override
	public void run() {
		shardedResource.sharedOperation();

	}

}
