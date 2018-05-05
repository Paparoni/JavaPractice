import java.util.Arrays;

public class NumberOrder {
	public static void main(String[] args) 
	{
		long testNumber = 47364732;
		System.out.println(order(testNumber));
	}
	public static int[] reverse(int[] array)
	{
		int x = 0;
		int Alength = array.length;
		int[] newArray = new int[Alength];
		while (x < array.length) 
		{
			newArray[Alength - x - 1] = array[x];
			x++;
		}
		
		return newArray;
	}
	public static long order(Long number) 
	{
		String longString = number.toString();
		
		String[] longStringArray = longString.split("\\B");
		
		int i = 0;
		int num;
		int[] integerArray = new int[longStringArray.length];
		
		while (i < longStringArray.length)
		{
			num = Integer.parseInt(longStringArray[i]);
			integerArray[i] = num;
			i++;
		}
		
		
		Arrays.sort(integerArray);
		int[] reversedIntArray = reverse(integerArray);
		i = 0;
		String num2;
		String[] resultArray = new String[longStringArray.length];
		while(i < reversedIntArray.length) 
		{
			num2 = Integer.toString(reversedIntArray[i]);
			resultArray[i] = num2;
			i++;
		}
		String finalString = String.join("", resultArray);
		
		return Long.parseLong(finalString);
	}
}
