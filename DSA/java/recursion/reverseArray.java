package recursion;

public class reverseArray {
//=====================Using temporary Array==============
//     static void printArr(int[] revArr, int N){
//         for(int i=0; i<N; i++){
//             System.out.print(revArr[i] + " ");
//         }
//     }

//     static void revArray(int[] array, int N){
//         int[] revArr = new int[N];
//         for(int i=array.length-1; i>=0; i--){
//                 revArr[N-i-1] = array[i];
//             }
//             printArr(revArr, N);
//         }  

//     public static void main(String[] args) {
//         int N = 5;
//         int[] array = {1,2,3,4,5};
//         revArray(array, N);
//     }
// }
//=====================Using same Array======================


static void printArray(int[] array, int N){
    System.out.print("The Reverse Array is : {");
    for(int i=0; i<=N-1; i++){
        System.out.print(array[i]+",");
    }
    System.out.print("}");
}

static void reverseArray(int[] array, int N){
    int p1 = 0;
    int p2 = N-1;
    while (p1<p2){
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
        p1++;
        p2--;
    }
    printArray(array, N);
}
public static void main(String[] args){
    int[] array = {1,2,3,4,5,6,7,8,9,10};
    int N = array.length;
    reverseArray(array, N);
    }
}

//as Java collections directly reverse the given array as lists

//import java.util.*;
//Collections.reverse(Array.asList(arr));