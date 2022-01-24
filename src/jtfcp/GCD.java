package jtfcp;

import java.math.BigInteger;

public class GCD {
    public static long gcd(long a, long b){
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        return b1.gcd(b2).longValue();
    }
    public static void main(String[] args) {
        System.out.println(gcd(12,16));
    }
}
