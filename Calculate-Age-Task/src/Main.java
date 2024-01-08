import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);

        Date today = new Date();
        Calendar calendarToday = Calendar.getInstance();
        calendarToday.setTime(today);

        System.out.println("Enter your birth year :");
        int birthYear = myScanner.nextInt();

        System.out.println("Enter your birth month :");
        int birthMonth = myScanner.nextInt();

        System.out.println("Enter your birth day :");
        int birthDay = myScanner.nextInt();

        Calendar calendarBirthDay = Calendar.getInstance();
        calendarToday.set(birthYear, (birthMonth - 1), birthDay);

        int age = calendarBirthDay.get(Calendar.YEAR) - calendarToday.get(Calendar.YEAR);

        System.out.println("The age is :" + age);
        myScanner.close();
    }
}
