package katta;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @author Amine
 *
 */
public class FooBarQix {

	private int start;

	private int end;

	private List<Integer> divisorsList = Arrays.asList(3, 5);

	private Map<Integer, String> patternsMap = Collections.unmodifiableMap(
			Stream.of(new SimpleEntry<>(3, "Foo"), new SimpleEntry<>(5, "Bar"), new SimpleEntry<>(7, "Qix"))
					.collect(Collectors.toMap((e) -> e.getKey(), (e) -> e.getValue())));

	/**
	 * @param start
	 * @param end
	 */
	public FooBarQix(int start, int end) {

		if (start > end)
			throw new IllegalArgumentException("The argument [start] must be lower than [end].");

		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	public String handleDivisibilty(int number) {

		return this.divisorsList.stream().map(divisor -> number % divisor == 0 ? patternsMap.get(divisor) : "")
				.reduce("", String::concat);
	}

	/**
	 * @param number
	 * @return
	 */
	public String handleContains(int number) {

		return String.valueOf(number).codePoints().mapToObj(c -> Integer.parseInt(String.valueOf((char) c)))
				.map(this.patternsMap::get).filter(Objects::nonNull).reduce("", String::concat);
	}

	public String convertToFooBarQix(int number) {

		StringBuilder sb = new StringBuilder();
		sb.append(handleDivisibilty(number)).append(handleContains(number));

		return sb.toString();
	}

	public void printSequence() {

		IntStream.rangeClosed(start, end).boxed().map(this::convertToFooBarQix).forEach(System.out::println);
	}

}
