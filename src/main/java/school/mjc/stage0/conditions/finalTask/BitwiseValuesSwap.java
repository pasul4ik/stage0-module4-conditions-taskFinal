package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        System.out.println("Before swap: first=" + first + ", second=" + second);
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println("After swap: first=" + first + ", second=" + second);
    }
}