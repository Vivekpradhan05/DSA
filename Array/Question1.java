/*Question 1: Given an integer array nums, return true if any value appears at least twice in
the array, and return false if every element is distinct.*/

import java.util.*;
class Question1
{
    public static boolean twice(int num[])
    {
        
        for(int i=0;i<num.length; i++) //1
        {          
            for(int j=i+1; j<num.length; j++) //
            {
                if(num[i]==num[j])
                {
                    return true;
                }
            }   
        }
        return false;
    }
    public static void main(String args[])
    {
        int num[] = {1,2,3};
        boolean result = twice(num);
        System.out.println(result);
    }
}