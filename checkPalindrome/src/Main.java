public class Main {
    public static void main(String[] args) {
        System.out.println(solution("aabaa"));
    }
    public static boolean solution(String inputString) {
        for (int i = 0; i < inputString.length()/2; i++) {
            if(inputString.charAt(i) != inputString.charAt(inputString.length()-1-i)) return false;
        }
        return true;
    }
}
