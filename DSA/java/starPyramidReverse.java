import java.util.Scanner;

public class starPyramidReverse {

    public static void reverse(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            for(int j=0; j<2*N - (i*2+1); j++){
                System.out.print("*");
                }

            for(int j=0; j<i; j++){
                System.out.print(" ");
            }    
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.print("Enter reverse triangle size : ");
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        reverse(N);

        scanner.close();
    }
}
