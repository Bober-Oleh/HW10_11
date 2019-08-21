package NewHomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gift {
	List<Candy> candies = new ArrayList();

	public void showGift() {
		candies.stream().forEach(x -> System.out.println(x));
		System.out.println();
	}

	public void addCandy(Candy candy) {
		this.candies.add(candy);
	}
	public void sortCandies() {
		Collections.sort(candies);
	}

	public void showGiftWeight() {
		int sum = candies.stream().mapToInt(z -> z.getWeight()).sum();
		System.out.println("Gift weight is " + sum);
		System.out.println();
	}

	public void showCandyWithGivenSugar(int sugar) {
		candies.stream().filter(z -> z.getSugar() == sugar).forEach(System.out::println);
		System.out.println();
	}
}