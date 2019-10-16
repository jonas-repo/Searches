package com.exercise10searches.app;
import java.util.Random;
import java.util.Scanner;
public class SecuentialSearch 
{

	public static void main(String[] args) 
	{
		//constants
		final int ELEMENTS_ARRAY = 100;
		
		//variable
		int numberToFind=0;
		int indexFound = -1;
		boolean isFound = false;
		
		//Array declaration
		int[] vector = new int[ELEMENTS_ARRAY];
		
		//objects
		Random numbers = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		
		//initialize and show
		for (int i = 0; i < ELEMENTS_ARRAY; i++) 
		{
			vector[i] = numbers.nextInt(101);
			System.out.print(vector[i]+" ");
		}
		System.out.println("");
		do 
		{
			
			System.out.println("Input the number to find: ");
			numberToFind = input.nextInt();
			if(numberToFind < 0)
			{
				System.out.println("Only positive numbers and more than zero allowed, put another number: ");
				continue;
			}
											
		}while(numberToFind <= 0);
		
		int i = 0;
		while(!isFound && i < ELEMENTS_ARRAY)
		{
			if( numberToFind == vector[i])
			{
				indexFound = i;
				System.out.println("the number is in position: " + indexFound);
				isFound=true;
			}
			
			i++;
		}	
		if(indexFound == -1)
		{
			System.out.println("the number is not in the list");
		}

		
		
	}

}
