import java.util.Scanner;

/**
 * Write a description of class Scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scenario
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("=== XFX Cinema Ticket System ===");

        System.out.print("Enter your age group (child/adult/senior): ");
        String ageGroup = in.next().toLowerCase();

        System.out.print("Enter movie language (nepali/hindi/english): ");
        String language = in.next().toLowerCase();

        System.out.print("Are you a student? (yes/no): ");
        String student = in.next().toLowerCase();

        System.out.print("Is it a festival day? (yes/no): ");
        String festival = in.next().toLowerCase();
       
        double price = 0;

        if (ageGroup.equals("child")) {
            price = 150;
        } else if (ageGroup.equals("adult")) {
            price = 250;
        } else if (ageGroup.equals("senior")) {
            price = 200;
        } else {
            System.out.println("Invalid age group entered.");
            return;
        }


        // Step 3: LANGUAGE SURCHARGE
        if (language.equals("hindi")) {
            price += 50;
        } else if (language.equals("english")) {
            price += 100;
        } else if (!language.equals("nepali")) {
            System.out.println("Invalid language entered.");
            return;
        }


        // Step 4: DISCOUNTS
        if (student.equals("yes")) {
            price -= price * 0.20;   // 20% student discount
        }

        if (festival.equals("yes")) {
            price -= price * 0.15;   // 15% festival discount
        }


        // Step 5: OUTPUT FINAL PRICE
        System.out.println("-----------------------------");
        System.out.println("Final Ticket Price: Rs. " + price);
        System.out.println("-----------------------------");
    }

}