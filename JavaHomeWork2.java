/**
 * Java 1. Homework 2
 *
 * @autor Anna M.
 * @version 25.03.2022
 */
class JavaHomeWork2 {

    public static void main(String[] args) {
        System.out.println(checkRangeSum(13, 13));
        printPositiveOrNegative(13);
        System.out.println(numberIsNegative(-13));
        printString();
    }
    
    static boolean checkRangeSum(int a, int b) {
        return 10 <= a + b && a + b <= 20;
        }
        
    static void printPositiveOrNegative(int c) {
        System.out.println(c >= 0? "Positive" : "Negative");
    }
    
    static boolean numberIsNegative(int d) {
        return (d < 0);
    }
    
    static void printString() {
        int i;
        for (i = 1; i <= 5; i++) 
            System.out.println("I love Java");
    }
}
