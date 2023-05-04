import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prcside {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 4, 5, 8, 8, 6, 5, 6, 6 };
		
		IntStream.of(a).boxed().filter(t->t%2==0).collect(Collectors.counting());
	}
}
