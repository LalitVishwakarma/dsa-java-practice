package practice.Prepration;

public class TestOracle {

    public static void main(String[] args) {
        int[] inputArray = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = Integer.MIN_VALUE;
        int currentSum;
        int startIndex = 0;
        int endIndex = 0;
        for(int i = 0; i < inputArray.length; i++) {
            currentSum = 0;
            for(int j = i; j < inputArray.length; j++) {
                currentSum += inputArray[j];
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }

        System.out.println("max sum is: " + maxSum);
        for (int k =startIndex ; k <= endIndex; k++) {
            System.out.print(inputArray[k] + " ");
        }
    }
}
