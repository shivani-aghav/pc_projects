package stream.stream2;

import java.util.Arrays;
import java.util.List;

public class LogicalProgram {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1,2,3,4,5);
		int p[]=new int[a.size()];
		
		for (int i = 0; i < a.size(); i++) {
			int tmp=0;
			for (int j = 0; j < a.size(); j++) {
				tmp=tmp+a.get(j);
			}
			tmp=tmp-a.get(i); //106 97 118 97 =418
			p[i]=tmp; //104  101 108 108 48 = 469
		} 
		System.out.println();
		System.out.println("Min : "+p[p.length-1]+"\n"+ "Max : " +p[0]);
		
		char c='0';
		for (int i = 0; i < 4; i++) {
			int z=(char)c;
			System.out.println(z);
		}
		
	}
}
