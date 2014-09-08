import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KnapsackTest {
	private Knapsack k;

	@Before
	public void setUp() throws Exception {
		k = new Knapsack();
	}

	@Test
	public void test0() {
		int[] s = { 100, 50, 45, 20, 10, 5 };
		int[] v = { 40, 35, 18, 4, 10, 2 };
		int c = 100;
		int expected = 55;
		assertEquals(expected, k.fill(s, v, c));
	}

}
