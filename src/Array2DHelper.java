public class Array2DHelper {

    static void printArray(int[] arr) {
        System.out.print("Массив: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println("]");
    }

    static void fillArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }

    static boolean contains(int[] arr, int value) {
        for (int nun : arr) {
            if (nun == value) {
                return true;
            }
        }
        return false;
    }

    public static int countContains(int[] arr, int value) {
        int count = 0;
        for (int j : arr) {
            if (j == value) {
                count++;
            }
        }
        return count;
    }

    static void printArray(String[] arr) {
        System.out.print("Массив строк: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println("]");
    }

    static void analyzeArray(int[] arr) {
        printArray(arr);
        fillArray(arr, 1);
        printArray(arr);
        System.out.println(contains(arr, 1));
    }
}
