// //Brute Force____________

// import java.util.Scanner;
// public class totalDigitsInNum{
//     public static void main(String[] args){
//         System.out.print("Enter the digit : ");
//         Scanner scanner = new Scanner(System.in);
//         int num = scanner.nextInt();
//         int count = 0;
//         while (num !=0){
//             num = num / 10;
//             count = count + 1;
//         }
//         System.out.print(count);
//         scanner.close();
//     }
// }

// //Algorithm_____________
import java.util.*;

class totalDigitsInNum{

    public static void main(String[] args){
        System.out.print("Enter the big int : ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = (int) (Math.log10(N)+1);
        System.out.print("Total is : " + sum);
        scanner.close();
    }
}

