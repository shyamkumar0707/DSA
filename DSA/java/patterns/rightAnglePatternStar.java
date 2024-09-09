import java.util.Scanner;

public class rightAnglePatternStar {

    static void rightAngle(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void  main(String[] args) {
        System.out.print("Enter number of Rows for Right Angle Triangle : ");
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        rightAngle(N);
        scanner.close();
    }
}
