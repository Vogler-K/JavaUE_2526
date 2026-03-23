package at.vogler.UE14;

import java.util.regex.Pattern;

public class UE14 {
    static void main() {
        System.out.println("  ---  deleteCharAtPos()  ---  ");
        System.out.println("deleteCharAtPos(\"Hallox 1XI\", 5): " + deleteCharAtPos("Hallox 1XI", 5));
        System.out.println("deleteCharAtPos(\"Hallo Welt\", 18): " + deleteCharAtPos("Hallo Welt", 18));

        System.out.println("\n  ---  deleteCharAtPos()  ---  ");
        System.out.println("zaehleZeichenAusVorrat(\"Hallo 1XI\" , \"aeiou\"): " + zaehleZeichenAusVorrat("Hallo 1XI" , "aeiou"));
        System.out.println("zaehleZeichenAusVorrat(\"*code*123#\" , \"?%*!#$\"): " + zaehleZeichenAusVorrat("*code*123#" , "?%*!#$"));

        System.out.println("\n  ---  nurAusVorrat()  ---  ");
        System.out.println("nurAusVorrat(\"1232432\", \"1234\"): " + nurAusVorrat("1232432", "1234"));
        System.out.println("nurAusVorrat(\"12352432\", \"1234\"): " + nurAusVorrat("12352432", "1234"));

        System.out.println("\n  ---  createRandomString()  ---  ");
        System.out.println("createRandomString(\"1234\", 5): " + createRandomString("1234", 5));
        System.out.println("createRandomString(\"123456789abcdef\", 16): " + createRandomString("123456789abcdef", 16));

        System.out.println("\n  ---  createUpperLower()  ---  ");
        System.out.println("createUpperLower(\"hallo welt\"): " + createUpperLower("hallo welt"));
        System.out.println("createUpperLower(\"a1a2a3xxx\"): " + createUpperLower("a1a2a3xxx"));

        System.out.println("\n  ---  cut()  ---  ");
        System.out.println("cut(\"Ein langer Text\", 10): " + cut("Ein langer Text", 10));
        System.out.println("cut(\"Ein anderer Text\", 20): " + cut("Ein anderer Text", 20));
    }
    public static String deleteCharAtPos(String s, int pos) {
        if (pos < 0 || pos >= s.length()) {
            return s;
        }
        return s.substring(0, pos) + s.substring(pos+1);
    }

    /*public static int zaehleZeichenAusVorrat(String s, String vorrat) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vorrat.indexOf(s.charAt(i)) != -1) {
                counter++;
            }
        }
        return counter;
    }*/

    public static int zaehleZeichenAusVorrat(String s, String vorrat) {
        return (int) Pattern.compile("["+vorrat+"]").matcher(s).results().count();
    }


    public static boolean nurAusVorrat(String s, String vorrat) {
        for (int i = 0; i < s.length(); i++) {
            if (vorrat.indexOf(s.charAt(i)) != -1) {
                return false;
            }
        }
        return true;
    }

    public static String createRandomString(String vorrat, int len) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(vorrat.charAt((int) (Math.random() * 1024) % vorrat.length()));
        }
        return builder.toString();
    }

    public static String createUpperLower(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                builder.append(Character.toUpperCase(s.charAt(i)));
            } else {
                builder.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return builder.toString();
    }

    public static String cut(String s, int length) {
        if (length >= s.length()) {
            return s;
        }
        return s.substring(0, length-3) + "...";
    }
}
