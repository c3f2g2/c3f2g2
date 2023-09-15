public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers` programmatically
        // - Print the elements of the reversed `numbers`:
        //   [7, 6, 5, 4, 3]

        int [] numbers = {3,4,5,6,7};
        int [] reverseNumbers = new int[5];

//        for (int i = 0; i < numbers.length; i++){
//            reverseNumbers.length[i] = numbers[0];
//        }




        for (int i = numbers.length -1; i >= 0; i--){
            if (i == 0) {
                System.out.print(numbers[i]);
            }
            else {
                System.out.print(numbers[i] + ", ");
            }

        }
    }


}