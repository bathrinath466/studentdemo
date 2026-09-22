public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Original value: " + a);

        System.out.println("++a = " + (++a)); // Pre-increment
        System.out.println("a++ = " + (a++)); // Post-increment
        System.out.println("Value after a++ = " + a);

        System.out.println("--a = " + (--a)); // Pre-decrement
        System.out.println("a-- = " + (a--)); // Post-decrement
        System.out.println("Value after a-- = " + a);
    }
}
