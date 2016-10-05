package pl.jrola.trainings.item30;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JrQ- on 2016-10-05.
 */
public enum Operation {

    PLUS("+") {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },

    MINUS("-") {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },

    TIMES("*") {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },

    DIVIDE("/") {
        @Override
        public double apply(double a, double b) {
            return a / b;
        }
    };

    private String symbol;

    private Operation(String symbol) {
        this.symbol = symbol;
    }

    private static final Map<String, Operation> stringToEnum = new HashMap<
            String, Operation>();

    public abstract double apply(double a, double b);
}