package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitStrings = new jUnitFunction();
		String result = junitStrings.addStrings("this is"," lab9");
		assertEquals("this is lab9", result);
	}

}

