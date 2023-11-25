/*
 * Tests.h
 *
 *  Created on: Nov 25, 2023
 *      Author: Krzysztof Lukasik
 */

#ifndef TESTS_H_
#define TESTS_H_

#include <stdio.h>
#include "Arrays.h"

void testSorted(int arr[], int n){
	if (sorted(arr, n) == 1){
		printf("Sorted\n");
	}
	else {
		printf("Not Sorted\n");
	}
}

void testArray(int arr[], int n){
	printArr(arr, n);
	testSorted(arr, n);
}

#endif /* TESTS_H_ */
