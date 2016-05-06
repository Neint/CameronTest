public class NewDuck extends Duck {
	public NewDuck(int newSize) {
		super(newSize);
		// super(111);
		System.out.println("Constructor of class NewDuck with arg!");
	}
	public NewDuck() {
		super();
		System.out.println("Constructor of class NewDuck without arg!");
	}

	public void eat() {
		System.out.println("NewDuck.eat");
	}
}