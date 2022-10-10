package com.greatlearning.paymoney.main.Driver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DriverClass {

	private static int getNoOfTrans(Integer[] transArr, int target) {

		int sum_of_trans = 0;

		for (int i = 0; i < transArr.length; i++) {
			sum_of_trans += transArr[i];

			if (sum_of_trans >= target) {
				return (i + 1);
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter the number of transactions :");
		int trn_sz = scnr.nextInt();

		Integer[] trans_arr = new Integer[trn_sz];

		System.out.println("Enter the transaction values:");
		for (int i = 0; i < trn_sz; i++) {
			trans_arr[i] = scnr.nextInt();
		}

		Arrays.sort(trans_arr, Collections.reverseOrder());
		
		System.out.println("Enter the number of targets to be achieved :");
		int targ_sz = scnr.nextInt();

		for (int i = 0; i < targ_sz; i++) {
			System.out.println("Enter the value for target #" + (i + 1) + ": ");

			int targ_val = scnr.nextInt();

			int targ_trans_count = getNoOfTrans(trans_arr, targ_val);

			if (targ_trans_count < 0) {
				System.out.println("The given target is not achieved");

			} else {
				System.out.println("The given target is achieved in " + targ_trans_count + " transactions");
			}
		}
		scnr.close();
	}

}
