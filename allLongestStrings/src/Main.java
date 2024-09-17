import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        System.out.println(Arrays.toString(solution(inputArray)));
    }

    public static String[] solution(String[] inputArray) {
        String[] longestStrings = new String[inputArray.length];
        int index = 0;
        int maxSize = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() >= maxSize) maxSize = inputArray[i].length();
        }

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() >= maxSize) {
                longestStrings[index++] = inputArray[i];
            }
        }

        return reduceArray(longestStrings);
    }

    public static String[] reduceArray(String[] array) {
        int validValues = 0;
        for (String value : array) {
            if (value != null) validValues++;
        }

        String[] reduceArray = new String[validValues];
        int index = 0;

        for (String value : array) {
            if (value != null) reduceArray[index++] = value;
        }

        return reduceArray;
    }
}
