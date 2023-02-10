public class Operators {

    public static void main(String args[]) {

        // Arithmetical Operator
        int A = 10;
        int B = 5;
        System.out.println("add = " + (A + B));
        System.out.println("Substract = " + (A - B));
        System.out.println("Multiply = " + (A * B));
        System.out.println("divide = " + (A / B));
        System.out.println("modulo(remainder) = " + (A % B));

        // Relatoinal Operator
        int a = 5;
        int b = 10;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // Logical Operator
        System.out.println(!(3 > 4));

        // Assignment Operator
        int x = 10;
        // x = x + 10 == x += 10;
        // x = x - 10 == x -= 10;
        // x = x * 10 == x *= 10;
        // x = x / 10 == x /= 10;
        // x = x % 10 == x %= 10;
        // x -= 10;
        System.out.println(x);
        x += 10;
        System.out.println(x);

        // ****************** Ternary Operator ***********/
        int number = 4;
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);

    }
}
