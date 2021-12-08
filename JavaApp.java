package ru.geekbrains.lesson1;

public class JavaApp {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 127;
        long d = 487L;
        float e = 32.4f;
        double f = 32.4;
        char g = '\u2242';
        boolean i = true;
 
        System.out.println(differenceNumbers(21,8));
        System.out.println(calculate(4.5f, 3.4f, 7.6f, 9.0f));
        isPositiveOrNegative(-7);
        System.out.println(isNegative(8));
        greetings("Антон");




    }

    public static int calculate(float a, float b, float c, float d) {
        return (int) (a * (b + (c / d)));
    }

    public static boolean differenceNumbers(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20){
            return true;
        }
        return false;
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        if(x >= 0) {
            return true;
        }
        return false;
    }

    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }

}
