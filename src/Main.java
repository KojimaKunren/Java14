
public class Main {
	public static void main(String[] args) {

				Hero h1 = new Hero("勇者1",50,100);
				Hero h2 = new Hero("勇者2",50,150);
				Hero h3 = new Hero("勇者3",50,200);

				System.out.println("h1の所持金： " + h1.getMoney());
				System.out.println("h2の所持金： " + h2.getMoney());
				System.out.println("h3の所持金： " + h3.getMoney());
				h1.setMoney(h1.getMoney() + 100);
				System.out.println("h1の所持金： " + h1.getMoney());
				System.out.println("h2の所持金： " + h2.getMoney());
				System.out.println("h3の所持金： " + h3.getMoney());
				h2.setMoney(h2.getMoney() + 100);;
				System.out.println("h1の所持金： " + h1.getMoney());
				System.out.println("h2の所持金： " + h2.getMoney());
				System.out.println("h3の所持金： " + h3.getMoney());
				h3.setMoney(h3.getMoney() + 100);
				System.out.println("h1の所持金： " + h1.getMoney());
				System.out.println("h2の所持金： " + h2.getMoney());
				System.out.println("h3の所持金： " + h3.getMoney());
				
				System.out.println(Hero.getMoney());
	}
}
