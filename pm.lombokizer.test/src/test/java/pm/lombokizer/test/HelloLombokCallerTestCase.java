package pm.lombokizer.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloLombokCallerTestCase {

	@Test
	public void testCall() {
		assertEquals("hello", HelloLombokCaller.call());
	}

	@Test(expected = MyStandartExceptionEx.class)
	public void testThrowException() throws MyStandartExceptionEx{
		HelloLombokCaller.throwException();
	}

}
