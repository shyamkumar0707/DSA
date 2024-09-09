package recursion;

public class printNnames {

    private static void printName(String name, int count){
        if(count == 11) return;

        System.out.print(name+ " " + count + " ");
        printName(name, count +1);
    }
    public static void main(String[] args) {
     String name = "Shyam";
     int count = 1;
        printName(name, count);   
    }
}
