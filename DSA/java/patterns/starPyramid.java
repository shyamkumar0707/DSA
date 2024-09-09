import java.util.Scanner;

public class starPyramid {

    public static void pattern1(int N){
        for (int i=0; i<N; i++){

            for (int j=0; j<N-i-1; j++) {
                System.out.print(" ");
            }
    
            for (int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
    
            for (int j=0; j < N-i-1; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the pattern size : ");
        int N = scanner.nextInt();
        pattern1(N);
        scanner.close();
    }
}