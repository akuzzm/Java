package lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        if (args.length == 1) {
            String name = args[0];
            System.out.println("Happy New Year " + name + "!");
        }
        else
            System.out.println("Happy New Year!");
    }
}
