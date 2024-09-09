import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int revNum = 0;
        while(N!=0){
            revNum = N % 10;
            N = N / 10;
            System.out.print(revNum);
        }
        scanner.close();
    }  
}
