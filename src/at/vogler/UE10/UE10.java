package at.vogler.UE10;

public class UE10 {
    static void main(String[] args) {
        drawXmasTree(6, "@");
        drawXmasTree(3, "@");
        drawXmasTree(8);
        drawXmasTree(3);
        drawXmasTreeBorder(8);
        drawXmasTreeBorder(3);
    }
    public static void drawXmasTree(int length) {
        if (length<3) return;
        for (int i = 1; i <= length; i++) {
            System.out.println(" ".repeat(length-i)+"*".repeat(i*2-1));
        }
        System.out.print((" ".repeat(length-1)+"|\n").repeat((length-1)/2));
    }
    public static void drawXmasTree(int length, String symbol) {
        if (length<3) return;
        for (int i = 1; i <= length; i++) {
            System.out.println(" ".repeat(length-i)+symbol.repeat(i*2-1));
        }
        System.out.print((" ".repeat(length-1)+"|\n").repeat((length-1)/2));
    }
    public static void drawXmasTreeBorder(int length) {
        if (length<3) return;
        System.out.println(" ".repeat(length) + (Math.random() < 0.5 ? "/" : "\\"));
        for (int i = 1; i <= length; i++) {
            System.out.println(" ".repeat(length-i)+"/"+"*".repeat(i*2-1)+"\\");
        }
        System.out.print((" ".repeat(length)+"|\n").repeat((length-1)/2));
    }
}
