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

procedure findSAT(Graph):
decreasingPostNumbers = depthFirstSearch(Graph.Reversed)
listOfComponents = undirectedConnectedComponents(G)
for connected in listOfComponents:
		if literal and negation in connected, return Error
		for each in connected:
			if each is a literal, each == true
			else, each == false

points = FFT(p(x),!)
for each in points: each^2
pSquaredCoefficients = 1/n FFT(points,!1)
p(x) = attach pSquaredCoefficients to polynomial
pcubedPoints = (p(!0)q(!0), ..., p(!d1)q(!d1))
pcubedCoefficients =1/n FFT(pcubedPoints,!1)
check if there is a coefficient that corresponds toxt

\textbf{procedure} findMajorityLinear(list):\\
newList = copyOf(list);\\
\textbf{while} newList $> 3$: \\
$>>>$ \textbf{for} each pair \textbf{in} newList:\\
$>>>>>>$ discard both if they are different\\
$>>>>>>$ keep one element if they are the same\\
$>>>>>>$ if it's the unpaired element, keep\\
\textbf{for} each element \textbf{in} newList:\\
$>>>$ \textbf{if} list.count(element) $>$ size(list)//2 \textbf{then return} element\\
\textbf{else return} none


\textbf{procedure} cheapestPath(cityA, cityB)\\
stored = \textbf{new} List (containing cost, count)\\
set all (cost, path) in stored to $(\infty$, ["a"])\\
fringe = \textbf{new} PriorityQueue\\
\textbf{for} all j \textbf{in} range 0 to n\\
$>>>$ fringe.add( (( edge A to j, M[cityA][j]), M[cityA][j]) )\\
\textbf{while} fringe \textbf{is not empty}\\
$>>>$ (i, j), cost = fringe.pop\\
$>>>$ \textbf{if} it's stored cost to j $>$ cost\\
$>>>>>>$ stored[j] = (cost, path[i] + ["j"])\\
$>>>>>>$ \textbf{if} j = cityB \textbf{return} cost, path[j]\\
$>>>>>>$ \textbf{for} all k \textbf{in} range 0 to n\\
$>>>>>>>>>$ fringe.add( (( (j, k), cost + m[j][k]), cost + m[j][k] + len(stored path of j))\\
\textbf{return} None

\textbf{procedure} findShortestPath(G, l, H, s, t)\\
dijkstras(G, l, s)\\
dijkstras(G, l, t)\\
pq = priorityQueue\\
for each edge=(i,j) $\in$ H:\\
$>>>$ pq.add( edge, dist(s, i) + l(i, j) + dist(j, t))\\
\textbf{return} pq.pop()

\textbf{procedure}  preventConflict(E (enemy edges) )\\
for i in range 1 up to n:\\
$>>>$ roomA, roomB, uninitialized = 0, 0, list\\
$>>>$ for each in (i, v) in E:\\
$>>>>>>$ if in room A: roomA++\\
$>>>>>>$ else if in room B: roomB++\\
$>>>>>>$ else, add into unitialized\\
$>>>$ put into roomA if roomA < roomB, else put into roomB\\



\textbf{procedure} superSchmoozers(G):\\
for all v in V:\\
$>>> $ put in priorityQueue, Q, with priority $=$ connection count\\
while Q is not empty:\\
$>>> $ vertex $=$ pop Q\\
$>>>>>> $ if neighbors of vertex $<$ 20:\\
$>>>>>>>>> $ for each edge (vertex, u) in E:\\
$>>>>>>>>>>>> $ delete edge (vertex, u)\\
$>>>>>>>>>>>> $ change priority of u\\
$>>>>>>>>> $ delete vertex in set V



\textbf{procedure} ternaryHuffman(f):\\
let $H$ be a priority queue of integers, ordered by f\\
for $i=1$ to $n$: insert($H, i$)\\
if $n$ is odd, increment n and add a dummy node with a freq of 0\\
$k = n + 1$\\
while $H$ has more than 1 entry:\\
$>>>$ $i$ = deletemin($H$), $j$ = deletemin($H$), $k$ = deletemin($H$)\\
$>>>$ create a node numbered $k$ with children $i,j,k$\\
$>>>$ $f[k] = f[i] + f[j] + f[k]$\\
$>>>$ insert($H,k$)\\
$>>>$ $k++$


\textbf{procedure} longestPalindrome(string):\\
rstring = reversal of the string\\
n = length of string
for $i = 0, 1, 2,...,n$:\\
$>>>$ E(i, 0) = 0\\
$>>>$ E(0, i) = 0\\
for $i = 0, 1, 2,...,n:$\\
$>>>$ for $j = 0, 1, 2,...,n:$\\
$>>>>>>>$ $E(i,j) =$ max{ $E(i-1, j), E(i, j-1), E(i-1, j-1) + sim(i,j)$}\\
\textbf{return} $E(n, n)$\\
\textbf{procedure} sim(i, j):\\
\textbf{if} string[i] == rstring[j] \textbf{return} 1, \textbf{else return} 0
