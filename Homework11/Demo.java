package Homework11;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Demo {
	public static void main(String[] args) {

		String str = "Оставь надежду всяк это учащий";
		String[] advice = str.split(" ");

		List<String> myAdvice = new ArrayList<String>(Arrays.asList(advice));
		for (String s : myAdvice) {
			System.out.print(s + " ");
		}

		myAdvice.add("БЕГИ");
		for (String s : myAdvice) {
			System.out.print(s + " ");
		}

		myAdvice.remove("это");
		System.out.println("The word is removed " + myAdvice.toString());

		System.out.println(myAdvice.indexOf("это"));

		String[] myStr = myAdvice.toArray(new String[myAdvice.size()]);
		System.out.println(Arrays.deepToString(myStr));

		System.out.println(myAdvice.size());

		System.out.println(myAdvice.contains("учащий"));

		System.out.println(myAdvice.containsAll(myAdvice));

		myAdvice.clear();
		if (myAdvice.size() == 0) {
			System.out.println("The List cleared successfully");
		} else {
			System.out.println("You made a mistake in the code");
		}

	}

}
