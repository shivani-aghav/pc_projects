package javaa;


public class Variable_Lambda{

	int r=1000;
	public void show() {
		int r=10; //local variable will not be initialized it is considered as final variable
		Intera i=()-> System.out.println(this.r);
		this.r=90;
	}
	public static void main(String[] args) {
		Variable_Lambda lambda=new Variable_Lambda();
		lambda.show();
	}
}
