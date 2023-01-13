package de.bsch.roman;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class NumberRomanConstants {

	static final int NUMBER_ONE = 1;
	static final int NUMBER_FOUR = 4;
	static final int NUMBER_FIVE = 5;
	static final int NUMBER_NINE = 9;
	static final int NUMBER_TEN = 10;
	static final int NUMBER_FORTY = 40;
	static final int NUMBER_FIFTY = 50;

	static final String ROMAN_ONE = "I";
	static final String ROMAN_FOUR = "IV";
	static final String ROMAN_FIVE = "V";
	static final String ROMAN_NINE = "IX";
	static final String ROMAN_TEN = "X";
	static final String ROMAN_FIFTY = "L";
	static final String ROMAN_FORTY = "XL";


	static final List<String> variations = Arrays.asList(ROMAN_FOUR, ROMAN_NINE, ROMAN_FORTY);
	
			
	static Map<String, Integer> numberRomanMap;
	static {
		numberRomanMap = new HashMap<String, Integer>();
		numberRomanMap.put(ROMAN_ONE, NUMBER_ONE);
		numberRomanMap.put(ROMAN_FOUR, NUMBER_FOUR);
		numberRomanMap.put(ROMAN_FIVE, NUMBER_FIVE);
		numberRomanMap.put(ROMAN_NINE, NUMBER_NINE);
		numberRomanMap.put(ROMAN_TEN, NUMBER_TEN);
		numberRomanMap.put(ROMAN_FORTY, NUMBER_FORTY);
		numberRomanMap.put(ROMAN_FIFTY, NUMBER_FIFTY);
	}
}
