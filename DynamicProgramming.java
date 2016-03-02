
public class DynamicProgramming {

	public static boolean linearSubproblem(int[] a, int bound) {
		for (int item : a) {
			if (item > bound) {
				return false;
			}
		}
		return true;
 	}

 	public static int nSquaredSubproblem(int[] a) {
 		if (a.length == 0) {
 			return 0;
 		}
 		else {
 			int withFirst = a[0] + nSquaredSubproblem(a, 1);
 			int withoutFirst = nSquaredSubproblem(a, 1);
 			return Math.max(withFirst, withoutFirst);
 		}
 	}

 	public static int nSquaredSubproblem(int[] a, int index) {
 		if (a.length == index + 1) {
 			return 0;
 		}
 		else {
 			int withFirst = a[index] + nSquaredSubproblem(a, index + 1);
 			int withoutFirst = nSquaredSubproblem(a, index + 1);
 			return Math.max(withFirst, withoutFirst);
 		}
 	}

 	public static void main(String[] args) {
 		int data[] = {2, -3};
 		System.out.println(nSquaredSubproblem(data));
 		
 	}

}