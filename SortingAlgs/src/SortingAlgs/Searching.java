package SortingAlgs;

public class Searching {
	

	/**
	 * Search <b>key</b> in <b>A</b>
	 */
	public static int binarySearch(int[] A, int key) {
		// dividing integers is grounding
		int m = (A.length-1) / 2;
		
		while (A[m] != key) {
			if (key < A[m])
				m /= 2;
			else
				m += (m/2 == 0) ? 1 : m/2;
		}
		return m;
	}
}
