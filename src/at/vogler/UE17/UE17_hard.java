package at.vogler.UE17;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UE17_hard {
    public static void main(String[] args) {
        int[] testarr = new int[]{0, 1, 2, 3};
        System.out.println(Arrays.stream(addNumber(testarr, 2)).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
    }
    public static int indexOf(int[] ia, int n) {
        return IntStream.range(0, ia.length).filter(i -> ia[i]==n).findFirst().orElse(-1);
    }
    public static int indexOf(int[] ia, int n, int pos) {
        if (ia == null || pos < 0 || pos >= ia.length) return -1;
        return IntStream.range(pos, ia.length).filter(i -> ia[i]==n).findFirst().orElse(-1);
    }

    public static int[] addNumber(int[] ia, int n) {
        return Arrays.stream(ia).map(i -> i+n).toArray();
    }
    public static double[] copyArray(double[] a) { return a.clone(); }
    public static boolean[] stringToBooleanArray(String s) {
        boolean[] ret = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ret[i] = !Character.isWhitespace(s.charAt(i));
        }
        return ret;
    }
    public static int[] summen(boolean[] ba) {
        int trues = (int) IntStream.range(0, ba.length).filter(i -> ba[i]).count();
        return new int[]{trues, ba.length-trues};
    }
    public static int[] deleteEquals(int[] ia) {
        return IntStream.of(ia).distinct().toArray();
    }
}
