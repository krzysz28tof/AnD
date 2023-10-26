/*
 * Author: Krzysztof Łukasik
 * Note:
 * For ETH Bachelor Computer Science
 * HS23 Algorithms and Datastructures
 */

package SortingAlgs;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3, 2, 3, 1, 23, 1, 2, 3, 4, 4, 4, 4};
		int[] B = {3, 2, 3, 1, 23, 1, 2, 4, 4, 4, 4};
		int[] C = {3, 2, 3, 1, 23, 1, 3, 4, 4, 4, 4};
		int[] D = {3, 2, 3, 23, 1, 2, 3, 4, 4, 4};
//		recursiveMergeSort(A);
		straightMergeSort(A);
		System.out.println(java.util.Arrays.toString(A));
		straightMergeSort(B);
		System.out.println(java.util.Arrays.toString(B));
		straightMergeSort(C);
		System.out.println(java.util.Arrays.toString(C));
		straightMergeSort(D);
		System.out.println(java.util.Arrays.toString(D));
	}
	
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
	
	
	
	


}
