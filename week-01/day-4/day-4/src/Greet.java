public class Greet {
    public static void main(String[] args){
        // - Create a class called Greet
        // - Create a string variable named `al` and assign the value `Green Fox` to it
        // - Create a function called `greet()` that greets its input parameter
        //     - It prints a greeting message e.g. `Greetings dear Green Fox`
        // - Greet `al`
        String al = "Green Fox";
        greet(al);

        //test();


        // System.out.println(greet(al));

    }
    public static void greet(String a){
        System.out.println("Greetings dear " + a);
        //Greeting dear " + a;
    }
    //    public static void test(){
    //        System.out.println(5);
    //}
}
