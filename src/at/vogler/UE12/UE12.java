package at.vogler.UE12;

public class UE12 {
    static void main() {
        System.out.println(jedesZweite("abababab"));
        System.out.println(reverseString("abcdef"));
        System.out.println(deleteBlanks("Hier ist ein Satz."));
        System.out.println("Ist Tacocat ein Palindrom? " + istPalindrom("Taco Cat"));
        System.out.println("Ist Taco in Tacos enthalten? " + istEnthalten("Tacos", "Taco"));
        System.out.println("Wie oft ist M in Markus? " + zaehleVorkommen("Markus", "M"));
    }

    public static String jedesZweite(String s1) {
        String output = "";
        for (int i = 0; i < s1.length(); i+=2) {
            output = output + s1.charAt(i);
        }
        return output;
    }

    public static String reverseString(String s1) {
        String output = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            output = output + s1.charAt(i);
        }
        return output;
    }

    public static String deleteBlanks(String s1) {
        return s1.replaceAll("\\s", "");
    }

    public static boolean istPalindrom(String s1) {
        String original = deleteBlanks(s1);
        String reversed = reverseString(deleteBlanks(s1));
        return original.equalsIgnoreCase(reversed);
    }

    public static boolean istEnthalten(String s1, String s2) {
        return s1.contains(s2);
    }

    public static int zaehleVorkommen(String s1, String s2) {
        if (s1.isEmpty() || s2.isEmpty()) return 0;
        int n = 0;
        int i = 0;
        while ( (i = s1.indexOf(s2, i)) != -1) {
            n++;
            i+=s2.length();
        }
        return n;
    }
}
