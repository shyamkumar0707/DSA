package recursion;

public class sumOfN {

    public static void sum1(int N, int sum){
        
        int reminder = N % 10;
        N = N / 10;
        sum = sum + reminder;
        
        if(reminder == 0) {
            System.out.println("Sum = "+ sum);
            return;
        }
        
        sum1(N, sum);
    }
    public static void main(String[] args) {
        int N = 12345;
        int sum = 0;
        sum1(N, sum);
    }
}
