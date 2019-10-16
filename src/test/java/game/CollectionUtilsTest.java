package game;

import static game.CollectionUtils.productOf;
import static game.CollectionUtils.sumOf;
import static game.CollectionUtils.toCSV;
import static org.junit.Assert.assertEquals;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class CollectionUtilsTest {

	@Test
	public void testSumAndProductOf() {
		Set<Integer> numbers = new HashSet<Integer>();

		BigInteger sum = BigInteger.ZERO;
		BigInteger product = BigInteger.ONE;
		for (int i = 0; i < 100; i++) {
			sum = sum.add(BigInteger.valueOf(i));
			product = product.multiply(BigInteger.valueOf(i));
			numbers.add(i);
			assertEquals(sum, sumOf(numbers));
			assertEquals(product, productOf(numbers));
		}
	}

	@Test
	public void testToCSV() {
		assertEquals("", toCSV(Arrays.asList()));
		assertEquals("1", toCSV(Arrays.asList(1)));
		assertEquals("1, 2, 3", toCSV(Arrays.asList(1, 2, 3)));
	}
}
