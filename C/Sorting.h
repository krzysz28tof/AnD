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
 * merging [l, m) with [m, r)
 */
void mergePart(int arr[], const int l, const int m, const int r){
	const int n = r-l; // res length
	int res[n];

	int k = 0; // index of res
	int i = l; // index of 1 Partition
	int j = m; // index of 2 Partition

	while (i < m && j < r) {
		if (arr[i] < arr[j]) {
			res[k++] = arr[i++];
		}
		else {
			res[k++] = arr[j++];
		}
	}
	// i = m || j = r, but not both

	while (i < m) {
		res[k++] = arr[i++];
	}
	while (j < r) {
		res[k++] = arr[j++];
	}

	// insert sorted res into arr
	k = 0;
	while (k < n) {
		arr[l + k] = res[k++];
	}

}

void naturalMergeSort(int arr[], int n){
}

#endif /* SORTING_H_ */

