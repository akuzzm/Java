package lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
        int width = 0;
        while(width < 6) {
            for (int i = 0; i < width + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
            width++;
        }
    }
}
