package javaa;

public interface Intera {

	public default void name() {
		System.out.println("default");
	}

	public static void mii() {
		System.out.println("static");
	}

	void ro();
}

interface key {

}

interface longe {

}

class keuuu {

}

class huuu {

}

class supery extends keuuu implements Intera, key, longe {

	@Override
	public void ro() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Intera.mii();
	}

	@Override
	public void name() {
		System.out.println("yde");
		Intera.super.name();
	}

}
