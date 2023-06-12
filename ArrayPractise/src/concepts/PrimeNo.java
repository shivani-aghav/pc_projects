package concepts;

public class PrimeNo {

	public static void main(String[] args) {
		int a = 40;
		if (isPrime(a)) {
			System.out.println("Prime number it is...");
		} else {
			System.err.println("not prime number");
		}
	}

	private static boolean isPrime(int a) {
		boolean s=false;
		int count=0;
		for (int i = 2; i < a/2; i++) {
			if (a%i==0) {
				count++;
				break;
			}
		}
		if (count==0) {
			return true;
		}
		return s;
	}
}
