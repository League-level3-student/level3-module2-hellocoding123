package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return num1 + " x " + num2 + " = " + num1*num2;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	for(int i = 0; i < eggs.size(); i++) {
    		if(eggs.get(i) == "cracked") {
    			return i;
    		}
    	}
        return 0;
    }

	public static boolean isPrime(int i) {
		for(int n = 2; n <= i/2; n++) {
			if(i%n == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSquare(int i) {
		if(Math.sqrt(i)%1 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean isCube(int i) {
		if(Math.cbrt(i)%1 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static int countPearls(List<Boolean> oysters) {
		
		int pearls = 0;
		
		for(int i = 0; i < oysters.size(); i++) {
    		if(oysters.get(i) == true) {
    			pearls++;
    		}
    	}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		
		for(int i = 0; i < peeps.size(); i++) {
    		if(peeps.get(i) > tallest) {
    			tallest = peeps.get(i);
    		}
    	}
		return tallest;
	}
}
