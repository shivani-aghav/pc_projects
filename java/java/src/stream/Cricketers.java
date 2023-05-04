package stream;

public class Cricketers {

	private String name;
	private int jersyNo;
	private int score;

	public Cricketers(String name, int jersyNo, int score) {
		super();
		this.name = name;
		this.jersyNo = jersyNo;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Cricketers [name=" + name + ", jersyNo=" + jersyNo + ", score=" + score + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJersyNo() {
		return jersyNo;
	}

	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
