import java.util.Scanner;

class squarepattern {

    static void pattern1(int N){
        for (int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the pattern size : ");
        int N = scanner.nextInt();
        pattern1(N);
        scanner.close();
    }
}