import java.util.Scanner;

public class binaryNumTriangle {

    public static void binary(int rows){
        int start = 1;
        for(int i=0; i<rows; i++){

            if(i%2 == 0) start = 1;
                else start = 0;

            for(int j=0; j<=i; j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
         }
    }
    public static void main(String[] args){
        System.out.print("Enter number of rows : ");

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        binary(rows);
        scanner.close();
    }
}