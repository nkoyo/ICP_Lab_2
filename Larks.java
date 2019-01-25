package lab_exercise_2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author Tamisha Dzifa Segbefia
 * @author Larkuo Wilson-Tetteh
 * @version 1.0.0
 */

public class Larks {

    public Larks(){}

    public void Day () {
        System.out.print("Input the date in the format MM DD YYYY : ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        if(input.length() != 10) { // if the string is not in the required format
            throw new IllegalArgumentException("Chale, please just follow the instructions.");
        }
        int month = Integer.parseInt(input.substring(0, 2));
        int monthInt;
        switch (month) {
            case 1:  monthInt = Calendar.JANUARY;
                break;
            case 2:  monthInt = Calendar.FEBRUARY;
                break;
            case 3:  monthInt = Calendar.MARCH;
                break;
            case 4:  monthInt = Calendar.APRIL;
                break;
            case 5:  monthInt = Calendar.MAY;
                break;
            case 6:  monthInt = Calendar.JUNE;
                break;
            case 7:  monthInt = Calendar.JULY;
                break;
            case 8:  monthInt = Calendar.AUGUST;
                break;
            case 9:  monthInt = Calendar.SEPTEMBER;
                break;
            case 10:  monthInt = Calendar.OCTOBER;
                break;
            case 11:  monthInt = Calendar.NOVEMBER;
                break;
            case 12:  monthInt = Calendar.DECEMBER;
                break;
            default: throw new IllegalArgumentException("Error!! Your month is invalid."); // if the month is not one of the 12 calendar months
        }
        int date = Integer.parseInt(input.substring(3, 5));
        int year = Integer.parseInt(input.substring(6));

        if(month == 2) { // if the month is February
            if(year % 4 != 0){ // if the year is not a leap year
                if(date > 28){ // if it has more than 28 days
                    throw new IllegalArgumentException("Error!! Check your days, my dear.");
                }
            } else { // if it is a leap year
                if(date > 29){
                    throw new IllegalArgumentException("Error!! It's a leap year, not a dual leap year.");
                }
            }
        }

        if(month == 9 || month == 4 || month == 6 || month == 11) { // if the month is September, April, June, or November
            if(date > 30) {
                throw new IllegalArgumentException("Error!! Thirty days has September, April, June, and November...");
            }
        } else { // if not
            if(date > 31) {
                throw new IllegalArgumentException("Error!! Check the daysssssssssssss");
            }
        }
        Calendar Tams = new GregorianCalendar();
        Tams.set(year, monthInt, date);
        int day = Tams.get(Calendar.DAY_OF_WEEK);
        System.out.println(days[day-1]);
    }

    private String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void main(String[] args) {
        Larks lark = new Larks();
        lark.Day();
    }
}
