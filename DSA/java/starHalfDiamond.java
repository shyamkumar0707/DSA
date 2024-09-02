import java.util.Scanner;

public class starHalfDiamond {

    static void pattern(int N){
        for(int i=1; i<=2*N-1; i++){
            int star = i;

            if(i>N) star = 2*N-i;

            for(int j=1;j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter diamond star size : ");

        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        pattern(N);
        s.close();
    }
}