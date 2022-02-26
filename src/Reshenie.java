import java.util.Scanner;

public class Reshenie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение используя '/' для деления дроби и +, -, * или : , без пробелов и знака '=' ");
        String express = sc.next();
        // получить длину строки
        int length = express.length();
        int k = 1;
        int[] a = new int[3];
        a[0] = sign(express, '/', 1);
        a[2] = sign(express, '/', 2);
        int r;
        char l = '/';
        r = sign(express, '+', 0); // имем номер позиции знака + - * :
        if (r>0){
            a[1]=r;
            l = '+';
        } else{
            r = sign(express, '-', 0);
            if (r>0){
                a[1]=r;
                l = '-';
            }
            else{
                r = sign(express, ':', 0);
                if (r>0){
                    a[1]=r;
                    l = ':';
                }
                else{
                    r = sign(express, '*', 0);
                    if (r>0){
                        a[1]=r;
                        l = '*';
                    }
                }
            }
        }


        String ch1 = express.substring(0,a[0]-1);
        int ch11 = Integer.parseInt(ch1);

        String ch2 = express.substring(a[0],a[1]-1);
        int ch22 = Integer.parseInt(ch2);

        String ch3 = express.substring(a[1],a[2]-1);
        int ch33 = Integer.parseInt(ch3);

        String ch4 = express.substring(a[2]);
        int ch44 = Integer.parseInt(ch4);

        int numerator1 = ch11;
        int denominator1 = ch22;
        Fraction fraction1 = new Fraction(numerator1, denominator1);

        int numerator2 = ch33;
        int denominator2 = ch44;
        Fraction fraction2 = new Fraction(numerator2, denominator2);

        if (l== '-'){
            Fraction vich = Fraction.vich(fraction1,fraction2);
            System.out.println("вычитание:"+vich);
        }
        if (l == '+'){
            Fraction sum = Fraction.sum(fraction1,fraction2);
            System.out.println("сумма:"+sum);
        }
        if (l == '*'){
            Fraction umnog = Fraction.umnog(fraction1,fraction2);
            System.out.println("умножение:"+umnog);
        }
        if (l == ':'){
            Fraction delenie = Fraction.delenie(fraction1,fraction2);
            System.out.println("деление:"+delenie);
        }
    }




    public static int sign(String express, char t, int k) {
        // получить длину строки
        int length = express.length();
        char searchChar = t; //символ который мы ищем
        int k1 = k; // номер слеша
        boolean isFound = false;
        int j = 0; //для определения количесва повторений условия

        for (int i = 0; i < length; ++i) {
            if (express.charAt(i) == searchChar) {
                //isFound = true;
                j = j + 1;
                if (k1 > 0) { // когда = 0 ищем знак =1 первый слеш =2 второй слеш
                    if (k == 1) {
                        if (j == 1) {
                            return i+1; //узнаем номер позиции 1го слеша
                        }
                    }
                    else if (k == 2) {
                        if (j == 2) {
                            return i+1; // узнаем номер позиции 2го слеша
                        }
                    }
                }
                else {
                    return i+1;}
            }
        }
        return -1;
    }
}