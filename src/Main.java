import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[10];
//        System.out.println(Arrays.toString(arr));
//        boolean[] bool = new boolean[10];
//        System.out.println(Arrays.toString(bool));
//
//        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(Arrays.toString(arr2));
//        /*
//            [1, 2, 3, 4, 5, 6, 7, 8, 9]
//             0  1  2  3  4  5  6  7  8
//         */
//        int var = arr2[4];
//        System.out.println(var);
//
//        String [] arr3 = {"Monday", "Fryday", "Wednesday"};
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(arr3.length);
//        System.out.println(arr3[3]); //ArrayIndexOutOfBoundsException: 3
//        String [] arr4 = {};
//        System.out.println(Arrays.toString(arr4));
//        int [] arr5 = new int[5];
//        System.out.println(Arrays.toString(arr5));
//        arr5[0] = 1;
//        arr5[1] = 2;
//        arr5[2] = 3;
//        arr5[3] = arr5[1] + arr5[2];
//        //            2  +    3
//        System.out.println(Arrays.toString(arr5));
        //Ссылка
//        int[] origin = {1, 3, 6, 8, 90};
//        int[] copy = origin;
//        copy[2] = 9999;
//        System.out.println(Arrays.toString(origin));

        //Копирование
//        int[] origin2 = {1, 3, 6, 8, 90, 99};
//        int[] copyOf = Arrays.copyOf(origin2, origin2.length);
//        copyOf[2] = 9999;
//        System.out.println(Arrays.toString(origin2));
//        System.out.println(Arrays.toString(copyOf));
//        int [] copy = new int[origin2.length];
//        for (int i = 0; i < origin2.length; i++) {
//            copy[i] = origin2[i];
//        }
//        System.out.println(Arrays.toString(copy));
        //Иммутабельный (неизменяемый)
//        int[] origin2 = {10, 55, 33, 1, 3, 6, 8, 90, 99};
////        for (int i = 0; i < origin2.length; i++) {
////            System.out.println(origin2[i]);
////        }
//        System.out.println(Arrays.toString(origin2));
//        Arrays.sort(origin2);
//        System.out.println(Arrays.toString(origin2));
        //For-each
//        for (int num: origin2) {
//            System.out.println(num);
//        }
//
//        String[] str = {"a", "b", "c", "d", "e", "f", "g"};
//        for (String num: str) {
//            System.out.println(num);
//        }
//

//        int[][] orig2D = new int[3][3];
//        orig2D[0][0] = 1;
//        int[][] orig2D1 = new int[3][];
//        orig2D1[0] = new int[]{1};
//        orig2D1[1] = new int[]{1};
//        orig2D1[2] = new int[]{1};
//
//        int[][][][][][] ppp = new int[3][3][3][3][3][3];
//
//        int[][] arr2D = {{1, 2}, {3, 4}};
//        System.out.println(arr2D[1][1]);
//        System.out.println(arr2D[0][0]);
//        System.out.println(arr2D[0][1]);
//        System.out.println(arr2D[1][0]);


//        String[] str = {"a", "b", "c", "d", "e", "f", "g"};
//        System.out.println(Arrays.toString(str));
//
//        int[][] arr2D = {{1, 2, 6}, {3, 4, 8}};
//        System.out.println(Arrays.deepToString(arr2D));

//        int[] partial = {5, 3, 8, 1, 9, 2, 77};
//        System.out.println(partial[3]);
//        Arrays.sort(partial, 2, 6);
//        System.out.println(Arrays.toString(partial));
//        System.out.println(partial[3]);
        /*
            5 3 8 1 9 2 77
            0 1 2 3 4 5 6  index
         */

        int[][] arr2D = {
                {1, 2, 6},
                {3, 4, 8}
        };

        for (int i = 0; i < arr2D.length; i++) {
            int rowSumm = 0;
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
                rowSumm += arr2D[i][j];
            }
            System.out.println("Summ -> " + rowSumm);
        }
    }
}