package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("Division by zero.");
            return;
        }

        int result = dividend / divider;
        int product = result * divider;

        if (product == dividend) {
            System.out.println("Can be divided completely.");
        } else {
            System.out.println("Cannot be divided completely.");
        }
    }
}


//4. Integer divider.
//  Create a program that will consume 2 integers from method args (dividend and divider)
//  and will perform integer division of dividend be divider, save the value,
//  and then will multiply result by divider and will if got value is equal to dividend will print:"can be divided completely",
//  otherwise "cannot be divided completely" or "division by zero".