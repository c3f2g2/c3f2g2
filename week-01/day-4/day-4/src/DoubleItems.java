public class DoubleItems {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array and print the modified
        //   array to the console as:
        //   [6, 8, 10, 12, 14]
        int [] numbers = {3,4,5,6,7};

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] * 2;
        }

//        for (int i = 0; i < numbers.length; i++){
//            //System.out.println(numbers[i]);
//            System.out.println(numbers.toString());

            for (int number : numbers) {
                System.out.print(number + ", ");
        }
    }
}