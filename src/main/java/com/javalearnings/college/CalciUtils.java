package com.javalearnings.college;

public final class CalciUtils {
    private CalciUtils() {

    }
    public static Float findAverage(Integer totalValue, Integer noOfInputs) {
        return (float) (totalValue / noOfInputs);
    }
}
