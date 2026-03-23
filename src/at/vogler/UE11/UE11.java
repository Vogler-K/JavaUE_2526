package at.vogler.UE11;
import at.vogler.libs.PopUp;

public class UE11 {
    public static void main() {
        verticalString("hello");
        System.out.println("-----------------------");
        withStars("hello");
        System.out.println("-----------------------");
        displayString("Die ersten 5 Tage nach dem Wochenende sind die Schlimmsten");
        System.out.println("-----------------------");
        stringAnalyzer();
    }

    public static void stringAnalyzer() {
        while (true) {
            String input = PopUp.readLine("Enter Text to Analyze: ");
            if (input.equals("quit")) {break;}
            if (!input.isEmpty()) {
                System.out.println(input.charAt(input.length() - 1));
            }
            if (input.length() >= 2) {
                System.out.println(input.charAt(1));

                System.out.print(input.charAt(0));
                System.out.println(input.charAt(1));

                System.out.println(input.charAt(input.length() - 2));

                System.out.print(input.charAt(1));
                System.out.println(input.charAt(input.length() - 2));
            }
        }
    }

    public static void verticalString(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void withStars(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            System.out.print(s.charAt(i));
            System.out.print("*");
        }
        System.out.println(s.charAt(s.length()-1));
    }

    public static void displayString(String s1) {
        System.out.println(s1);
        for (int i = 0; i < s1.length(); i++) {
            if (i%10==0) {
                System.out.print((int) i/10);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(i%10);
        }
        System.out.println();
    }
}
