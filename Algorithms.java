public class Algorithms {
	
	/**
	 * Integer Multiplication By Different Bases
	 * @basemultiply computes the product of two integers by dividing the
	 * multiplicand by the base and multiplying the multiplier both the base
	 * and the modulo of itself and the base
	 *
	 * @param base is an integer that we use to compute multiplication
	 * @param x is an integer which is the multiplicand
     * @param y is an integer which is the multiplier
     * @return is the product of x and y
	 */
	public int baseMultiply(int base, int x, int y) {
		if (x == 0 || y == 0) return 0;
		z = baseMultiply(base, x / base, y);
		return (base * z) + y(x % base);
	}

	/**
	 * Return a Peak Element
	 * @findPeak takes in a unique arraylist of numbers, and finds a "peak number,"
	 * or number that is higher than it's neighbors (it can be on the edge)
	 * in O(log n) times, where n = the number of items in the list.
	 *
	 * @param elements
	 * @return the index of the "peak" number
	 */
	public Number findPeak(ArrayList<Number> elements) {
		if elements.isEmpty() return None;
		int index = elements.size();
		if index.equals(1) return element[0];
		index = index / 2;

		if (elements[index - 1] < elements[index]) &&
				(elements[index + 1] < elements[index]) {
					return median;
				}
		else if (elements[index - 1] >= elements[index + 1]) {
			return findPeak(elements[0:index]);
		}
		else {
			return findPeak(elements[index:]);
		}
	}

}