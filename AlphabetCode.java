package alphabetCodes;

public class AlphabetCode {
	
	public static char getAlphabet(int num)
	{
		//creating the alphabet array
		char[] alphabet = new char[26];
		for(int i = 0; i<26; i++)
		{
			//initialising the array with the oorresponding character
			alphabet[i] = (char)(i+65);
		}
		//returning the alphabet array
		return alphabet[num];
	}
	
	public static String[] getAlphabetCode1()
	{
		//creating an array to store the alphabet with one digit
		String[] result = new String[26];
		for(int one = 0; one < result.length; one++)
		{
			//initalising the array with one digit of the alphabet
			//using the getAlphabet method
			result[one] = "" + getAlphabet(one);
			//print out the current digit that is being stored
			System.out.println(result[one]);
		}
		//return the one digit alphabet array
		return result;
	}
	
	public static String[] getAlphabetCode2()
	{
		//create an index variable to keep track where you are
		int index = 0;
		//creating an array to store the alphabet with two digits
		//ie AA, AB, AC,......,ZZ
		String[] result = new String[676];
		for(int one = 0; one < 26; one++) // first loop
		{
			for(int two = 0; two < 26; two++)//second loop
			{
				// getting the character for the first digit
				char alphaOne = getAlphabet(one);
				//getting the character for the second digit
				char alphaTwo = getAlphabet(two);
				//create a String with both digits and store it in the current spot in the array
				result[index] = "" + alphaOne + alphaTwo;
				//print out the current String that is being stored
				System.out.println(result[index]);
			}
		}
		//return the two digit alphabet array
		return result;
	}
	
	public static String[] getAlphabetCode3()
	{
		//create an index variable to keep track where you are
		int index = 0;
		//creating an array to store the alphabet with three digits
		//ie AAA, AAB, AAC,.......,ZZZ
		String[] result = new String[17576];
		for(int one = 0; one < 26; one++)//first loop
		{
			for(int two = 0; two < 26; two++)//second loop
			{
				for(int three = 0; three < 26; three++)//third loop
				{
					//getting the character for the first digit
					char alphaOne = getAlphabet(one);
					//getting the character for the second digit
					char alphaTwo = getAlphabet(two);
					//getting the character for the third digit
					char alphaThree = getAlphabet(three);
					//create a String with all digits and store it in the current spot in the array
					result[index] = "" + alphaOne + alphaTwo + alphaThree;
					//print out the current string that is being stored
					System.out.println(result[index]);
				}
			}
		}
		//return the three digit alphabet array
		return result;
	}
}
