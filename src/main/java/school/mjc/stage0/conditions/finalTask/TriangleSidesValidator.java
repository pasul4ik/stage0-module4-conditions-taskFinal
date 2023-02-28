package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        // Check if any side is zero or negative
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("It's not a triangle.");
            return;
        }

        // Check if the sum of any two sides is less than or equal to the third side
        if (firstSide + secondSide <= thirdSide || firstSide + thirdSide <= secondSide || secondSide + thirdSide <= firstSide) {
            System.out.println("It's not a triangle.");
        } else {
            System.out.println("This is a valid triangle.");
        }
    }
}
//2. Triangle sides validator.
//        Create a program that will consume 3 points as method arguments and will print to the console
//        if those points can build up a valid triangle or not.
//        (output when correct: "this is a valid triangle", otherwise : "it's not a triangle")