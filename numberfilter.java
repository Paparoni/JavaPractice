import java.util.Arrays;

public class NonNumberFilter {
	public static void main(String[] args) {
		String[] array = { "1", "a", "b", "4", "3", "a", "6", "x", "d" };
		String[] arr2 = { "a" };
		System.out.print(Arrays.toString(filter(array)));
	}

	public static String[] push(String val, String[] orgArray) {

		String[] newArray = new String[orgArray.length + 1];

		System.arraycopy(orgArray, 0, newArray, 0, orgArray.length);

		newArray[orgArray.length] = val;

		return newArray;

	}

	public static String[] filter(String[] array) {
		int i = 0;
		int x = 0;

		while (i < array.length) {
			try {
				if (Integer.parseInt(array[i]) == Integer.parseInt(array[i])) {
					x++;
				}
			} catch (NumberFormatException nfe) {

			}
			i++;
		}
		String[] outputArray = new String[x];
		i = 0;
		int y = 0;
		while (i < array.length) {
			try {
				if (Integer.parseInt(array[i]) == Integer.parseInt(array[i])) {
					outputArray[y] = array[i];
					y++;
				}
			} catch (NumberFormatException nfe) {

			}
			i++;
		}
		return outputArray;
	}

}
