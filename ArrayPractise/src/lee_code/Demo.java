package lee_code;

public class Demo implements Runnable{

	
	public void run() {
		System.out.println("Thread is runningg");
		int a=0;
		while (a<=10) {
			System.out.println(a);
			a++;
		}
	}
	
	public static void main(String[] args) {
//		Demo d=new Demo();
//		d.start();
//		Thread1 t1 = new Thread1();
//		t1.start();
//		d.start();
		Thread t1 = new Thread(new Demo());
		t1.start();
		Thread t2 = new Thread(new Thread1());
		t2.start();
	}
}
