//Reverse an array without create array 
import java.util.*;
class ReverseArr
{
    //Function to reverse a array
    public static void Reverse(int number[]){
        //Assign first index of array to first variable
        int first= 0;
        //assign last index value of array
        int last = number.length-1;
        //Swap array 
        while(first < last)
        {
            int temp=number[last];

            number[last] = number[first];

            number[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[])
    {
        //Initialize a array 
        int number[] = {2,4,6,8,10};

        Reverse(number);

        for(int i = 0 ; i<number.length; i++)
        {
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}