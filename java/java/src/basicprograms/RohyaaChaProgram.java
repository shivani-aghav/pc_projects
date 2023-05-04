package basicprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RohyaaChaProgram {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		int firstNo = sc.nextInt();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String r = bf.readLine();
		String rd = bf.readLine();
		
		String[] s = rd.trim().split("\\s+");
		System.out.println(r);
		for (int i = 0; i < s.length; i++) {
			int p = Integer.parseInt(s[i]);
			System.out.print(p+" ");
		}
		List<String> w = Arrays.asList(r);
		List<String> q = Arrays.asList(s);
		System.out.println();
		String[] d = rd.split(" ");
		if (r.length()==d.length) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(sc.nextInt());
//		System.out.println(firstNo);
//		System.out.println(list.add(sc.nextInt()));
		
//		System.out.println(firstNo);
//		for (int i = 0; i <25; i++) {
//			list.add(sc.nextInt());
//		}
//		System.out.println(firstNo);
//		for (Integer in : list) {
//			System.out.println(in+" ");
//		}
	}
}
