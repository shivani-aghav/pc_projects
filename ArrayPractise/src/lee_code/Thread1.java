package lee_code;

public class Thread1 implements Runnable{

	public void run() {
		System.out.println("Gub thread");
		int b=10;
		while (b<=20) {
			System.out.println(b);
			b++;
		}
	}
}
