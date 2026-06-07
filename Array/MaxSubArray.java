import java.util.*;
class MaxSubArray
{
    //Create method / function
    public static void maxArray(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<=numbers.length-1; i++)     // 2 4 6 8 10
        {
            int start=i;
            for(int j=i; j<=numbers.length-1; j++)   // (2 4 ) (2 4 6) (2 4 6 8)
            {
                currSum=0;
                int end=j;
                for(int k=start; k<=end; k++)
                {
                    //Print sum or subArray
                    currSum+=numbers[k];
                    System.out.println(currSum);
                }
                
                System.out.println();
                if(maxSum <= currSum){
                    maxSum=currSum;
                    
                }
            }
            
        }
        System.out.println("Maximum sum is :"+maxSum);
    }
    public static void main(String args[])
    {
        int numbers[] = {1,-2,6,-1,3};
        maxArray(numbers);
    }
}