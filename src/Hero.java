
public class Hero {
	private String name;
	private int hp;
	private static int money;
	
	public Hero(String name, int hp, int money) {
		setString(name);
		setHp(hp);
		setMoney(money);
	}

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
		return false;}

		public int getHp() {
			return this.hp;
		}

		public void setHp(int hp){
			this.hp = hp;
		}

		public static int getMoney(){
			return money;
		}

		public static void setMoney(int money){
			Hero.money = money;
		}
		
		public static void setRandomMoney() {
			Hero.money = (int)(Math.random() * 1000);
		}
	}
