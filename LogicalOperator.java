public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a < b && b > 10); // AND
        System.out.println(a > b || b > 10); // OR
        System.out.println(!(a > b));        // NOT
    }
}
