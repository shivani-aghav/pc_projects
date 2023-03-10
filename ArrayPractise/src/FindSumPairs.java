public class FindSumPairs {

	public static void main(String[] args) {
		int[] a = { 4, 6, 5, -10, 8, 5, 20 };
		int n = 10;
//		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == n) {
//					map.put(a[i], a[j]);
					System.out.println(a[i] + " + " + a[j] + " = " + n);
				}
			}
		}
//		System.out.println(map);
	}
}
