package SortingAlgs;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SortingTest {
	
	@Test
	public void recursiveMergeSort() {
		int[] A = {3, 2, 3, 1, 23, 1, 2, 3, 4, 4, 4, 4};
		Sorting.straightMergeSort(A);
		assertTrue(Arrays.equals(A, new int[] {1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 23}));
		
	}
}
