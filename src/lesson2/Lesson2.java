package lesson2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        double x = 1.1, y = 3, z = 5;
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
        double result = z-y-x;
        System.out.println(result);

        int bigInt = 2_147_483_647 + 1;
        System.out.println(bigInt);

        int n = 5, m = 3;
        double div = n / m;
        System.out.println(m);
        System.out.println(n);
        System.out.println(div);

        int digits = 365;
        int d1 = digits / 100;
        int d2 = digits / 10 % 10;
        int d3 = digits % 10;
        System.out.println(digits);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int sum = n1 + n2 + n3;
        System.out.println(String.format("n1=%d, n2=%d, n3=%d, sum=%d", n1, n2, n3, sum));
    }
}
