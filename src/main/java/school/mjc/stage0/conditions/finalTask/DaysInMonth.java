package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {


        if (year < 0 || month < 1 || month > 12) {
            System.out.println("Invalid date.");


        }

        if (month < 1 || month > 12) {
            System.out.println("Invalid date.");
        } else {
            int daysInMonth = 0;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;

                case 2:
                    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
            }
            if (daysInMonth == 0) {
                System.out.println("Invalid date.");
            } else {
                System.out.println("Number of days in month " + month + " in year " + year + " is " + daysInMonth + ".");
            }
        }
    }
}

//3. Days in a month.
//        Create a program that will consume a year and a month (validation is required)
//        and will print amount of days in this month considering also if a year is leap or not.
//        (prints amount of days or else "invalid date", negative years are not accepted)