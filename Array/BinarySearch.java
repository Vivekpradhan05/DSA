//Time complexity O(lon n)
import java.util.*;

class BinarySearch
{
    public static int getLargest(int n[],int key){
        int start = 0;
        int end = n.length-1;
        
    //comparisions
        while(start <= end){
            int mid = (start+end)/2;
            if(n[mid] == key){
                return mid;
            }else if(n[mid] > key){   //left
                 end = mid-1;
            }else if(n[mid] < key){   //right
                start = mid +1;
            }
        }
        return 0;

    }

    public static void main(String args[])
    {
        int n[] = {2,4,6,8,10,12,14};
        int key = -4;
        int result = getLargest(n,key);
        System.out.println(result);
    }
}