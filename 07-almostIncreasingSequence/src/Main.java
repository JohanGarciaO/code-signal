public class Main {
    public static void main(String[] args) {
        int[] array = {10, 1, 2, 3, 4, 5, 6, 1};
        System.out.println(solution(array));
    }

    public static boolean solution(int[] sequence) {
        int contError = 0;
        // n-2, n-1, n, n+1, n+2
        for (int i=0; i<sequence.length-1;i++){
            if (sequence[i+1] <= sequence [i]){
                if (++contError > 1) return false;
                if(
                        i-1 >= 0 &&
                                i+2 <= sequence.length-1 &&
                                sequence[i+1] <= sequence[i-1] &&
                                sequence[i+2] <= sequence[i]
                ){
                    return false;
                }
            }
        }
        return contError < 2;
    }
}
