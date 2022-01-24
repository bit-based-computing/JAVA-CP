package jtfcp;

public class NumberOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int numberOfDigits =(int) Math.floor(Math.log10(number)) + 1;
        System.out.println(numberOfDigits);
    }
}
