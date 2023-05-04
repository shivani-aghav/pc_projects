package BasicsLatest;

abstract public class Tree {

	public static void name() {
		System.out.println("");
	}public static void main(String[] args) {
		Tree tree = new Plant();
		tree.name();
	}
	static {
		
	}
	{
		System.out.println("non static");
	}
}

class Plant extends Tree{
	public static void main(String[] args) {
		Tree tree = new Plant();
		tree.name();
	}
}
