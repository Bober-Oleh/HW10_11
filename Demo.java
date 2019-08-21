package NewHomework;

public class Demo {
	public static void main(String args[]) {
		Candy lollipop = new Lollipop("lollipop", 5, 25);
		Candy Gum = new Gum("gum", 15, 5);
		Candy ChocolateCandy = new ChocolateCandy("chocolateCandy", 10, 40);

		Gift gift = new Gift();

		gift.addCandy(lollipop);
		gift.addCandy(Gum);
		gift.addCandy(ChocolateCandy);

		gift.showGift();
		gift.showGiftWeight();
		gift.sortCandies();
		gift.showGift();
		gift.showCandyWithGivenSugar(25);
	}
}
