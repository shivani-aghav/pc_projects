package concepts;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
	
		Checker checker = new Checker();
		Player p[]= {new Player("amy", 100),
				new Player("david", 100), 
				new Player("heraldo", 50),
				new Player("aakansha", 75), 
				new Player("aleksa", 150)};
		Arrays.sort(p,checker);
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].name+" "+p[i].score);
		}
	}
}
