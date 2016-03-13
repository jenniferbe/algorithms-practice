import java.util.ArrayList;
import java.util.Arrays;

public class StringFun {

	public static ArrayList<Integer> longZigZaggingSubstring(ArrayList<Integer> string) {
		if (string.size() < 3) {
			return string;
		}
		ArrayList<Integer> substring = new ArrayList<Integer>();
		substring.add(string.get(0));
		int comparator = string.get(1);
		boolean increasing = (comparator > string.get(0));

		int value;
		boolean comparison;
		for (int i = 2; i < string.size(); i++) {
			value = string.get(i);
			comparison = (value >= comparator);

			if (comparison == increasing) {
				comparator = value;
			} else {
				System.out.println(comparator);
				substring.add(comparator);
				increasing = comparison;
				comparator = value;
			}
		}
		substring.add(comparator);
		System.out.println(comparator);
		return substring;
	}

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(-4);
		array.add(343);
		array.add(4);
		array.add(343);
		array.add(222);
		array.add(222);
		array.add(223);
		array.add(2);
		array.add(3);
		array.add(3);
		array.add(4);
		array = StringFun.longZigZaggingSubstring(array);
	}
}