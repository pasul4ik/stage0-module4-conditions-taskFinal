package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Wrong month number");
        }

    }
}
//1. Season determiner.
//        Implement the program that will print the season name to the console by the number of the month.
//        If month is incorrect -> print "Wrong month number". Month will be passed as the method argument.
//        (Example: "1" -> "Winter", 0 -> "Wrong month number")