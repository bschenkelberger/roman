package de.bsch.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TDDTest {

	@Test
	public void testOneToNine() {
		assertEquals(1, Roman.convertInput("I"));
		assertEquals(2, Roman.convertInput("II"));
		assertEquals(3, Roman.convertInput("III"));
		assertEquals(4, Roman.convertInput("IV"));
		assertEquals(5, Roman.convertInput("V"));
		assertEquals(6, Roman.convertInput("VI"));
		assertEquals(7, Roman.convertInput("VII"));
		assertEquals(8, Roman.convertInput("VIII"));
		assertEquals(9, Roman.convertInput("IX"));
	}
	
	@Test
	public void testTenToTwenty() {
		assertEquals(10, Roman.convertInput("X"));
		assertEquals(11, Roman.convertInput("XI"));
		assertEquals(12, Roman.convertInput("XII"));
		assertEquals(13, Roman.convertInput("XIII"));
		assertEquals(14, Roman.convertInput("XIV"));
		assertEquals(15, Roman.convertInput("XV"));
		assertEquals(16, Roman.convertInput("XVI"));
		assertEquals(17, Roman.convertInput("XVII"));
		assertEquals(18, Roman.convertInput("XVIII"));
		assertEquals(19, Roman.convertInput("XIX"));
		assertEquals(20, Roman.convertInput("XX"));
		assertEquals(21, Roman.convertInput("XXI"));
		assertEquals(22, Roman.convertInput("XXII"));
		assertEquals(23, Roman.convertInput("XXIII"));
		assertEquals(24, Roman.convertInput("XXIV"));
		assertEquals(15, Roman.convertInput("XV"));
		assertEquals(16, Roman.convertInput("XVI"));
		assertEquals(17, Roman.convertInput("XVII"));
		assertEquals(18, Roman.convertInput("XVIII"));
		assertEquals(19, Roman.convertInput("XIX"));
		assertEquals(20, Roman.convertInput("XX"));
		assertEquals(21, Roman.convertInput("XXI"));
		assertEquals(22, Roman.convertInput("XXII"));
		assertEquals(23, Roman.convertInput("XXIII"));
		assertEquals(24, Roman.convertInput("XXIV"));
		assertEquals(25, Roman.convertInput("XXV"));
		assertEquals(26, Roman.convertInput("XXVI"));
		assertEquals(27, Roman.convertInput("XXVII"));
		assertEquals(28, Roman.convertInput("XXVIII"));
		assertEquals(29, Roman.convertInput("XXIX"));
		assertEquals(30, Roman.convertInput("XXX"));
	}
	
	@Test
	public void testForthyToFivety() {
		assertEquals(40, Roman.convertInput("XL"));
		assertEquals(41, Roman.convertInput("XLI"));
		assertEquals(42, Roman.convertInput("XLII"));
		assertEquals(43, Roman.convertInput("XLIII"));
		assertEquals(44, Roman.convertInput("XLIV"));
		assertEquals(45, Roman.convertInput("XLV"));
		assertEquals(46, Roman.convertInput("XLVI"));
		assertEquals(47, Roman.convertInput("XLVII"));
		assertEquals(48, Roman.convertInput("XLVIII"));
		assertEquals(49, Roman.convertInput("XLIX"));
		assertEquals(50, Roman.convertInput("L"));
	}

}
