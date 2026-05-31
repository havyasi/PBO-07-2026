package Tugasproject1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        int n = scanner.nextInt();
        scanner.close();

        long hasil = faktorial(n);
        System.out.println("Output : " + hasil);
    }

    public static long faktorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
}