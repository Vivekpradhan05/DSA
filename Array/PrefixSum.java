
//Opimized approach of Maximum subarray sum using prefix sum time complexity o(n^2)
import java.util.*;
class PrefixSum
{
    //Create method / function
    public static void maxArray(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
      int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for(int i=1; i<numbers.length; i++)     // 2 4 6 8 10
        {
            prefix[i]= prefix[i-1]+numbers[i];
            int start=i;

            for(int j=i; j<numbers.length; j++)   // (2 4 ) (2 4 6) (2 4 6 8)
            {
                 int end=j;
                currSum= start==0 ? prefix[end] : prefix[end] - prefix[start - 1];
               
                
                
                System.out.println();
                if(maxSum <= currSum){
                    maxSum=currSum;
                    
                }
            }
            
        }
        System.out.println("Maximum sum is :"+maxSum);
    }
    public static void main(String [] args)
    {
        int numbers[] = {1,-2,6,-1,3};
        maxArray(numbers);

    }
}


