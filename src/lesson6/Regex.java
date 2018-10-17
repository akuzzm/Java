package lesson6;

public class Regex {
    public static void main(String[] args) {
        String str = "Тhis is is a test";
        String regex = "(\\b\\w+\\b)(\\s)\\1";

        String result = str.replaceAll(regex, "$1$2<srong>$1</strong>");
        System.out.println(str);
        System.out.println(result);
    }
}
