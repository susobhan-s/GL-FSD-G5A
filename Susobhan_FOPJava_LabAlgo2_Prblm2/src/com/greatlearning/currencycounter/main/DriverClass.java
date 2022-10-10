package com.greatlearning.currencycounter.main;

import java.util.Scanner;
import com.greatlearning.currencycounter.util.ArrayUtil;

public class DriverClass {

	public static void main(String[] args) {

		try {

			System.out.println("Enter the number of denominations : ");

			Scanner scnr = new Scanner(System.in);

			int num_of_denom = scnr.nextInt();

			int[] denom_values_arr = new int[num_of_denom];

			System.out.println("Enter value for denominations :");

			for (int i = 0; i < num_of_denom; i++) {
				denom_values_arr[i] = scnr.nextInt();
				if (denom_values_arr[i] <= 0) {
					scnr.close();
					throw new IllegalArgumentException("Input Error : Denomination should be greater than 0");
				}
			}

			ArrayUtil.mergesort(denom_values_arr);

			int[] denom_counter = new int[num_of_denom];

			System.out.println("Enter the amount to pay :");

			int pay_amt = scnr.nextInt();

			int rem_amt = curr_count(denom_values_arr, denom_counter, 0, num_of_denom - 1, pay_amt);

			if (rem_amt > 0) {
				System.out.println("The exact Payable amount cannot be paid with given denominations");
			} else {
				for (int i = num_of_denom - 1; i >= 0; i--) {
					if (denom_counter[i] > 0) {
						System.out.println("Denomination - " + denom_values_arr[i] + " : " + denom_counter[i]);
					}

				}
			}

			scnr.close();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());

		}
	}

	public static int curr_count(int[] denom_values_arr, int[] denom_counter, int low, int high, int pay_amt) {

		if (pay_amt == 0 || (pay_amt < denom_values_arr[0])) {
			return pay_amt;
		}

		if (pay_amt >= denom_values_arr[high]) {
			denom_counter[high] = pay_amt / denom_values_arr[high];
			pay_amt %= denom_values_arr[high];

			return curr_count(denom_values_arr, denom_counter, low, high - 1, pay_amt);
		}

		int mid = (low + high) / 2;

		if (pay_amt <= denom_values_arr[mid]) {

			return curr_count(denom_values_arr, denom_counter, low, mid, pay_amt);
		}

		return curr_count(denom_values_arr, denom_counter, low, high - 1, pay_amt);
	}

}
