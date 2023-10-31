/*
 * Sorting.c
 *
 *  Created on: Oct 28, 2023
 *      Author: Krzysztof Lukasik
 */

void printArr(int arr[], int n){
	for (int i = 0; i < n; i++){
		printf("%d \n", arr[i]);
	}
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

int main(){
	int n = 5; //arr size
	int arr[] = {5, 232, 2, 1, 8};
	bubbleSort(arr, n);
	printArr(arr, n);
}

