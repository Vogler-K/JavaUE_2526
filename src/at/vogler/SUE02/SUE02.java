package at.vogler.SUE02;

import java.util.ArrayList;

// Übung 9 in Java
public class SUE02 {
    static void main() {
        System.out.println(istTeiler(15,3));
        System.out.println(istTeiler(16,5));
        alleTeiler(6);
        collatz(61);
        System.out.println(collatzLen(61));
    }

    public static boolean istTeiler(int z, int t) {
        return t % z == 0;
    }

    public static void alleTeiler(int z) {
        System.out.print("Die Zahl " + z + " hat folgende Teiler: 1");
        for (int i = 2; i <= z; i++) {
            if (z%i==0) System.out.print(", " + i);
        }
        System.out.println();
    }

    public static boolean istPrimzahl(int z) {
        if (z <= 1) return false;
        final int max_teiler = (int) Math.ceil(Math.sqrt(z));
        for (int i = 2; i<=max_teiler && i<z; i++) {
            if (z%i==0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> collatz_arr(int n) {
        int m = n;
        ArrayList<Integer> elements = new ArrayList<Integer>();
        elements.add(m);
        while (m != 1) {
            if (m%2==1) {
                m = 3*m+1;
            } else if (m%2==0) {
                m = m/2;
            }
            elements.add(m);
        }
        return elements;
    }

    public static void collatz(int n) {
        ArrayList<Integer> elements = collatz_arr(n);
        System.out.print(elements.getFirst());
        for (int i = 1; i < elements.size(); i++) {
            System.out.print("->"+elements.get(i));
        }
        System.out.println();
    }

    public static int collatzLen(int n) {
        return collatz_arr(n).size();
    }
}
