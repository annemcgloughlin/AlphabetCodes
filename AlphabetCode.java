package alphabetCodes;

public class AlphabetCode {
	
	public static char getAlphabet(int num)
	{
		char[] alphabet = new char[26];
		for(int i = 0; i<26; i++)
		{
			alphabet[i] = (char)(i+65);
		}
		
		return alphabet[num];
	}
	
	public static String[] getAlphabetCode1()
	{
		String[] result = new String[26];
		for(int one = 0; one < result.length; one++)
		{
			result[one] = "" + getAlphabet(one);
			System.out.println(result[one]);
		}
		return result;
	}
	
	public static String[] getAlphabetCode2()
	{
		int index = 0;
		String[] result = new String[676];
		for(int one = 0; one < 26; one++)
		{
			for(int two = 0; two < 26; two++)
			{
				char alphaOne = getAlphabet(one);
				char alphaTwo = getAlphabet(two);
				result[index] = "" + alphaOne + alphaTwo;
				System.out.println(result[index]);
			}
		}
		return result;
	}
	
	public static String[] getAlphabetCode3()
	{
		int index = 0;
		String[] result = new String[17576];
		for(int one = 0; one < 26; one++)
		{
			for(int two = 0; two < 26; two++)
			{
				for(int three = 0; three < 26; three++)
				{
					char alphaOne = getAlphabet(one);
					char alphaTwo = getAlphabet(two);
					char alphaThree = getAlphabet(three);
					result[index] = "" + alphaOne + alphaTwo + alphaThree;
					System.out.println(result[index]);
				}
			}
		}
		return result;
	}
}
