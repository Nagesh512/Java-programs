import java.util.*;

public class income_taxCal {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter your salary");
        int income = sc.nextInt();

        float tax;

        if (income < 500000) {
            tax = 0;
        } else if (income > 500000 && income < 1000000) {
            int tax_on_amount = income - 500000;
            tax = tax_on_amount * 0.2f;
        } else {
            int tax_on_amount = income - 1000000;
            tax = tax_on_amount * 0.3f + 500000 * 0.2f;

        }

        System.out.println("Tax amount to be paid is " + tax);

    }
}
