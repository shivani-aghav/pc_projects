package javaa;


import java.util.HashSet;

public class ReverseString {

	public static void main(String[] args) {
		
		HashSet<Object> set = new HashSet<>();
		
		String s = "geeks for geeks";
		char[] cs = s.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			
			for (int j = i + 1; j < cs.length; j++) {
                if (cs[i]==cs[j]&&cs[i]!=' ') {
           
					set.add(cs[j]);
				}
			}
		}
		
		System.out.println(set);
	}
}
