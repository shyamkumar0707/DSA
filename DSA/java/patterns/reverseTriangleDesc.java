import java.util.Scanner;

public class reverseTriangleDesc {

    static void reverseTriangle(int N){
        for(int i=0; i<N; i++){
            for(int j=N; j>i; j--){
                System.out.print(N - j + 1 + "  ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter rows for Reverse triangle : ");
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        reverseTriangle(N);

        scanner.close();

    }
}
