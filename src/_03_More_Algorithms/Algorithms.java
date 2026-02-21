package _03_More_Algorithms;

import java.util.List;

import _01_Sorting_Algorithms.SortingVisualizer;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		return num1 + " x " + num2 + " = " + num1 * num2;
	}

	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}
		return 0;
	}

	public static boolean isPrime(int i) {
		for (int n = 2; n <= i / 2; n++) {
			if (i % n == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSquare(int i) {
		if (Math.sqrt(i) % 1 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isCube(int i) {
		if (Math.cbrt(i) % 1 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int countPearls(List<Boolean> oysters) {

		int pearls = 0;

		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;

		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static Object findLongestWord(List<String> words) {

		int longestWord = 0;
		String longest = null;

		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestWord) {
				longestWord = words.get(i).length();
				longest = words.get(i);
			}
		}

		return longest;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		if (message1.contains("... --- ...")) {
			return true;
		}

		else {
			return false;
		}
	}
//fix this:
	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		List<Double> sorted = results;

		int swaps;
		Double temp;
		int t = 0;

		while (!(isSorted(sorted))) {
			for (int i = 0; i < sorted.size() - 1 - t; i++) {
				if (sorted.get(i) > sorted.get(i + 1)) {
					temp = sorted.get(i);
					sorted.set(i, sorted.get(i + 1));
					sorted.set(i + 1, temp);
				}
			}

			t++;
		}
		
		return sorted;

	}

	public static boolean isSorted(List<Double> array) {
		for (int i = 0; i < array.size() - 1; i++) {
			if (!(array.get(i) <= array.get(i + 1))) {
				return false;
			}
		}

		return true;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		List<String> sorted = unsortedSequences;

		int swaps;
		String temp;
		int t = 0;

		while (!(isSorted2(sorted))) {
			for (int i = 0; i < sorted.size() - 1 - t; i++) {
				if (sorted.get(i).length() > sorted.get(i + 1).length()) {
					temp = sorted.get(i);
					sorted.set(i, sorted.get(i + 1));
					sorted.set(i + 1, temp);
				}
			}

			t++;
		}
		
		return sorted;

	}

	public static boolean isSorted2(List<String> array) {
		for (int i = 0; i < array.size() - 1; i++) {
			if (!(array.get(i).length() <= array.get(i + 1).length())) {
				return false;
			}
		}

		return true;
	}

	public static List<String> sortWords(List<String> words) {
		List<String> sorted = words;

		int swaps;
		String temp;
		int t = 0;

		while (!(isSorted2(sorted))) {
			for (int i = 0; i < sorted.size() - 1 - t; i++) {
				if (sorted.get(i).compareTo(sorted.get(i + 1)) < 0) {
					temp = sorted.get(i);
					sorted.set(i, sorted.get(i + 1));
					sorted.set(i + 1, temp);
				}
			}

			t++;
		}
		
		return sorted;

	}

	public static boolean isSorted3(List<String> array) {
		for (int i = 0; i < array.size() - 1; i++) {
			if (!(array.get(i).length() <= array.get(i + 1).length())) {
				return false;
			}
		}

		return true;
	}

}
