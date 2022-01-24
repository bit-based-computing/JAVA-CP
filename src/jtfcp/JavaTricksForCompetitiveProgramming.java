package jtfcp;

public class JavaTricksForCompetitiveProgramming {
    public static void main(String[] args) {
        int odd = 11;
        int even = 12;
        if((odd & 1) == 1) // odd number last bit always 1
            System.out.println(odd + " is an odd number");
        if((even & 1) == 0) // even number last bit always 0
            System.out.println(even + " is an even number");
    }
}
