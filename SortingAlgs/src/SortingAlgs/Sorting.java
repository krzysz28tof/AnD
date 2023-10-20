package SortingAlgs;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3, 2, 3, 1, 23, 1, 2, 3, 4, 4, 4, 4};
		mergeSort(A);
		System.out.println(java.util.Arrays.toString(A));
	}
	
	/**
	 * O(n * log(n)).
	 * Sort from low to high 
	 */
	public static void mergeSort(int[] A) {
		mergeSort(A, 0, A.length-1);
	}
	
	/**
	 * sort from low to high
	 * @param A
	 * @param l inclusive
	 * @param r inclusive
	 */
	private static void mergeSort(int[] A, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(A, l, m);
			mergeSort(A, m+1, r);
			merge(A, l, r);
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

}
