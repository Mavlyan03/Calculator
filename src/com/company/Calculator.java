package com.company;

public class Calculator {

    public static boolean checkRange(String num) {
            if (Integer.parseInt(num) <= 100000 && Integer.parseInt(num) > 0) {
                return true;
            } else {
                return false;
            }
    }

    public static int calculate(String[] numbers) {
        int res = 0;
        try {
            switch (numbers[1]) {
                case "+":
                    res = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[2]);
                    break;
                case "-":
                    res = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[2]);
                    break;
                case "/":
                    res = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[2]);
                    break;
                case "*":
                    res = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[2]);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        return res;
    }
}