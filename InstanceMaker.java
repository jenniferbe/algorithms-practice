import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
import java.util.*;

public class InstanceMaker{
	static PrintWriter writer;
	static int[][] graphVertices;
	static ArrayList<Integer> randomVertex;
	static int row, col, vcount;
	static HashMap<Integer, ArrayList<Integer>> dict;

	public static void initializer(int row, int col) {	
		vcount = row * col;
		writer.println(vcount);
		writer.println("");
		randomVertex = new ArrayList();
		for (int i = 0; i < vcount; i++) {
			randomVertex.add(i);
		}
		Collections.shuffle(randomVertex);

		graphVertices = new int[row][];
		ListIterator<Integer> iterator = randomVertex.listIterator();
		for (int i = 0; i < row; i++) {
			int[] newColumn = new int[col];

			for (int j = 0; j < col; j++) {
				int index = (i*col) + j;
				newColumn[j] = iterator.next();
			}
			graphVertices[i] = newColumn;
			System.out.println(graphVertices[i][0]);
		}

		dict = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList stuff;
		// column edges
		for (int i = 0; i < row; i += 1) {
			if (i % 2 == 0) {
				for (int j = 0; j < col; j += 2) {
					stuff = new ArrayList();
					if (i != 0) {
						stuff.add(graphVertices[i - 1][j]);
					} if (i != row - 1) {
						stuff.add(graphVertices[i + 1][j]);
					}
					dict.put(graphVertices[i][j], stuff);
				}
			} else {
				for (int j = 1; j < col; j += 2) {
					stuff = new ArrayList();
					stuff.add(graphVertices[i - 1][j]);
					stuff.add(graphVertices[i + 1][j]);
					dict.put(graphVertices[i][j], stuff);
				}
			}
		}

		for (int j = 0; j < col; j += 1) {
			if (j % 2 == 0) {
				for (int i = 1; i < row; i += 2) {
					stuff = new ArrayList();
					if (j != 0) {
						stuff.add(graphVertices[i][j - 1]);
					} if (j != col - 1) {
						stuff.add(graphVertices[i][j + 1]);
					}
					dict.put(graphVertices[i][j], stuff);
				}
			} else {
				for (int i = 0; i < row; i += 2) {
					stuff = new ArrayList();
					stuff.add(graphVertices[i][j - 1]);
					stuff.add(graphVertices[i][j + 1]);
					dict.put(graphVertices[i][j], stuff);
				}
			}
		}
	}

	public static void matrixfy() {	
		for (int i = 0; i < vcount; i++) {
			String matrix = "";
			for (int j = 0; j < vcount; j++) {
				if (dict.get(i).contains(j)) {
					matrix += "1";
				} else {
					matrix += "0";
				}
				if (j != vcount - 1) {
					matrix += " ";
				}
			}
			System.out.println(matrix);
			writer.println(matrix);
		}
	}

	public static void main(String[] args) {
		File file = new File("CYCLEINSTANCE.in");
    	try {
        writer = new PrintWriter(file);
        InstanceMaker.initializer(23, 21);
        InstanceMaker.matrixfy();
        writer.close();       
    	}
    	catch (FileNotFoundException ex)  {

        // insert code to run when exception occurs
    	}
	}
}