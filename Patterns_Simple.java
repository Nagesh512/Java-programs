public class Patterns_Simple {

    public static void main(String args[]) {

        // ****
        // ***
        // **
        // *
        for (int line = 4; line >= 1; line--) {

            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 1
        // 12
        // 123
        // 1234
        int no = 4;
        for (int line = 1; line <= no; line++) {

            for (int n = 1; n <= line; n++) {
                System.out.print(n);
            }
            System.out.println();
        }
        
        // A
        // BC
        // DEF
        // GHIJ
        char ch = 'A';
        for (int line = 1; line <= no; line++) {

            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
