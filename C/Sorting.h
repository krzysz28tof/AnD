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

void naturalMergeSort(int arr[], int n){

}

#endif /* SORTING_H_ */

