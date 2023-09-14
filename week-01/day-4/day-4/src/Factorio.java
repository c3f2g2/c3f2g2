public class Factorio {
    public static void main(String[] args){
        // - Create a function called `calculateFactorial()`
        //   that returns the factorial of its input
        //
        // - Example: calculateFactorial(5) = 1 * 2 * 3 * 4 * 5 = 120

        calculateFactorial(5);
    }
    public static int calculateFactorial(int a){
        int c = 1;
        for (int i = a; i > 1; i--){
            c = c * i;
        }

        return c;
    }
}
