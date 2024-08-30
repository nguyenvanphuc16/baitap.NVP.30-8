package baitap30.pkg8;

import java.util.Scanner;

public class Baitap308 {

    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhap phan tu thu:  " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    public static void printData(float[] arrays) {
        System.out.print("Cac phan tu trong mang: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " , ");
        }
        System.out.println();
    }

    public static float findMax2(float[] arrays) {
        float max1 = Float.MIN_VALUE;
        float max2 = Float.MIN_VALUE;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > max1) {
                max2 = max1;
                max1 = arrays[i];
            } else if (arrays[i] > max2 && arrays[i] < max1) {
                max2 = arrays[i];
            }
        }
        return max2;
    }

    public static void deleteOddNumber(float[] arrays) {
        System.out.print("Mang sau khi xoa cac phan tu le: ");
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                System.out.print(arrays[i] + " , ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        float[] arrays = new float[n];

        arrays = importData(arrays);

        printData(arrays);

        float max2 = findMax2(arrays);
        System.out.println("Phan tu lon thu 2 trong mang la: " + max2);
        deleteOddNumber(arrays);
    }
}
