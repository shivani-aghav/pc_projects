package concepts;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		if (o1.score==o2.score) {
			return o1.name.hashCode()-o2.name.hashCode();
		}
		
		return o2.score-o1.score;
	}

	
}
