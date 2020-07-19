package com.example.analyticsdemo.Util;

import java.util.Random;

public class RandomUtil {
    public static int random(int upperBound) {
        return new Random().nextInt(upperBound) + 1;
    }
    public static int random(int upperBound, int lowerBound) {
        return new Random().nextInt(upperBound - lowerBound) + 1 + lowerBound;
    }
}
