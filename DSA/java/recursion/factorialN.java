package recursion;
import java.util.Scanner;

public class factorialN {

    public static void function(int N, int calc){
        calc = calc * (N * (N - 1));
        N = N-2;

        if(N<2) {
            System.out.print("Factorial! = " + calc);
            return;
        }

        function(N, calc);
    }
    public static void main(String[] args) {
        int calc = 1;
        System.out.print("Enter a Factorial Number : ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        function(N, calc);
        scanner.close();
    }
}
