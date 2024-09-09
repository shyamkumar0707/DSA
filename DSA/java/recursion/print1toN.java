package recursion;
import java.util.Scanner;

public class print1toN {

        private static void print1N(int N, int count){
        if(count == N+1) return;
        System.out.println(count);
        count++;
        print1N(N, count);
    }
    public static void main(String[] args) {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        print1N(N, count);
        scanner.close();
    }
}
