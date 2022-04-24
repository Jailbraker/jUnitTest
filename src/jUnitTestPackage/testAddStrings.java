package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jUnit=new jUnitFunction();
		String result=jUnit.AddStrings("abc","def");
		assertEquals("abcdef",result);

	}

}
