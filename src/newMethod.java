public class newMethod {
    public static void main(String[] args) {
        //getArea(6, 5);
        System.out.println("The area is: " + getArea(10, 10));
        System.out.println("My choice is: " + replyChoice(true, true));
    }
    public static int getArea(int width, int height) {
        return width * height;
    }

    public static boolean replyChoice (boolean a, boolean b) {
        if (a != b) {
            return false;
        } else {
            return b;
        }
    }
}
