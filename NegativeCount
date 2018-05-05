import java.util.Arrays;

public class NegativeCount {
	public static int[] filter(int[] array)
	{
		int positiveCount = 0;
		int[] negativeArray = new int[array.length];

		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > 0)
			{
				positiveCount++;
			} else 
			{
				negativeArray[i] = array[i];
			}
		}
		int total = 0;
		for (int i = 0; i < negativeArray.length; i++)
		{
			total += negativeArray[i];
		}
		
		return new int[] { positiveCount, total };
	}
	public static void main(String args[]) 
	{
		int[] testArray = new int[] {92, 6, 73, -77, 81, -90, 99, 8, -85, 34};
		
		System.out.println(Arrays.toString(filter(testArray)));
	}
}
