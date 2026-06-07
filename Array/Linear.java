// Linear search java program
//Search the key in array
import java.util.*;

class Linear
{
    //make a function it can return a integer result result 
    public static int Search(int numbers[],int key){
        
        for(int i=0 ; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }   
        }
        return -1;
    } 
    public static void main(String args[])
    {
        int numbers[] = {2,4,5,1,6,7,8,16};
        int key = 8;
        int index = Search(numbers, key);
        if(index != -1){
            System.out.println("My key is on index " +index);
        }else{
            System.out.println("My key is not found");
        }
    }
}