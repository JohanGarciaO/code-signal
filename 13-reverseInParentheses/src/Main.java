public class Main {
    public static void main(String[] args) {
//        String inputString = "foo";
//        String inputString = "(bar)";
//        String inputString = "foo(bar)baz";
//        String inputString = "foo(bar)baz(blim)";
        String inputString = "foo(bar(baz))blim";
        System.out.println(solution(inputString));
    }

    public static String replaceLast(String text, String source, String target) {
        StringBuilder b = new StringBuilder(text);
        b.replace(text.lastIndexOf(source), text.lastIndexOf(source) + source.length(), target);
        return b.toString();
    }

    public static String solution(String inputString){
        int oppenedParentheses = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '(') {
                oppenedParentheses++;
                if (oppenedParentheses == 1) {
                    StringBuilder sb = new StringBuilder(inputString);
                    sb.setCharAt(i,'@');
                    inputString = sb.toString();
                }
            }else if (inputString.charAt(i) == ')') {
                oppenedParentheses--;
                if (oppenedParentheses == 0) {
                    StringBuilder sb = new StringBuilder(inputString);
                    sb.setCharAt(i,'@');
                    inputString = sb.toString();
                }
            }
        }

        String[] array = inputString.split("@");

        if (array.length > 1) {
            for (int i = 1; i < array.length; i+=2) {

                String reverse = "";

                if (!array[i].matches("[^\\(]+")){
                    array[i] = solution(array[i]);
                }
                for (int j = array[i].length()-1; j >= 0; j--) {
                    reverse += array[i].charAt(j);
                }
                array[i] = reverse;
            }
        }

        String outputString = "";

        for (String value: array){
            outputString += value;
        }
        return outputString;
    }
}
