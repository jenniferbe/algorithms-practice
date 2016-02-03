public class Algorithms {
	
	/** Integer Multiplication By Different Bases
	 * @basemultiply is a method that computes the product of two integers by
	 * multiplying and dividing by base.
	 *
	 * @param base is an integer that we divide by.
	 * @param x is an integer which is one of the two numbers to multiply
     * @param y is an integer which is the other of the two numbers to multiply
     * @return is the product of x and y
	 */
	public int baseMultiply(int base, int x, int y) {
		if (y == 0) return 0;
		z = baseMultiply(base, x, y/base);
		return (base * z) + x(y % base);
	}


}