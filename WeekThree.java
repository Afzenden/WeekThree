
public class WeekThree {

	public static void main(String[] args) {
		int[] ages = {3,9,23,64,2,8,28,93};
		System.out.println(ages[ages.length - 1] - ages[0]);

		int[] ages2 = {3,9,23,64,2,8,28,93,34};
		System.out.println(ages2[ages2.length - 1] - ages2[0]);

		int sum = 0;
		int avg = 0;
		for (int i=0; i < ages.length; i++) {
			sum += ages[i];
			avg = sum/ages.length;
		}
		System.out.println(avg);

		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int totalChars = 0;
		int avgChars = 0;

		for (int i = 0; i < names.length; i++) {
			totalChars += names[i].length();
		}

		avgChars = (totalChars / (names.length - 1));
		System.out.println(avgChars);

		String concatNames = "";
		for (int i = 0; i < names.length; i++) {
			concatNames += names[i] + " ";
		}
		System.out.println(concatNames);

		String concatNames2 = "";
		for (int i = 0; i < names.length; i++) {
			concatNames2 += names[i] + " " + names[i].length() + " ";
		}
		System.out.println(concatNames2);

		int arrLength = 0;
		for (int i = 0; i < names.length; i++) {
			arrLength += 1;
		}
		System.out.println(arrLength);

		System.out.println(smooshX("Hello", 3));

		System.out.println(concatName("Sam", "Lee"));

		int[] bunch = new int[] {15,23,67};
		System.out.println(getInts(bunch));

		double[] bigList = new double[] {15.5, 34,7, 67.8};
		System.out.println(getAvg(bigList));

		double[] biggerList = new double[] {15.5, 34,7, 7.8, 12.3};
		System.out.println(bigAvg(bigList, biggerList));

		boolean hot = true;
		double mip = 11.00;

		System.out.println(willBuyDrink(hot, mip));

		boolean isAfterMidnight = true;
		System.out.println(timeToStop(isAfterMidnight));

	}

	public static String smooshX(String w, int x) {
		String retSmooshX = "";
		for (int i = 0; i < x; i++) {
			retSmooshX += w;
		}
		return retSmooshX;
	}

	public static String concatName(String f, String l) {
		return (f + " " + l);
	}

	public static boolean getInts(int[] g) {
		int theSum = 0;
		for (int i = 0; i < g.length; i++) {
			theSum += g[i];
		}
		if (theSum > 100) {
			return true;
		}
		else {
			return false;
		}
	}

	public static double getAvg(double[] d) {
		double theAvg = 0;
		double intermAvg = 0;
		for (int i = 0; i < d.length; i++) {
			intermAvg += d[i];
		}
		theAvg = (intermAvg / d.length);
		return theAvg;
	}

	public static boolean bigAvg(double[] d, double[] bd) {
		double theAvg = 0;
		double intermAvg = 0;
		for (int i = 0; i < d.length; i++) {
			intermAvg += d[i];
		}
		theAvg = (intermAvg / d.length);

		double the2Avg = 0;
		double interm2Avg = 0;
		for (int j = 0; j < bd.length; j++) {
			interm2Avg += bd[j];
		}
		the2Avg = (interm2Avg / bd.length);

		if (theAvg > the2Avg) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = true && moneyInPocket > 10.50) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean timeToStop(boolean isAfterMidnight) {
		if (isAfterMidnight = true) {
			return true;
		}
		else {
			return false;
		}
	}

}
