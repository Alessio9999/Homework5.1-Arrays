import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1:");
        int[] arr1 = new int[] {1, 2, 3};
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        boolean[] arr3 = {true, false, false, true, false};

        System.out.println("\nЗадача 2:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length -1) System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length -1) System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length -1) System.out.print(", ");
        }

        System.out.println("\n\nЗадача 3:");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println();
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i != 0) System.out.print(", ");
        }

        System.out.println("\n\nЗадача 4:");
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] % 2 !=0) arr1[i]++;
        System.out.println(Arrays.toString(arr1));
    }
}