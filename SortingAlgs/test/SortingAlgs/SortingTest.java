package SortingAlgs;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SortingTest {
	
	private int[] A = {3, 2, 3, 1, 23, 1, 2, 3, 4, 4, 4, 4};
	private int[] B = {1};
	private int[] C = {2, 1};
	private int[] D = {3, 2, 1};
	
	private void print(String s) {
		System.out.println(s);
	}
	
	private void initArrays() {
		A = new int[] {3, 2, 3, 1, 23, 1, 2, 3, 4, 4, 4, 4};
		B = new int[] {1};
		C = new int[] {2, 1};
		D = new int[] {3, 2, 1};
	}
	
	private boolean sorted(int[] A) {
		for (int i = 0; i < A.length-1; i++) {
			if (A[i] > A[i+1])
				return false;
		}
		return true;
	}
	
	private void checkArrays() {
		assertTrue(sorted(A));
		assertTrue(sorted(B));
		assertTrue(sorted(C));
		assertTrue(sorted(D));
	}
	
	
	@Test
	public void recursiveMergeSort() {
		initArrays();
		
		Sorting.recursiveMergeSort(A);
		Sorting.recursiveMergeSort(B);
		Sorting.recursiveMergeSort(C);
		Sorting.recursiveMergeSort(D);
		
		checkArrays();
	}
	
	@Test
	public void straightMergeSort() {
		initArrays();
		
		Sorting.straightMergeSort(A);
		Sorting.straightMergeSort(B);
		Sorting.straightMergeSort(C);
		Sorting.straightMergeSort(D);
		
		checkArrays();
	}
	
	@Test
	public void naturalMergeSort() {
		initArrays();
		
		Sorting.naturalMergeSort(A);
		Sorting.naturalMergeSort(B);
		Sorting.naturalMergeSort(C);
		Sorting.naturalMergeSort(D);
		
		checkArrays();
	}
}
