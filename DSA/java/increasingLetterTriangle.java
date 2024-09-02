public class increasingLetterTriangle {
    public static void main(String[] args) {
        int N = 5;
        for(int i=0; i<=N; i++){
            for(char j='A'; j<'A'+i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i=N; i>=0; i--){
            for(char j='A'; j<'A'+i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
