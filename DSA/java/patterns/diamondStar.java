import java.util.Scanner;

public class diamondStar {

        public static void main(String[] args){
        System.out.print("Enter diamond Star Size : ");

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        starPyramid.pattern1(N);
        starPyramidReverse.reverse(N);
        scanner.close();
    }
}
