package com.simple.sort.algorithm;
import java.util.*;
import java.lang.*;
/**
 * The Sort class will enable a user to enter an array of names and return the array in order. 
 * The Sort class has a method named sort which enables a user to pass the array as the argument.
 * Once the array is passed, a variable (n) will store the length of the array. 
 * While n is greater than 1 (signifying the last index of the array) a for loop will run.
 * The for loop will run so long as x is less than the length of the array - 1.
 * If we did not do (x < n-1) in our for loop, we would attempt to compare an array that DOES NOT EXIST. 
 *  The String.compareTo() method will return a number greater than 0 if the String is greater than the comparison String. 
 *  If the String is greater than the comparison String, we will swap the two Strings. 
 *  We create a final local variable (tmp) to store the name in the next index. 
 *  We then convert the next index to the current String which is greater than the String in the next index. 
 *  We then change the current index to the value of the String that was in the next index. 
 *  Outside of the for loop, we reduce in by n-1.
 *  When the method is complete, we will have a fully formatted index in ascending alphabetical order. 
 * @author Simeon Ikudabo
 *
 */
public class Sort {
	
	public static void sort(String[] names) {
		int n = names.length;
		
		while (n > 1) {
			for(int x = 0; x < n-1; x++) {
				if(names[x].compareTo(names[x + 1]) > 0) {
					final String tmp = names[x + 1];
					names[x + 1] = names[x];
					names[x] = tmp;
				}
			}n--;
		}
	}

}
