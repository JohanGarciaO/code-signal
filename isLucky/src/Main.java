public class Main {
    public static void main(String[] args) {
        System.out.println(isLucky(1230));
    }

    public static boolean isLucky(int n){
        String convert = String.valueOf(n);

        String firstHalf = convert.substring(0,(convert.length())/2);
        String lastHalf = convert.substring(convert.length()/2);

        return sumDigits(firstHalf) == sumDigits(lastHalf);
    }

    public static int sumDigits(String number){
        int sum = 0;

        String[] array = number.split("");

        for (String value : array){
            sum += Integer.valueOf(value);
        }
        return sum;
    }
}
