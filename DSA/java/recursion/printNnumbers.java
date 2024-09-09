package recursion;

class printNnumbers{

    static void print(int current, int N){
        if (current == 11) return;

        System.out.print(current +" ");
        print(current + 1, N);
    }

    public static void main(String[] args){
        int N = 10;
        int current = 1;

        print(current, N);
    }
}
