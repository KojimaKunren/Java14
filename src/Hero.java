
public class Hero {
	private String name;

	public void setString(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return this.name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Hero) {
		return toString().equals(((Hero)obj).toString());
		}
		return false;
	}
}
