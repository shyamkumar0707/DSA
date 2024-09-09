//splitting a string into chars:

// public class palindrome {
//     public static void main(String[] args) {
//         String variable = "ABC";

//         char[] charArray = variable.toCharArray();

//         for(char c : charArray){
//             System.out.print(c + ", ");
            
//         }
//     }
// }

//finding character palindrome

class palindrome{
    public static void main(String[] args) {
        String straight = "MALAYALsdaf";
        String reversed = "";

        for(int i=straight.length()-1; i>=0; i--){
            reversed = reversed + straight.charAt(i);
        }
        System.out.print(straight +" = ");
        System.out.print(reversed + " : ");

        if (straight.equals(reversed)){
            System.out.println("String is a Palindrome");
        }
        else 
            {System.out.println("String is not a Palindrome");
        }
    }
}


//using String Builder

// class palindrome{
//     public static void main(String[] args) {
//      String original = "MALAYasdf";
//      String reverse = "";
     
//      StringBuilder sb = new StringBuilder(original);
//      reverse = sb.reverse().toString();

//      System.out.print(reverse);

//         if(original.equals(reverse)){
//             System.out.print("   This is a palindrome");
//      }else System.out.print(" this is not a palindrome");
//     }
// }