/*
 * Author: Krzysztof Łukasik
 * Note:
 * For ETH Bachelor Computer Science
 * HS23 Algorithms and Datastructures
 */

package SortingAlgs;

public class Sorting {

	/**
	 * [l, middle] sorted &&
	 * [middle+1, r] sorted
	 * @param A
	 * @param l inclusive
	 * @param r inclusive
	 */
	private static void merge(int[] A, int l, int m, int r) {
		int[] B = new int[r - l + 1];
		
		int i = l;
		int j = m+1;
		int k = 0;
		
		while (i <= m && j <= r) {
			if (A[i] < A[j])
				B[k++] = A[i++];
			else
				B[k++] = A[j++];
		}
		
		//append rest, only one of the loops will be executed
		while (i <= m) {
			B[k++] = A[i++];
		}
		while (j <= r) {
			B[k++] = A[j++];
		}
		
		//transfer result into A
		for (int t = l; t <= r; t++) {
			A[t] = B[t-l];
		}
	}
	
	/**
	 * [l, middle] sorted &&
	 * [middle+1, r] sorted
	 * @param A
	 * @param l inclusive
	 * @param r inclusive
	 */
	private static void merge(int[] A, int l, int r) {
		int m = (l + r) / 2;
		merge(A, l, m, r);	
	}
	
	/**
	 * <b>O</b>(n * log(n)).
	 * Sort from low to high 
	 */
	public static void recursiveMergeSort(int[] A) {
		recursiveMergeSort(A, 0, A.length-1);
	}
	
	/**
	 * sort from low to high
	 * @param A
	 * @param l inclusive
	 * @param r inclusive
	 */
	private static void recursiveMergeSort(int[] A, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			recursiveMergeSort(A, l, m);
			recursiveMergeSort(A, m+1, r);
			merge(A, l, r);
		}
	}
	
	/**
	 * <b>O</b>(n * log(n)).
	 * Sort from low to high 
	 */
	public static void straightMergeSort(int[] A) {
		int len, l, r, m; //length of sorted arr., [l, m], (m, r]
		len = 1; 
		
		while (len < A.length) {
			r = - 1; // A[0, .., r] is sorted
			while (r + len < A.length) { // at least one partition left to merge
				l = r + 1;
				m = l + len - 1; // we want "len" elements, but indices start at 0
				r = Math.min(m + len, A.length-1);
				merge(A, l, m, r);
			}
			len = len << 1;
		}
	}
	
	/**
	 * <b>O</b>(n * log(n)) <br>
	 * Best case: <b>O</b>(n) <br>
	 * Creates sorted partitions, so if <i>A</i> partially sorted, we create bigger than length 1 partitions.
	 */
	public static void naturalMergeSort(int[] A) {
		int l, r, m;
		l = 0;
		
		do {
			r = -1;
			while (r < A.length - 1) {
				l = r + 1;
				
				// iterate through array until next element is less than current
				m = l;
				while (m < A.length - 1 && A[m] <= A[m+1]) {
					m++;
				}
				
				// now iterate to generate a second sorted partition
				r = m + 1;	
				if (r < A.length) {
					while (r < A.length - 1 && A[r] <= A[r+1]) {
						r++;
					}
					
					// (m < A.length) && (r < A.length)
					merge(A, l, m, r);
				}
			}
		} while (l != 0);
	}

}
