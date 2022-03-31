// Nicolas Matthew Suhardi
// TA: Brett Wortzman
// CSE 142 Section AC
// 1/8/2022
// Take-Home Assessment #1
// Prints out three figures of stairs with varying sizes

public class Stairs {

    // don't have to comment on main
    public static void main(String[] args) {
        smallStairs();
        System.out.println();
        mediumStairs();
        System.out.println();
        largeStairs();
    }

    // Print small stairs
    public static void smallStairs() {
        System.out.println("\\");
        System.out.println("\\\\");
    }

    // Print medium stairs
    public static void mediumStairs() {
        smallStairs();
        System.out.println("\\\\\\");
        System.out.println("\\\\\\\\");
    }

    // Print large stairs
    public static void largeStairs() {
        mediumStairs();
        System.out.println("\\\\\\\\\\");
        System.out.println("\\\\\\\\\\\\");
    }
}
