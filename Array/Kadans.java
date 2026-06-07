// Optimized approach of Maximum Subarray Sum using Kadane's Algorithm

class Kadans {

    public static void kadans(int numbers[]) {

        int maxSum = numbers[0];
        int currSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            currSum = Math.max(numbers[i], currSum + numbers[i]);

            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Maximum Sum is: " + maxSum);
    }

    public static void main(String[] args) {

        int numbers[] = {-2, -3, -4, -1, -2, -1, -5, -3};

        kadans(numbers);
    }
}