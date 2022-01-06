public class Stairs {
    public static void main(String[] args) {
        intro();
        smallStair();
        midStair();
        bigStair();
    }

    public static void intro() {
        System.out.println("The program below will print 3 stairs of varying sizes");
        System.out.println("The stairs is made of the backslash character");
    }

    public static void smallStair() {
        System.out.println();
        System.out.println("\\");
        System.out.println("\\\\");
    }

    public static void midStair() {
        smallStair();
        System.out.println("\\\\\\");
        System.out.println("\\\\\\\\");
    }

    public static void bigStair() {
        midStair();
        System.out.println("\\\\\\\\\\");
        System.out.println("\\\\\\\\\\\\");
    }
}