package concepts;

import java.util.Comparator;

public class Player implements Comparator<Player>{
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int compare(Player o1, Player o2) {
		return o1.name.hashCode()-o2.name.hashCode();
	}
}
