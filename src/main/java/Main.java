import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a time (in seconds) ");

        boolean isValid = false;
        while (!isValid) {
            try {
                String seconds = input.nextLine();
                System.out.println(TimeFormatter.formatDuration(Double.parseDouble(seconds)));
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a NUMBER");
            }
        }
    }
}
