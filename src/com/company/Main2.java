package com.company;

public class Main2 {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;
        boolean result;
        result = a < b; // истина
        result = a > b; // ложь
        result = a <= 4; // меньше или равно - истина
        result = b >= 6; // больше или рано - ложь
        result = a == b; // равно - ложь
        result = a != b; // неравно - истина
        result = a > b || a < b; // логическое ИЛИ - истина
        result = 3 < a && a < 6; // логическое И - истина
        result = !result; // логическое НЕ - ложь
    }
}
