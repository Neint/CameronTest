public abstract class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String theName) {
		name = theName;
	}

	public Animal(String theName) {
		name = theName;
		name = theName; // no thing will happen
	}
	public Animal() {
		super();
	}
	// Cameron add some thing
}