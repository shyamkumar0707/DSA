public class armStrongNumber {
    public static void main(String[] args) {
        
        int num = 1534;  // Original number to check
        int originalNum = num;  // Store the original number for comparison
        int count = 0;
        int sum = 0;
        
        // Calculate the number of digits
        int tempNum = num;
        while(tempNum != 0){
            tempNum = tempNum / 10;
            count++;
        }        

        // Calculate the sum of each digit raised to the power of the number of digits
        tempNum = num;
        while(tempNum != 0){
            int digit = tempNum % 10;
            sum = sum + (int) Math.pow(digit, count);
            tempNum /= 10;
        }
        
        // Check if the sum is equal to the original number
        if(sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
