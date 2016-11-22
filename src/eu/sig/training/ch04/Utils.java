package eu.sig.training.ch04;

public class Utils {

	public static int calcChkSum(String acc) {
        int sum = 0;
		for (int i = 0; i < acc.length(); i++) {
            sum = sum + (9 - i) * Character.getNumericValue(
                acc.charAt(i));
        }
		return sum;

	}
	
}
