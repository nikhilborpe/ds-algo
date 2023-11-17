package org.example.array.search;

public class BinarySearch {

    private int search(int arr[], int item, int lower, int upper){
        int mid = (lower + upper) /2;

        if(item == arr[mid]){
            return mid;
        }else if(lower == upper){
            return -1;
        }else if (item < arr[mid]){
            return search(arr, item, lower, mid-1);
        }else {
            return search(arr, item, mid+1, upper);
        }
    }

    public int search(int[] arr, int i) {
        return search(arr, i, 0, arr.length);
    }
}
