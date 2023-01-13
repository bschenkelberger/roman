package de.bsch.roman;

import static de.bsch.roman.NumberRomanConstants.numberRomanMap;
import static de.bsch.roman.NumberRomanConstants.variations;

import org.apache.commons.lang3.StringUtils;

public class Roman {

	public static int convertInput(String input) {

		int result = 0;
		int lengthOfInput = input.length();
		if (lengthOfInput < 3) {
			result = handleRomanUntilTwoChar(result, input);
		} else {
			result = handleAllOtherRoman(result, input, lengthOfInput);
		}

		return result;
	}

	private static Integer handleAllOtherRoman(int tmpResult, String input, int lengthOfInput) {
		int result = tmpResult;
		String[] inputAsArray = input.split("");
		String charAtIndex1 = StringUtils.EMPTY;
		for (int index = 0, tmpIndex = 0; index < inputAsArray.length; index++, tmpIndex = index) {
			charAtIndex1 = inputAsArray[index];
			tmpIndex++;
			
			if (tmpIndex < lengthOfInput) {
				String tmp = charAtIndex1 + inputAsArray[tmpIndex];
				if (variations.contains(tmp)) {
					result = handleRomanUntilTwoChar(result, tmp);
					index = tmpIndex;
					continue;
				}
			}
			
			if (checkIfFixParameter(charAtIndex1)) {
				result = handleRomanUntilTwoChar(result, charAtIndex1);
			}
		}

		return result;
	}

	private static Integer handleRomanUntilTwoChar(int result, String input) {
		// Sonderbehandlung für IV, IX und XL
		Integer value = numberRomanMap.get(input);
		if (value != null) {
			result = result + value;
		} else {
			String[] inputAsArray = input.split("");
			for (int index = 0; index < inputAsArray.length; index++) {
				result = result + numberRomanMap.get(inputAsArray[index]);
			}
		}
		return result;
	}

	private static boolean checkIfFixParameter(String charAtIndex1) {
		return isOne(charAtIndex1) || isFive(charAtIndex1) || isTen(charAtIndex1) || isFifty(charAtIndex1);
	}

	private static boolean isOne(String value) {
		return value.equals(NumberRomanConstants.ROMAN_ONE);
	}

	private static boolean isFive(String value) {
		return value.equals(NumberRomanConstants.ROMAN_FIVE);
	}

	private static boolean isTen(String value) {
		return value.equals(NumberRomanConstants.ROMAN_TEN);
	}

	private static boolean isFifty(String value) {
		return value.equals(NumberRomanConstants.ROMAN_FIFTY);
	}

}
