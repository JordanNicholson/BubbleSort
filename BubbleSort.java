/*
 * Programmer: Jordan Nicholson
 * Date: November 2, 2020
 * Purpose: To bubble sort an array and print the array after each pass.
 */

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main (String [] args) {
		// Create the input scanner
		Scanner input = new Scanner(System.in);

		// Read in the array size
		System.err.println("How many numbers are there?");
		int size = input.nextInt();

		// Read in the array elements
		System.err.println("Enter the numbers:");
		int [] numbers = new int [size];
		for (int index = 0; index < size; index++) {
			numbers[index] = input.nextInt();
		}

		//Sort the array using Bubble Sort
		int temp = 0;
		for (int index = 0; index < size; index++) {

			System.err.print("Before pass " + (index + 1) + ": \n");
			System.out.println(Arrays.toString(numbers));

			for (int secondIndex = 1; secondIndex < size; secondIndex++) {
				//if this if loop runs, boolean returns true, and break	
				//boolean condition = 
				if (numbers[secondIndex - 1] > numbers[secondIndex]) {

					temp = numbers[secondIndex - 1];
					numbers[secondIndex - 1] = numbers[secondIndex];
					numbers[secondIndex] = temp;

				}

			}

		}


		// Print out the sorted array
		System.err.println("Sorted Array:");
		System.out.println(Arrays.toString(numbers));

	}
}

