package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class multiplyTest {

	@Test
	public void test() {
		ExampleClass ec = new ExampleClass();
		int result = ec.multiplyNumbers(5, 4);
		assertEquals(20, result);
	}

}
