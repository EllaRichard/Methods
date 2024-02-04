public class Main {
    public static void main(String[] args) {
        //myName method is being called using myName()
        //"Richard" is the output from the String yourName
        myName("Richard");
        myName("UNN");

        myNum(6, 10, "John");

    }
    public static void myName (String yourName) {
        System.out.println(yourName);
    }
    static void myNum (int a, int b, String symbol) {
        System.out.println((a + b) + symbol);

    }
}