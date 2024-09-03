public class lesson_7 {
    public static void main(String[] args) {
        // First part
        String hello = "Hello World";
        int stringLength = hello.length();
        System.out.println(stringLength);

        // Second part
        String greet = "HOW".trim();
        System.out.println(greet);
        String lc = (greet + "DY").toLowerCase();
        System.out.println(lc);
    }
}
