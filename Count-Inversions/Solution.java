class Solution {

    static long inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    static long mergeSort(int[] arr, int left, int right) {
        long count = 0;

        if (left < right) {
            int mid = left + (right - left) / 2;

            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid, right);
        }

        return count;
    }

    static long merge(int[] arr, int left, int mid, int right) {
