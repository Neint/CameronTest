public class DuckTestDrive{
	public static void main(String[] args) {
		Duck d1;
		Duck d2 = new Duck(12);
		System.out.println("main method");
		d1 = new Duck(11);

		System.out.println("(main)new Duck without parameter");
		Duck d3 = new Duck();

		System.out.println("(main)duck4=====reday");
		Duck d4 = new NewDuck(2);
	}
}