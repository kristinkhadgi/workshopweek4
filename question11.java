import java.util.Scanner;

/**
 * Write a description of class question11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question11
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your annual income (NPR): ");
        double income = scanner.nextDouble();
        double tax = 0;

        if (income <= 500000) {
            tax = income * 0.01;
        } else if (income <= 7000000) {
            tax = 5000 + 0.10 * (income - 500000);
        } else if (income <= 10000000) {
            tax = 150000 + 0.20 * (income - 7000000);
        } else if (income <= 20000000) {
            tax = 750000 + 0.30 * (income - 10000000);
        } else if (income <= 50000000) {
            tax = 3350000 + 0.36 * (income - 20000000);
        } else {
            tax = 11350000 + 0.39 * (income - 50000000);

}
}

}