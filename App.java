package com.simitech.sort.practice;
import com.simple.sort.algorithm.Sort;
import java.util.*;
import java.lang.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] sortables = {"Wilson", "Jackson", "Willis", "Herron", "Ikudabo"};
        System.out.print("Current names: ");
        System.out.println(Arrays.toString(sortables));
        System.out.print("Names after the sort method: ");
        Sort.sort(sortables);
        System.out.print(Arrays.toString(sortables));
    }
}
