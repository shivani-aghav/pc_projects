package thread;

public class A1 extends Thread {

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);

			}
			this.notify();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
	  A1 a = new A1();
		a.start();
		synchronized (a) {
			System.out.println("main thread");
			a.wait();
			System.out.println("main thread got notified");
		}
	}
}

