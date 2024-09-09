import java.util.Scanner;

public class StarHalfDiamongRight {

    static void pattern(int N){
        for(int i=1; i<=N*2-1; i++){
            int star = i<=N? i : 2*N-i;
            int space = N-star;            

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the Rows : ");

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        pattern(N);
        scanner.close();
    }
}