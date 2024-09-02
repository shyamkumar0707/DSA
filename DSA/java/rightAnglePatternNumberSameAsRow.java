import java.util.Scanner;

public class rightAnglePatternNumberSameAsRow {

    static void rightAngleNumRepeat(int N){
        for(int i=0; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + (i - j) + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        System.out.print("Enter Triagle size / rows : " );
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        rightAngleNumRepeat(N);

        scanner.close();
        
    }
}
