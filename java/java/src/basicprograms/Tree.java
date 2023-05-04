package basicprograms;

public class Tree {

	public static String name() {
		
		try {
			return "try catch block";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			return "finally block";
		}
	
	}
	public static void main(String[] args) {
		String name = Tree.name();
		System.out.println(name);
	}
}
