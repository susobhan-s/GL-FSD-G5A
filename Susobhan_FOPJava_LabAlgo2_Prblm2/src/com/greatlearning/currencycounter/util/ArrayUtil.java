package com.greatlearning.currencycounter.util;

public class ArrayUtil {

	public static void mergesort(int[] inp_arr) {
		mergesort(inp_arr, 0, inp_arr.length - 1);
	}

	private static void mergesort(int[] arrInt, int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;
			mergesort(arrInt, left, mid);
			mergesort(arrInt, mid + 1, right);
			merge(arrInt, left, mid, right);
		}

	}

	private static void merge(int[] arrInt, int left, int mid, int right) {
		// TODO Auto-generated method stub

		int left_arr_len = mid - left + 1;
		int right_arr_len = right - mid;

		int[] left_arr = new int[left_arr_len];
		int[] right_arr = new int[right_arr_len];

		for (int i = 0; i < left_arr_len; i++) {
			left_arr[i] = arrInt[left + i];
		}

		for (int i = 0; i < right_arr_len; i++) {
			right_arr[i] = arrInt[mid + i + 1];
		}

		int i = 0, j = 0, k = left;

		while (i < left_arr_len && j < right_arr_len) {
			if (left_arr[i] < right_arr[j]) {
				arrInt[k++] = left_arr[i++];
			} else {
				arrInt[k++] = right_arr[j++];
			}
		}

		while (i < left_arr_len) {
			arrInt[k++] = left_arr[i++];
		}

		while (j < right_arr_len) {
			arrInt[k++] = right_arr[j++];
		}

	}

}
