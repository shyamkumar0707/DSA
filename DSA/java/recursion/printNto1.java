package recursion;
import java.util.Scanner;

public class printNto1 {

    public static void printN1(int N, int count){
        if(count==0) return;
        System.out.println(count);

        count--;
        printN1(N, count);

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = N;
        printN1(N, count);
        scanner.close();
    }
}
