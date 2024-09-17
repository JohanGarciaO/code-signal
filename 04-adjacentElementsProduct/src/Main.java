public class Main {
    public static void main(String[] args) {
        int[] array = {3, 6, -2, -5, 7, 3};
        System.out.println(solution(array));
    }
    public static int solution(int[] inputArray) {
        int[] vector = new int[inputArray.length-1];
        int index = 0;

        for (int i=0; i<inputArray.length-1;i++){
            vector[index++] = inputArray[i]*inputArray[i+1];
        }

        return maxNumber(vector);
    }

    public static int maxNumber(int[] inputArray){
        int max = inputArray[0];
        for (int value : inputArray){
            if(value > max) max = value;
        }
        return max;
    }
}
