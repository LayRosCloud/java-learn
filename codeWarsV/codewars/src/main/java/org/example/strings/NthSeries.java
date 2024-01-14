package org.example.strings;

public class NthSeries {

    public String seriesSum(int n) {
        double sum = 0;

        for (int count = 0, index = 1; count < n; count++, index += 3){
            sum += 1.0 / index;
        }

        return String.format("%.2f", sum);
    }
}
