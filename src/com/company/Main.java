package com.company;

import java.util.Scanner;

class Main {
    public static boolean isNumeric(String num) {
        if (num == null)
            return false;
        try {
            int temp = Integer.parseInt(num);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws MyException {
        Scanner myObj = new Scanner(System.in);
        String inputString = myObj.nextLine();
        String[] numbers = inputString.split("\\s");
        try {
            if (!isNumeric(numbers[0]) && !isNumeric(numbers[2])) {
                String res = Roman.romanCalc(numbers);
                System.out.println(res);
            } else if (!Calculator.checkRange(numbers[0]) && !Calculator.checkRange(numbers[0])) {
               throw new MyException();
            } else {
                int res = Calculator.calculate(numbers);
                System.out.println(res);
            }
        } catch (MyException e) {
            e.size();
        }
    }
}
    
