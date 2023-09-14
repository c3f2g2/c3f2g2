
public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders` programmatically
        // - Print the swapped array into the console:
        //   [third, second, first]

        String [] orders = {"first", "second", "third"};
        String a = orders[0];
        String b = orders[2];
        orders[0] = b;
        orders[2] = a;


        for (int i = 0; i < orders.length; i++)
            System.out.print(orders[i] + ", ");

    }
}
