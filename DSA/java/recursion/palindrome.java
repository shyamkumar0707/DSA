package recursion;
import java.util.Scanner;

public class palindrome {

    static private boolean isPalindrome(String string){
        int left = 0, right = string.length() - 1;
        while(left<right){
            char l = string.charAt(left), r = string.charAt(right);
            if(!Character.isLetterOrDigit(l))
                l++;
            else if(!Character.isLetterOrDigit(r))
                r--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r))
                return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Enter String to check Palindrome : ");
        Scanner scanner = new Scanner(System.in);
        String string =  scanner.nextLine();
        boolean ans = isPalindrome(string);

        if(ans){
            System.out.print("The String is a Palindrome");
        }else{
            System.out.print("The String is not a Palindrome");
        }
    }
}
