public class PrintAll {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print all the elements of `numbers`
        //   one element per line

        int [] numbers = {4,5,6,7};

        //Frist way
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println();

        //Second way
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }


    }
}