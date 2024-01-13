package org.example.numbers;

public class Square {
    public boolean isSquare(int n) {
        double sqrt = Math.sqrt(n);
        return Math.round(sqrt) == sqrt;
    }
}
