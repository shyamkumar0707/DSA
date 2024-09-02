import java.util.Scanner;

public class increasingNumTriangle {
    public static void main(String[] args) {
        
        System.out.print("Enter the rows : ");

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int temp = 1;
        for(int i=1; i<=N;i++){
            for(int j=1; j<=i; j++){
                    System.out.print(temp + " ");   
                    temp = temp + 1;    
            }
            System.out.println();
        }
        scanner.close();
    }
}
