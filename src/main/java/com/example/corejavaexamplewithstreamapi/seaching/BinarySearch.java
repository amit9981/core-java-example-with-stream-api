package com.example.corejavaexamplewithstreamapi.seaching;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int searchResult = seachElement(arr,8);
		if (searchResult != -1)
			System.out.println("Index number:" + searchResult + "  searched value:" + arr[searchResult]);
		else
			System.out.println("Searching element has not been founded");

	}

	//Binary search iterative way : time complexity O(log n)
	private static int seachElement(int arr[], int element) {
		
		int l = 0, r = arr.length - 1;

		while (l <= r) {  //<= whenever l value not cones equal to r value
			int mid = l + (r-l) / 2;//L mid index 
			if (arr[mid] == element) //comparing index value
				return mid;
			if (arr[mid] < element) {
				l = mid + 1;
				
			} else {
				r = mid - 1;
				
			}

		}

		return -1;
	}
	

	 /* Recursive Method to search x in arr[l..r] */
  private static int binarySearch(int arr[], int l, int r, int x) 
   { 
	  if (r >= l) { 
          int mid = l + (r - l) / 2; 

          // If the element is present at the 
          // middle itself 
          if (arr[mid] == x) 
              return mid; 

          // If element is smaller than mid, then 
          // it can only be present in left subarray 
          if (arr[mid] > x) 
              return binarySearch(arr, l, mid - 1, x); 

          // Else the element can only be present 
          // in right subarray 
          return binarySearch(arr, mid + 1, r, x); 
      } 

      // We reach here when element is not present 
      // in array 
      return -1;
       
   } 


}
