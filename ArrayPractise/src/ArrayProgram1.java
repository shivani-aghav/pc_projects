import java.util.ArrayList;
import java.util.List;

public class ArrayProgram1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1000; i <=3000; i++) {
			list.add(i);
		}
		
		String s[]=new String[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			s[i]=list.get(i)+"";
		}
		
		for (int i = 0; i < s.length; i++) {
			int k=0;
			while (k<4) {
				if (s[i].charAt(k)=='0'||s[i].charAt(k)=='2'||s[i].charAt(k)=='4'||s[i].charAt(k)=='6'||s[i].charAt(k)=='8') {
					System.out.println(s[i]);
					break;
				}
				k++;
			}
		}
	}
}
