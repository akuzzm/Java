package lesson3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args){

        //10 Lesson02
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int acc = 0;
        while ( n > 0 ){
            sum += n % 10;
            n /= 10;
            acc++;
        }
        System.out.println(String.format("acc=%d, sum=%d", acc, sum));

        //4 Lesson03
        String str = new Scanner(System.in).nextLine();
        String letterOnly = str.replaceAll("[^A-Za-zА-Яа-я]", "");
        System.out.println(str);
        System.out.println(letterOnly);
        String numberOnly = str.replaceAll("[^0-9]", "");
        System.out.println(numberOnly);

        //6 Lesson03
        String str1 = new Scanner(System.in).nextLine();
        System.out.println(str1);
        String letterLatin = str1.replaceAll("[^A-Za-z]", "");
        System.out.println(letterLatin.length());
        String letterCyrillic = str1.replaceAll("[^А-Яа-я]", "");
        System.out.println(letterCyrillic.length());
    }
}
