package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class concatenateTest {

	@Test
	public void test() {
		ExampleClass ec = new ExampleClass();
		String result = ec.concatenateStrings("one", "two");
		assertEquals("onetwo", result);
	}

}
