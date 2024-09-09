public class findTarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int combination = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                combination = arr[i] + arr[j];
                if(combination == 5){
                    System.out.print(arr[i] + " " + arr[j]);
                }
            }
        System.out.println();
        }
            
    }
}
