package lesson3;

import java.util.Arrays;

public class ExsString {
    public static void main(String[] args) {
        String testData = "petrov,Ivanov ,Kirill,     Helen   ";
        String[] rawNames = splitDataToArry(testData);
        printArray(rawNames);

        String[] formattedNames = formatNames(rawNames);
        printArray(formattedNames);

        String filteredData = filterbyFirstSymbol(formattedNames, 'K');
        System.out.println(filteredData);

        String[] tracks = {"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};
        for (String track : tracks)
            if (isTrackInRange (track, 10, 15))
                System.out.println(track);

    }

    private static boolean isTrackInRange(String track, int from, int to){
        int n = Integer.parseInt(track.substring(track.length()-2));
        if (n >= from && n <= to)
            return true;
        else
            return false;
    }

    private static String filterbyFirstSymbol (String[] formattedNames, char symb) {
        StringBuilder sb = new StringBuilder();
        for (String name : formattedNames){
            if (name.charAt(0) != symb)
                sb.append(name + " ");
        }
        return  sb.toString();
    }


    private static String[] formatNames(String[] rawNames){
        String[] formattedNames = new String[rawNames.length];
        for (int i = 0; i < rawNames.length; i++)
            formattedNames[i] = formatName(rawNames[i]);
        return formattedNames;
    }

    private static String formatName(String rawName){
        String nameWithoutSpace = rawName.trim();
        String lastPart = nameWithoutSpace.substring(1).toLowerCase();
        String firstSymb = nameWithoutSpace.substring(0, 1).toUpperCase();
        return firstSymb + lastPart;
    }

    private static void printArray(String[] rawNames){
        for (int i = 0; i < rawNames.length; i++)
            System.out.println(rawNames[i]);

        for (String element : rawNames)
            System.out.println(element);

        System.out.println(Arrays.toString(rawNames));
    }

    private static String[] splitDataToArry(String testData){
        String[] words = testData.split(",");
        return words;
    }
}
