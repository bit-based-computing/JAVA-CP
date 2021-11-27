package firstIO;

import java.util.Scanner;

public class ScannerExample {

    /*
    * easy, less typing, but not recommended very slow,
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(n+k);

    }
}
