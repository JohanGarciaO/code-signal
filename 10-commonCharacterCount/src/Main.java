public class Main {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcaa";

        System.out.println(solution(s1,s2, 0));

    }

    public static int solution(String s1, String s2, int common){
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)){
                    s1 = s1.replaceFirst(String.valueOf(s1.charAt(i)),"");
                    s2 = s2.replaceFirst(String.valueOf(s2.charAt(j)),"");
                    return solution(s1,s2,++common);
                }
            }
        }
        return common;
    }
}
