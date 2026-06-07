
//Find largest number in array
import java.util.*; //Integer.MIN_VALUE    Integer.MIX_VALUE
class Largest
{
    public static int getLargest(int numbers[]){
        int largest  = Integer.MIN_VALUE; //-infinity integer most lowest value
        int smallest = Integer.MAX_VALUE; // + INFINITY   in integer most max value stored in that variable
        for( int i = 0 ; i<numbers.length; i++){
            //This is for find largest value in array 
            if (numbers[i] > largest){
                largest = numbers[i];
            }
            //This is for find smallest value in array 
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is "+smallest);
        return largest;

    }

    public static void main(String args[])
    {
        int numbers[] ={1,2,5,3,6,8};
        int result = getLargest(numbers);
        System.out.println("My largest number is :" +result );
        
    }
}