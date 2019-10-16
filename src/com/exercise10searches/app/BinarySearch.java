package com.exercise10searches.app;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constants
		final int ARRAY_ELEMENTS = 100;
		
		//variable
		int numberToFound = 0;
		int indexFound = -1;
		int limitInf = 0;
		int limitSup = ARRAY_ELEMENTS-1;
		int pivotal = (limitSup - limitInf)/2;
		
		//array declaration
		int[] arrayOne = new int [ARRAY_ELEMENTS];
		
		//object
		Random random = new Random(System.nanoTime());
		Scanner  input  = new Scanner(System.in);
		
		//process
		for (int i = 0; i < ARRAY_ELEMENTS; i++) {
			arrayOne[i] = random.nextInt(101);
			System.out.print(arrayOne[i]+" ");
		}
		System.out.println(" ");
		
		//ask the user to number to find in the array
		do {
			System.out.println("Input a number to find in the array");
			numberToFound = input.nextInt();
			if (numberToFound < 0) 
			{
				System.out.println("Verify your input only positive numbers allowed");
			}
			
		} while (numberToFound < 0);
		
		//sorting algorithm
		arrayOne = bubbleOrder(arrayOne);
		
		//show ordered
		System.out.println("Ordered array:");
		for (int i = 0; i < ARRAY_ELEMENTS; i++) {
			System.out.print(arrayOne[i]+" ");
		}
		System.out.println(" ");
		
		//binary search
		while(limitInf <= limitSup)
		{
			pivotal = (limitSup+limitInf)/2;
			if(numberToFound == arrayOne[pivotal])
			{
				indexFound = pivotal;
				break;
			}
			else if( numberToFound > arrayOne[pivotal])
			{
				limitInf = pivotal + 1;
			}
			else if(numberToFound < arrayOne[pivotal])
			{
				limitSup = pivotal + 1;
			}
			
			
		}
		
		if(indexFound != -1)
		{
			System.out.println("Element found at: " + indexFound);
		}
		else
		{
			System.out.println("Element not present in the array!!");
		}
		
	}
	
	public static int[] bubbleOrder (int[] array)
	{

		
		//variables declaration
		boolean bubbleSwap = true;
		int auxiliar = 0;
		int count = 0;
		int count2 = 0;
		int[] arrayOne = array;
		//process
		while(bubbleSwap)
		{
			
			if(count + 1 >= arrayOne.length)
			{
				count = 0;
			}
			
			if(arrayOne[count] > arrayOne[count+1])
			{
				auxiliar = arrayOne[count+1];
				arrayOne[count+1] = arrayOne[count];
				arrayOne[count] = auxiliar;
				count2 = 0;
			}
			if(arrayOne[count] < arrayOne[count+1])
			{
				count2++;
				if(count2 == arrayOne.length)
				{
					bubbleSwap = false;
					break;
				}
			}
			count++;
			
		}
			
		return arrayOne;
	}

}
