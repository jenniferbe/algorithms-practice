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
	 * @param elements is a list of unique numbers
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

	/**
	 * Compute the Depth of All Vertices
	 * @computeDepth takes in a tree of a graph and its root, and returns an ArrayList
	 * of depths in O(|V| + |E|), or O(n), time by depth first search.
	 * Depth, defined by the problem, starts at 0 (at the root) and increments by one
	 * at each level. If a node has been visited, it's depth is its initial value.
	 *
	 * @param t is the tree with numbered vertices for which we are finding depths.
	 * @return an ArrayList with the depths in the corresponding index.
	 */
	public ArrayList computeDepth(TreeNode tree) {
		ArrayList<Integer> depths = new ArrayList();
		Stack<TreeNode> fringe = new Stack(tree);
		int depth = 0;


	}

	public int computeDepthHelper(TreeNode tree, int depth)
}









