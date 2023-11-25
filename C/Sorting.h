/*
 * Sorting.c
 *
 *  Created on: Oct 28, 2023
 *      Author: Krzysztof Lukasik
 *
 *  Purpose:
 *  Contains sorting functions
 */

#ifndef SORTING_H_
#define SORTING_H_

/*
 * BUBBLE SORT ---
 */

void swap(int arr[], int i, int j){
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}

void bubbleSort(int arr[], int n){
	for (int i = 0; i < n; i++){
		for (int j = 0; j < n-1; j++){
			if (arr[j] > arr[j+1]){
				swap(arr, j, j+1);
			}
		}
	}
}

/*
 * MERGE SORT ---
 */

/*
 * Merges two sorted arrays
 * Both arrays size n
 * result size = 2*n
 */
void merge(int arr1[], int arr2[], int result[], int n){
	int i = 0; // arr1 index
	int j = 0; // arr2 index
	int k = 0; // result index
	while (i < n && j < n) {
		if (arr1[i] < arr2[j]) {
			result[k++] = arr1[i++];
		}
		else {
			result[k++] = arr2[j++];
		}
	}
	// i = n || j = n, but not both
	while (i < n) {
		result[k++] = arr1[i++];
	}
	while (j < n) {
		result[k++] = arr2[j++];
	}
}

/*
 * merging two sorted partitions of length n in arr,
 * one starting at i, the other at j.
 */
void mergePart(int arr[], int i, int j, const int n){
	const int N = 2*n;
	const int START = i;

	const int ENDI = i + n; // end of partition 1
	const int ENDJ = j + n; // end of partition 2

	int sorted[N];
	int k = 0; // index of sorted array

	// merge partitions
	while (i < ENDI && j < ENDJ) {
		if (arr[i] < arr[j]) {
			sorted[k++] = arr[i++];
		}
		else {
			sorted[k++] = arr[j++];
		}
	}
	// i = endi || j = endj, but not both

	// merge rest
	while (i < ENDI) {
		sorted[k++] = arr[i++];
	}
	while (j < ENDJ) {
		sorted[k++] = arr[j++];
	}

	// insert sorted partition to arr
	for (int t = 0; t < N; t++) {
		arr[START + t] = sorted[t];
	}
}

void naturalMergeSort(int arr[], int n){
}

#endif /* SORTING_H_ */

