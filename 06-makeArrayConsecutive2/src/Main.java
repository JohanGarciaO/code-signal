public class Main {
    public static void main(String[] args) {
        int[] array = {6, 2, 3, 8};
        System.out.println(solution(array));
    }
    public static int solution(int[] statues) {
        int max = maxInt(statues);
        int min = minInt(statues);
        int additionalStatues = 0;

        for (int i = min+1; i<max; i++){
            boolean exist = false;
            for (int j = 0; j<statues.length;j++){
                if (i == statues[j]) exist = true;
            }
            if (!exist) additionalStatues++;
        }

        return additionalStatues;
    }

    public static int maxInt(int[] array){
        int max=array[0];
        for(int value : array){
            if (value > max) max = value;
        }
        return max;
    }

    public static int minInt(int[] array){
        int min=array[0];
        for(int value : array){
            if (value < min) min = value;
        }
        return min;
    }
}
