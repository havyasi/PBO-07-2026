package Tugasproject1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        int target;
        try {
            target = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harus bilangan bulat.");
            scanner.close();
            return;
        }
        scanner.close();

        boolean ditemukan = false;
        cari:
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target) {
                    System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                    ditemukan = true;
                    break cari;
                }
            }
        }

        if (!ditemukan) {
            System.out.println("Angka tidak ditemukan");
        }
    }
}