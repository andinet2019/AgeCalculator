

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial( 6));
        // write your code here
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n*factorial(n - 1);
        }
    }
}

//factoral 4
