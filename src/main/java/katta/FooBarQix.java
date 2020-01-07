package katta;

/**
 * 
 * @author Amine
 *
 */
public class FooBarQix {

	private int start;

	private int end;

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

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String handleDivisibilty(int number) {

		return null;
	}

	public String handleContains(int number) {

		return null;
	}

	public String convertToFooBarQix(int number) {

		return null;
	}

	public void printSequence() {

		return;
	}

}
