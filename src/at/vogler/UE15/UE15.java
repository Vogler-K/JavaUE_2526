package at.vogler.UE15;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.stream.Collectors;

public class UE15 {
    static void main(String[] args) {
        System.out.println();
        System.out.println("  --- removeNonLetters() ---  ");
        System.out.println("removeNonLetters(\"H3llo W0rld!\"): " + removeNonLetters("H3llo W0rld!"));
        System.out.println("removeNonLetters(\"123-ABC-!?!\"): " + removeNonLetters("123-ABC-!?!"));
        System.out.println("removeNonLetters(\"Jävâ\"): " + removeNonLetters("Jävâ"));

        System.out.println("  --- toSingleSpace() ---  ");
        System.out.println("toSingleSpace(\"Ein  Text   mit viel    Zwischenraum\"): " + toSingleSpace("Ein  Text   mit viel    Zwischenraum"));
        System.out.println("toSingleSpace(\"  Anfang und Ende  \"): " + "\"" + toSingleSpace("  Anfang und Ende  ") + "\"");

        System.out.println("  --- firstUpperCase() ---  ");
        System.out.println("firstUpperCase(\"java\"): " + firstUpperCase("java"));
        System.out.println("firstUpperCase(\"JAVA\"): " + firstUpperCase("JAVA"));
        System.out.println("firstUpperCase(\"ein GANZER satz\"): " + firstUpperCase("ein GANZER satz"));
        System.out.println("firstUpperCase(\" \"): \"" + firstUpperCase(" ") + "\"");

        System.out.println("  --- createRandomPassword() ---  ");
        System.out.println("createRandomPassword(8): " + createRandomPassword(8));
        System.out.println("createRandomPassword(15): " + createRandomPassword(15));

        System.out.println("  --- rot13() ---  ");
        System.out.println("rot13(\"Test\"): " + rot13("Test"));
        System.out.println("rot13(\"Abc\"): " + rot13("Abc"));
        System.out.println("rot13(\"Npq\"): " + rot13("Npq"));
        System.out.println("rot13(rot13(\"Hallo Welt\")): " + rot13(rot13("Hallo Welt")));
    }
    public static String removeNonLetters(String s) {
        return s.replaceAll("[^\\p{L}]", "");
    }
    public static String toSingleSpace(String text) {
        return text.replaceAll("\s{2,}", " ");
    }
    public static String firstUpperCase(String word) {
        return (""+word.charAt(0)).toUpperCase() + word.substring(1).toLowerCase();
    }
    public static String createRandomPassword(int length) {
        String chars = "abcdefghijkmnopqrstuvwxyzABCDEFGHIJKLMNPQRSTUVWXYZ0123456789";
        return new SecureRandom().ints(length, 0, chars.length())
                .mapToObj(chars::charAt)
                .map(Objects::toString)
                .collect(Collectors.joining());
    }
    public static String rot13(String s) {
        return s.chars()
                .map(c -> {
                    if (c >= 'A' && c <= 'M' || c >= 'a' && c <= 'm') {
                        c+=13;
                    } else if (c >= 'N' && c <= 'Z' || c >= 'n' && c <= 'z') {
                        c-=13;
                    }
                    return c;
                })
                .mapToObj(c -> ""+((char) c))
                .collect(Collectors.joining());
    }
}
