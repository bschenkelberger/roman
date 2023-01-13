package de.bsch.roman;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Roman {

	private static final int NUMBER_FIFTY = 50;
	private static final int NUMBER_TEN = 10;
	private static final int NUMBER_FIVE = 5;
	private static final int NUMBER_ONE = 1;
	private static final int NUMBER_FORTY = 40;
	private static final int NUMBER_NINE = 9;
	private static final int NUMBER_FOUR = 4;
	private static final String ROMAN_ONE = "I";
	private static final String ROMAN_FOUR = "IV";
	private static final String ROMAN_FIVE = "V";
	private static final String ROMAN_NINE = "IX";
	private static final String ROMAN_TEN = "X";
	private static final String ROMAN_FIFTY = "L";
	private static final String ROMAN_FORTY = "XL";


	private static final List<String> VARIANTIONS = Arrays.asList(ROMAN_FOUR, ROMAN_NINE, ROMAN_FORTY);

	public static int convertInput(String input) {

		int result = 0;
		int lengthOfInput = input.length();
		switch (lengthOfInput) {
		case 1:
			result = handleOne(result, input);
			break;
		case 2:
			result = handleTwo(result, input);
			break;
		default:
			result = handleOthers(result, input, lengthOfInput);
			break;
		}

		return result;
	}

	private static Integer handleOthers(int tmpResult, String input, int lengthOfInput) {
		int result = tmpResult;
		char[] charArray = input.toCharArray();
		String charAtIndex1 = StringUtils.EMPTY;
		String charAtIndex2 = StringUtils.EMPTY;
		for (int index = 0, tmpIndex = 0; index < charArray.length; index++, tmpIndex = index) {
			charAtIndex1 = String.valueOf(charArray[index]);
			tmpIndex++;
			if (tmpIndex < lengthOfInput) {
				charAtIndex2 = String.valueOf(charArray[tmpIndex]);
				String tmp = charAtIndex1 + charAtIndex2;
				if (VARIANTIONS.contains(tmp)) {
					result = handleTwo(result, tmp);
					index = tmpIndex;
					continue;
				}
			}
			if (checkIfFixParameter(charAtIndex1)) {
				result = handleOne(result, charAtIndex1);
			}
			charAtIndex2 = StringUtils.EMPTY;
		}

		return result;
	}

	// IV = 4
	// IX = 9
	// XL = 40
	private static Integer handleTwo(int result, String input) {

		if (input.equals(ROMAN_FOUR)) {
			result = result + NUMBER_FOUR;
		} else if (input.equals(ROMAN_NINE)) {
			result = result + NUMBER_NINE;
		} else if (input.equals(ROMAN_FORTY)) {
			result = result + NUMBER_FORTY;
		} else {
			String[] inputAsArray = input.split("");
			for (int index = 0; index < inputAsArray.length; index++) {
				String stringAtIndex = inputAsArray[index];
				result = handleOne(result, stringAtIndex);
			}
		}
		return result;
	}

	private static Integer handleOne(int result, String input) {
		if (isOne(input)) {
			result = result + NUMBER_ONE;
		} else if (isFive(input)) {
			result = result + NUMBER_FIVE;
		} else if (isTen(input)) {
			result = result + NUMBER_TEN;
		}else if (isFifty(input)) {
			result = result + NUMBER_FIFTY;
		}
		return result;
	}

	private static boolean checkIfFixParameter(String charAtIndex1) {
		return isOne(charAtIndex1) || isFive(charAtIndex1) || isTen(charAtIndex1) || isFifty(charAtIndex1);
	}

	private static boolean isTen(String value) {
		return value.equals(ROMAN_TEN);
	}

	private static boolean isOne(String value) {
		return value.equals(ROMAN_ONE);
	}

	private static boolean isFive(String value) {
		return value.equals(ROMAN_FIVE);
	}

	private static boolean isFifty(String value) {
		return value.equals(ROMAN_FIFTY);
	}


}
