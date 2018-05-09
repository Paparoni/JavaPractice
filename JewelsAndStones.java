
public class JewelsAndStones {
	private static String J = "aA";

	public static void main(String args[]) {

		System.out.print(countJewels("aAaaAAbb"));

	}

	public static int countJewels(String jewels) {
		char[] possibleJewels = J.toCharArray();

		char[] jewelsOwned = jewels.toCharArray();

		int jewelCount = 0;

		for (int i = 0; i < jewelsOwned.length; i++) {
			char ownedJewel = jewelsOwned[i];
			for (int x = 0; x < possibleJewels.length; x++) {
				if (ownedJewel == possibleJewels[x]) {
					jewelCount++;
				}
			}
		}
		return jewelCount;
	}
}
