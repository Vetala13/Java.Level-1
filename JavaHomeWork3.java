/**
 * Java 1. Homework 3
 *
 * @autor Anna M.
 * @version 31.03.2022
 */
import java.util.Arrays;

class JavaHomeWork3 {

    public static void main(String[] args) {
        printOnesAndZeros();
        hundredNumbers();
        multiplyArray();
        fillDiagonalOfTable();
        System.out.println(retutnArray(5, 1));
    }
    
    static void printOnesAndZeros() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.toString(arr));
            }
        int[] ass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < ass.length; i++) 
            if(ass[i] == 0) {
                ass[i] = 1;
            } else ass[i] = 0; {
            System.out.println(Arrays.toString(ass));
            }
    }
    
    static void hundredNumbers() {
        int[] arr = new int[100];
        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.toString(arr));
        }
        int[] ass = new int[100];
        for (int i = 0; i < ass.length; i++) 
            ass[i] = i + 1; {
        System.out.println(Arrays.toString(ass));
        }
    }
    static void multiplyArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.toString(arr));
        }
        int[] ass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < ass.length; i++) 
            if (ass[i] < 6) ass[i] = arr[i] * 2;{
            System.out.println(Arrays.toString(ass));
        }
    }
    
    static void fillDiagonalOfTable() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
    static int[] retutnArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}