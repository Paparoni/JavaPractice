
public class SquareEveryDigit {

	public static void main(String[] args) {
		
		System.out.println(square(9119));

	}
	
	public static int square(int digit) 
	{
		String stringDigit = Integer.toString(digit);
		String[] stringDigitArray = stringDigit.split("");
		String[] finalArray = new String[stringDigitArray.length];
		for(int i = 0; i < stringDigitArray.length; i++) {
			int parsedValue = Integer.parseInt(stringDigitArray[i]);
			parsedValue *= parsedValue;
			finalArray[i] = Integer.toString(parsedValue);
		}
		
		String finalDigitString = String.join("", finalArray);
		
		return Integer.parseInt(finalDigitString);
		
	}

}
