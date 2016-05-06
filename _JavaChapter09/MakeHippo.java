public class MakeHippo {
	public static void main(String[] args) {
		// Hippo h = new Hippo("Buffy");
		Hippo h = new Hippo();
		System.out.println(h.getName());
		h.setName("newBuffy");
		System.out.println(h.getName());
	}
}