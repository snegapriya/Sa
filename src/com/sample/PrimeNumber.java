package com.sample;

import java.util.Iterator;

public class PrimeNumber {

	public static void main(String[] args) {

		int c = 0;

		for (int n = 1; n <= 10; n++) {

			// int n = 23;

			int count = 0;

			for (int i = 2; i < n / 2; i++) {

				if (n % i == 0) {

					count++;
				}
			}

			if (count == 0) {
				System.out.println("Prime no :" +n);
				c++;
			}

		}

		System.out.println(c);
	}
}
