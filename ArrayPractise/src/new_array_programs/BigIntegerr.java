package new_array_programs;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerr {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}
