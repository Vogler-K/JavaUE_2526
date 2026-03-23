package at.vogler.UE13;

import at.vogler.libs.PopUp;
import java.util.regex.Pattern;

public class UE13 {
    public static void main() {
        // inputParser();
        System.out.println("\n --- func delStringAtPos() --- ");
        System.out.println("delStringAtPos(\"Hallo Leute!\", 6, 5)\": " + delStringAtPos("Hallo Leute!", 6, 5));   System.out.println();

        System.out.println(" --- func enthaeltZiffern() --- ");
        System.out.println("enthaeltZiffern(\"Hallo, 1AI\"): " + enthaeltZiffern("Hallo 1AI"));
        System.out.println("enthaeltZiffern(\"Hallo Welt\"): " + enthaeltZiffern("Hallo Welt"));

        System.out.println("\n --- func enthaeltNurZiffern() --- ");
        System.out.println("enthaeltNurZiffern(\"Hallo 1AI\"): " + enthaeltNurZiffern("Hallo 1AI"));
        System.out.println("enthaeltNurZiffern(\"6270983\"): " + enthaeltNurZiffern("6270983"));
        System.out.println("enthaeltNurZiffern(\"627x983\"): " + enthaeltNurZiffern("627x983"));

        System.out.println("\n --- func countLowerCaseLetters() --- ");
        System.out.println("countLowerCaseLetters(\"Hallo 1aI\"): " + countLowerCaseLetters("Hallo 1aI"));

        System.out.println("\n --- func bbSprache() --- ");
        System.out.println("bbSprache(\"Hallo, Erde!\"): " + bbSprache("Hallo, Erde!"));
    }

    public static void inputParser() {
        String input = "";
        while (!input.equals("quit")) {
            input = PopUp.readLine("Input: ");
            if (input.length() >= 3) {
                System.out.print("Rule 1: ");
                System.out.println(input.substring(1, 3));
            }
            if (input.length() >= 2) {
                System.out.print("Rule 2: ");
                System.out.println(input.substring(input.length()-2));
            }
            if (input.length() >= 3) {
                System.out.print("Rule 3: ");
                System.out.println(input.substring(0, 2) + " " + input.substring(input.length()-3));
            }
        }
    }

    public static String delStringAtPos(String s, int startPos, int len) {
        if (startPos >= s.length() || startPos < 0) {
            return s;
        }
        return s.substring(0, startPos) + s.substring(startPos+len);
    }

    public static boolean enthaeltZiffern(String s) {
        return s.matches(".*\\d.*");
    }

    public static boolean enthaeltNurZiffern(String s) {
        return s.matches("\\d+");
    }

    public static int countLowerCaseLetters(String s) {
        return (int) Pattern.compile("[a-z]").matcher(s).results().count();
    }

    public static String bbSprache(String satz) {
        return Pattern.compile("([AaEeIiOoUuÄäÖöÜü])").matcher(satz).replaceAll(m -> {
            return m.group() + "b" + m.group().toLowerCase();
        });
    }
}