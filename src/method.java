import java.util.Scanner;
//let's create a method that accepts input instead of having a fixed value of a and b
public class method {
    public static void main(String[] args) {
        //myName method is being called using myName()
        //"Richard" is the output from the String yourName
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        myName("Richard");
        myName("Ella");
        System.out.println("Enter a number: ");
        myNum(sc.nextInt());
    }

    public static void myName(String yourName) {
        System.out.println(yourName);
    }

    static void myNum(int num) {
        System.out.println("Your number is: " + num);
    }
}




