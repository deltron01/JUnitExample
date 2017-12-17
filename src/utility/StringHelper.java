package utility;

public class StringHelper {
	
	/*
	 * Remove all character 'A' in first two positions of a given String
	 * "ABCD" => "BCD", "AACD" => "CD", "BACD" => "BCD", "AAAA" => "AA, "BCDE" => "BCDE"
	 */
	public String truncateAinFirst2Positions(String input){
		if(input.length() <= 2)
			return input.replaceAll("A", "");
		String first2Chars = input.substring(0, 2);
		String minus2FirstChars = input.substring(2);
		
		return first2Chars.replaceAll("A", "")+minus2FirstChars;
	}
	/*
	 * Check if first two and last two characters in the string are the same
	 * Hint : substring method. "" => false
	 * "A" => false, "AB" => true, "ABC" => false, "AAA" => true, "ABCAB => true
	 */
	public boolean areFirstAndLast2CharTheSame(String input){
		if(input.length() <= 1)
			return false;
		if(input.length() == 2)
			return true;
		String first2Chars = input.substring(0, 2);
		String last2Chars = input.substring(input.length() - 2);
		
		return first2Chars.equals(last2Chars);
	}

}
