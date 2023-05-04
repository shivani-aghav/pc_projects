package thread;

public class UsingThreadClass extends Thread{

	public void run() {
		System.out.println("run method of thread");
	}
	public static void main(String[] args) {
		UsingThreadClass class1 = new UsingThreadClass();
		class1.start();
	}
}
