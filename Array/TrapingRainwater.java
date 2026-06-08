import java.util.*;

class TrapingRainwater {

    public static void Trap(int height[], int TotalTrapped) {

        int n = height.length;

        // Left Max
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Right Max
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];

        for(int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Calculate trapped water
        for(int i = 0; i < n; i++) {

            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            int trappedWater = waterLevel - height[i];

            TotalTrapped += trappedWater;
        }

        System.out.println("Total Trapped Water : " + TotalTrapped);
    }

    public static void main(String args[]) {

        int height[] = {4, 2, 0, 6, 3, 2, 5};

        Trap(height, 0);
    }
}