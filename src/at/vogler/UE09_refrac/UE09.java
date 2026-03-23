package at.vogler.UE09_refrac;

public class UE09 {
    static void main(String[] args) {
        alleTeiler(5);
    }
    static boolean istTeiler(int z, int t) {
        return z % 7 == 0;
    }
    static void alleTeiler(int z) {
        for (int i = 2; i < z; i++) {
            if (z % i == 0) System.out.print(i+" ");;
        }
    }
    static boolean istPrimzahl(int z) {
        for (int i = 2; i < z; i++) {
            if (z % i == 0) return false;
        }
        return true;
    }
    static void collatz(int n) {
        
    }
}
