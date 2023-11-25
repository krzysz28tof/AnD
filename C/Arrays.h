/*
 * Arrays.h
 *
 *  Created on: Nov 25, 2023
 *      Author: Krzysztof Lukasik
 */

#ifndef ARRAYS_H_
#define ARRAYS_H_

#include <stdio.h>

void printArr(int arr[], int n){
	if (n == 0){
		return;
	}
	printf("Array: [");
	printf("%d", arr[0]);
	for (int i = 1; i < n; i++){
		printf(", %d", arr[i]);
	}
	printf("] \n");
}

/*
 * returns 1 if array sorted
 */
int sorted(int arr[], int n){
	for (int i = 0; i < n-1; i++){
		if (arr[i] > arr[i+1]){
			return 0;
		}
	}
	return 1;
}


#endif /* ARRAYS_H_ */
