public class Demo {
    public static void main(String[] args) {
        firstParagraph();
        System.out.println("one");
        secondParagraph();
    }

    public static void firstParagraph() {
        secondParagraph();
        System.out.println("four");
    }

    public static void secondParagraph() {
        System.out.println("three");
        thirdParagraph();
    }

    public static void thirdParagraph() {
        System.out.println("two");
    }
}