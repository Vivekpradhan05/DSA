import java.util.*;
class TrapingRainwater
{
    public static void Trap(int height[],int TotalTrapped){
        int n = height.length;
        
        //1. calculate leftMax Boundry
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for( int i=0; i<n; i++)
        {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //2.Calculate RightMax Boundry
        int rightMax[] = new int[n];
        rightMax[n-1] = rightMax[n-1];
        for( int i=n-1; i>height[0]; i--)
        {
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        for(int i=0; i<leftMax.length; i++)
        {
            System.out.println(leftMax[i]);
        }

        // WaterLevel = leftmax[i] , rightmax[i]
        for (int i=0; i<n; i++)
        {
            int waterLevel = Math.min((leftMax[i]), (rightMax[i]));
            int trappedWater = waterLevel - height[i];
             TotalTrapped = trappedWater + TotalTrapped; 
            
        }   
        System.out.println("Total Trapped Water : " + TotalTrapped);
        //3.minimum no of bars >= 2
        //4.Asc / Dsc no water is trapped
        //5.Total trapped Water
        int TotalTrapped = 0;

    }

    public static void main(String args[])
    {
        int height[] = {4,2,0,6,3,2,5};
        int TotalTrapped = 0;
        Trap(height,TotalTrapped);
    }
}