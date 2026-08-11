package com.nix.tryout.algorithms.sorting;

public class InsertionSorting {
	static int ctr;

	public void insertionSort(int arr[]) {

		int key = 0, j;
		int n = arr.length;

		for(int i = 1; i < n; ++i) {
			key = arr[i];

			j = i - 1;
			++ctr;
			while(j >=0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;

				++ctr;
			}

			arr[j + 1] = key;
		}
	}

	 /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 6 };

		InsertionSorting ob = new InsertionSorting();
        ob.insertionSort(arr);

        InsertionSorting.printArray(arr);
        System.out.println("Iterations : "+InsertionSorting.ctr);

	}

}
