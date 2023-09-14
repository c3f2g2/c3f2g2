public class Sum {
    public static void main(String[] args) {
        // Write a function called `sum()` that returns the sum of numbers from zero
        // to the given parameter
        //
        // Example: sum(5) = 0 + 1 + 2 + 3 + 4 + 5 = 15


        System.out.println(sumUpTo(5));

    }

    public static int sumUpTo(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
}
