package katta;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Amine
 *
 */
public class TestFooBarQix {

	FooBarQix fooBarQix;

	@Before
	public void init() {

		fooBarQix = new FooBarQix(0, 100);
	}

	@Test(expected = IllegalArgumentException.class)
	public void when_Constructor_Use_Invalid_Arguments() throws IllegalArgumentException {

		FooBarQix fooBarQixError = new FooBarQix(100, 1);

	}

	@Test
	public void when_divisors_have_higher_precedence() {

		assertEquals("FooBar", fooBarQix.convertToFooBarQix(51));
	}

	@Test
	public void when_Divisible_by_3() {

		assertEquals("Foo", fooBarQix.convertToFooBarQix(9));
	}

	@Test
	public void when_Divisible_by_5() {

		assertEquals("Bar", fooBarQix.convertToFooBarQix(10));

	}

	@Test
	public void when_Divisible_by_7() {

		assertEquals("Qix", fooBarQix.convertToFooBarQix(14));

	}

	@Test
	public void when_Divisible_by_3_and_5_and_contains_5() {

		assertEquals("FooBarBar", fooBarQix.convertToFooBarQix(15));

	}

	@Test
	public void when_Divisible_by_3__and_contains_3_two_times() {

		assertEquals("FooFooFoo", fooBarQix.convertToFooBarQix(33));

	}

	@Test
	public void when_Divisible_by_3_and_contains_7() {

		assertEquals("FooQix", fooBarQix.convertToFooBarQix(27));

	}

}
