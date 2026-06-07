import java.util.*;
class SubArray
{
    //method / function
    public static void getArray(int numbers[])
    {
        int ts=0;  //number of pairs
        int sum=0;  //Sum of pairs
        int max = Integer.MIN_VALUE;   // This is for find maximum value in total subarray
        int min = Integer.MAX_VALUE;    //This is for find minimum value in total subarray
        for( int i=0; i<=numbers.length-1; i++)
        {
            int start = i;                       //2  4  
            for(int j=i; j<=numbers.length-1; j++)
            {
                int end=j;                     //2    4
                for(int k=start; k<=end; k++)     //(2-2  2-4  2-6  2-8  2-10) (4-4   4-6  4-8)
                {
                    System.out.print(" " + numbers[k]+" ");
                    sum=sum+numbers[k];
                    
                }
                ts++;
                System.out.println();
                System.out.println("sum of SubArray is :"+sum);
                if(max < sum){
                    max=sum;
                }else if(sum < min){
                    min=sum;
                }
                sum=0;

            }
        }
        System.out.println("max value:"+max);
        System.out.println("Min value:"+min);
        System.out.println("total subarray "+ts);
    }
    public static void main(String args[])
    {
        int numbers[] = {2,4,6,8,10};
        getArray(numbers);
    }
}