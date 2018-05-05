
public class StringMask {
	public static void main(String args[])
	{
		System.out.print(mask("heyimaj"));
	}
	
	public static String mask(String string) 
	{
		int len = string.length();
		String newString = string.substring(0, len-4);
		newString += "####";
		return newString;
	}
}
