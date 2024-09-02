public class alphaTriangle {
   
        static void pattern18(int N)
     {
            // Outer loop for the no. of rows.
            for(int i=0;i<N;i++){
               
               // Inner loop for printing the alphabets from
               // A + N -1 -i (i is row no.) to A + N -1 ( E in this case).
               for(char ch =(char)(int)('A'+N-1-i);ch<=(char)(int)('A'+N-1);ch++){
                   
                   System.out.print(ch + " ");
               }
               System.out.println();
           }
     }
     
         public static void main(String[] args) {
             
             // Here, we have taken the value of N as 5.
             // We can also take input from the user.
             int N = 5;
             pattern18(N);
         }
     }
