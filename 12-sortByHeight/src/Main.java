import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] validArray = bubbleSort(filterArray(a));
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 1) a[i] = validArray[index++];
        }

        System.out.println(Arrays.toString(a));
    }

    public static int[] filterArray(int[] array){
        int validsValue = 0;
        for (int value : array){
            if (value>=1) validsValue++;
        }

        int[] filteredArray = new int[validsValue];
        int index=0;

        for (int value : array){
            if (value>=1) filteredArray[index++] = value;
        }

        return filteredArray;
    }

    public static int[] bubbleSort(int[] array){
        boolean ordered = false;
        while(!ordered){
            ordered = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]){
                    int aux = array[i+1];
                    array[i+1] = array[i];
                    array[i] = aux;
                    ordered = false;
                }
            }
        }
        return array;
    }
}
