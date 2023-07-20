
public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		Hero h2 = new Hero();
		h.setString("aaa");
		h2.setString("aaa");
		System.out.println(h.equals(h2));
	}
}
