package at.vogler.UE16;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UE16 {
    public static void main(String[] args) {
        int[] nra = randomArray(5, -5, 20);
        System.out.print("int[] nra = randomArray(5, -5, 20): ");
        printArray(nra);
        System.out.println();
        System.out.println();
        System.out.println("\ngetMinimum(nra): " + getMinimum(nra));
        System.out.println("getMaximum(nra): " + getMaximum(nra));
        System.out.println("getSumme(nra): " + getSumme(nra));
        System.out.println("getMittelwert(nra): " + getMittelwert(nra));
    }
    public static void printArray(int[] a) {
        System.out.print("{"+ Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(", "))+"}");
    }
    public static void printArray(double[] a) {
        System.out.print("{"+ Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(", "))+"}");
    }
    public static void zahlenreihen() {
        int[] arr1 = new int[25];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }
        printArray(arr1);

        int[] arr2 = new int[20];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 5*(i+1);
        }
        printArray(arr2);

        int[] arr3 = new int[11];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i-5;
        }
        printArray(arr3);
    }
    public static int[] makeRandomArray() {
        int[] ret = new int[30];
        for (int i = 0; i < 30; i++) {
            ret[i] = (int) Math.ceil(Math.random()*10.0);
        }
        return ret;
    }
    public static int[] randomArray(int anzahl, int von, int bis) {
        if (von > bis) {
            int temp = von;
            von = bis;
            bis = temp;
        }
        int[] ret = new int[anzahl];
        for (int i = 0; i < anzahl; i++) {
            ret[i] = (int)(Math.random() * (bis - von + 1)) + von;
        }
        return ret;
    }
    public static int getMinimum(int[] ia) {
        int[] temp = ia.clone();
        Arrays.sort(temp);
        return temp[0];
    }
    public static int getMaximum(int[] ia) {
        int[] temp = ia.clone();
        Arrays.sort(temp);
        return temp[temp.length-1];
    }
    public static int getSumme(int[] ia) {
        return IntStream.of(ia).sum();
    }
    public static double getMittelwert(int[] ia) {
        return (double) getSumme(ia) / ia.length;
    }
}
