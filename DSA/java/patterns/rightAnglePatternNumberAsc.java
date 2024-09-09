import java.util.Scanner;

public class rightAnglePatternNumberAsc {
    static void rightAnglePatNumAsc(int N){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.err.println(" ");
        }
    }

    public static void main(String[] args){
        System.out.print("Enter Pattern size : ");
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        rightAnglePatNumAsc(N);

        scanner.close();
    }
}
