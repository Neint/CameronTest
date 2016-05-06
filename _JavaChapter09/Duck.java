public class Duck{
	private int size;
	public Duck() {
		System.out.println("Constructor of class Duck without parameter!");
		size = 99;
		System.out.println("size = " + size);
		// System.out.println("size = " + size);
	}
	public Duck(int duckSize) {
		System.out.println("Constructor of class Duck with parameter!");
		size = duckSize;
		System.out.println("size = " + size);
		// System.out.println("size = " + size);
	}
}