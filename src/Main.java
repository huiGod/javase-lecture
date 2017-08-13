import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] data = new int[]{7,4,2,6,9,3,10,5};
//        Arrays.stream(BubbleSort(data)).forEach(System.out::println);
        QuickSort(data, 0, 7);
        Arrays.stream(data).forEach(System.out::println);

//        Arrays.sort(data);
//        System.out.println(BinartSearch(data, 6));
    }

    /**
     * Bubble Sort
     * @param data
     * @return
     */
    private static int[] BubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length -i -1; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }

    /**
     * Quick Sort
     */
    private static void QuickSort(int[] data, int low, int high) {
        int l =low;
        int h = high;
        int povit = data[low];

        while (l < h) {
            while (l < h && data[h] >= povit) {
                h--;
            }
            if (l < h) {
                int temp = data[h];
                data[h] = data[l];
                data[l] = temp;
                l++;
            }
            while (l < h && data[l] < povit) {
                l++;
            }
            if (l < h) {
                int temp = data[h];
                data[h] = data[l];
                data[l] = temp;
                h--;
            }
        }
//        Arrays.stream(data).forEach(System.out::print);
//        System.out.println();
        if (l > low) {
            QuickSort(data, low, l-1);
        }
        if (h < high) {
            QuickSort(data, l + 1, high);
        }
    }

    /**
     * Binary Search
     */
    private static int BinartSearch(int[] data, int value) {
        int low = 0;
        int high = data.length - 1;
        int middle;
        while (low <= high) {
            middle = (low + high) / 2;
            if (data[middle] == value) {
                return middle;
            }
            if (value < data[middle]) {
                high = middle - 1;
            }
            if (value > data[middle]) {
                low = middle + 1;
            }
        }
        return -1;
    }
}
