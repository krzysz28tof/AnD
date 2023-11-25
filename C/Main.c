/*
 * Main.c
 *
 *  Created on: Nov 25, 2023
 *      Author: Krzysztof Lukasik
 */

#include <stdio.h>
#include "Tests.h"
#include "Sorting.h"

/*
 * TEST FUNCTIONS
 */

void testBubbleSort() {
	int n = 5; //arr size
	int arr[] = {5, 232, 2, 1, 8};
	bubbleSort(arr, n);
	printArr(arr, n);
	if (sorted(arr, n)){
		printf("Sorted");
	}
}

void testMerge() {
	printf("Testing Merge\n");

	int arr1[] = {1, 3, 5, 6, 7, 8};
	int arr2[] = {2, 4, 9, 10, 11, 12};
	const int n = 6;

	int result[2*n];

	merge(arr1, arr2, result, n);

	testArray(result, 2*n);
}

void testNaturalMergeSort() {

}

int main(){
	testMerge();

	return 0;
}