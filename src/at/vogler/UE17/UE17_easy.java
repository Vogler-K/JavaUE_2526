package at.vogler.UE17;

public class UE17_easy {
    public static void main(String[] args) {
    }
    public static int indexOf(int[] ia, int n) {
        for (int i = 0; i < ia.length; i++) {
            if (n == ia[i]) {
                return i;
            }
        }
        return -1;
    }
    public static int indexOf(int[] ia, int n, int pos) {
        for (int i = pos; i < ia.length; i++) {
            if (n == ia[i]) {
                return i;
            }
        }
        return -1;
    }
    public static int[] addNumber(int[] ia, int n) {
        int[] copy = ia.clone();
        for (int i = 0; i < ia.length; i++) {
            copy[i] += n;
        }
        return copy;
    }
    public static double[] copyArray(double[] a) {
        return a.clone();
    }
    public static boolean[] stringToBooleanArray(String s) {
        boolean[] ret = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ret[i] = !Character.isWhitespace(s.charAt(i));
        }
        return ret;
    }
    public static int[] summen(boolean[] ba) {
        int[] m = new int[]{0, 0};
        for (boolean b : ba) {
            m[(b) ? 0 : 1] += 1;
        }
        return m;
    }
    public static int[] deleteEquals(int[] ia) {
        int[] shortened = new int[ia.length];
        int fin_length = 0;
        for (int i = 0; i < ia.length; i++) {
            if (indexOf(shortened, ia[i]) == -1) {
                shortened[fin_length] = ia[i];
                fin_length++;
            }
        }
        int[] short_short = new int[fin_length];
        for (int i = 0; i < fin_length; i++) {
            short_short[i] = shortened[i];
        }
        return short_short;
    }
}
