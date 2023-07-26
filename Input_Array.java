
/*  ------------------------------------------------------
 *	File Name: Input_Array.java
 *  ------------------------------------------------------
 *  Date Created: 01-25-2021
 *  ------------------------------------------------------
 *  Description:
 *  This program allows a user to input a specified 
 *  quantity of integers and stores them in an array. 
 *  After receiving the inputs, it displays the elements 
 *  of the array.
 *  ------------------------------------------------------ */

import java.util.Scanner;

public class Input_Array 
{
	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter quantity of integers you want to input: ");
		int a = scan.nextInt(); 
		int[] array = new int[10]; 
		System.out.println("Enter elements: ");
		
		for (int b = 0; b < a; b++) { array[b] = scan.nextInt(); }

		System.out.println("Elements: ");
		scan.close(); 
		
		for (int b = 0; b < a; b++) 
		{ 
			System.out.println(array[b]); // Displays the elements
		}
	}
}
