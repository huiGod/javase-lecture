import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] data = new int[]{7,4,2,6,9,3,10,5};
//        Arrays.stream(BubbleSort(data)).forEach(System.out::println);

    }

    private static int[] BubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length -i -1; j++) {
                int temp;
                if (data[j] < data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }
}
