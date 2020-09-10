package com.example.corejavaexamplewithstreamapi.seaching;

public class LinearSeach {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int searchResult = searchElement(arr, 12);
		if (searchResult != -1)
			System.out.println("Index number:" + searchResult + "  searched value:" + arr[searchResult]);
		else
			System.out.println("Searching element has not been founded");
		

		int searchResult1 = recSearch(arr,0,arr.length-1,7);
		if (searchResult1 != -1)
			System.out.println("Index number:" + searchResult1 + "  searched value:" + arr[searchResult1]);
		else
			System.out.println("Searching element has not been founded");

	}

	//Linear search time complexity : O(n) and Iterative way
	private static int searchElement(int arr[], int element) {

		for (int i = 0; i < arr.length; i++) {

			if (element == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	 /* Recursive Method to search x in arr[l..r] */
   private static int recSearch(int arr[], int l, int r, int x) 
    { 
         if (r < l) 
            return -1; 
         if (arr[l] == x) 
            return l; 
         if (arr[r] == x) 
            return r; 
         return recSearch(arr, l+1, r-1, x); 
    } 

}
