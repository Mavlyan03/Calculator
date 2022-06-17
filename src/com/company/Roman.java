package com.company;

import java.util.HashMap;
import java.util.Map;

public class Roman {
    public static String romanCalc(String[] num) throws MyException {
        Map<String, String> romanNumbersMap = new HashMap<>();
        romanNumbersMap.put("I", "1");
        romanNumbersMap.put("II", "2");
        romanNumbersMap.put("III", "3");
        romanNumbersMap.put("IV", "4");
        romanNumbersMap.put("V", "5");
        romanNumbersMap.put("VI", "6");
        romanNumbersMap.put("VII", "7");
        romanNumbersMap.put("VIII", "8");
        romanNumbersMap.put("IX", "9");
        romanNumbersMap.put("X", "10");
        num[0] = romanNumbersMap.get(num[0]);
        num[2] = romanNumbersMap.get(num[2]);
        if (num[0] != null && num[2] != null){
            int result = Calculator.calculate(num);
            return getRomanNum(result);
        }else{
            throw new MyException();
        }

    }
    public static String getRomanNum(int num) {
        String res = "";

        while (num > 0) {
            while (num >= 1000) {
                res = res + "M";
                num -= 1000;
            }
            while (num >= 900) {
                res = res + "CM";
                num -= 900;
            }
            while (num >= 500) {
                res = res + "D";
                num -= 500;
            }
            while (num >= 400) {
                res = res + "CD";
                num -= 400;
            }
            while (num >= 100) {
                res = res + "C";
                num -= 100;
            }
            while (num >= 90) {
                res = res + "XC";
                num -= 90;
            }
            while (num >= 50) {
                res = res + "L";
                num -= 50;
            }
            while (num >= 40) {
                res = res + "XL";
                num -= 40;
            }
            while (num >= 10) {
                res = res + "X";
                num -= 10;
            }
            while (num >= 9) {
                res = res + "IX";
                num -= 9;
            }
            while (num >= 5) {
                res = res + "V";
                num -= 5;
            }
            while (num >= 4) {
                res = res + "IV";
                num -= 4;
            }
            while (num >= 1) {
                res = res + "I";
                num -= 1;
            }

        }
        return res;
    }


}
