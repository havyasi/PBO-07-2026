package Tugasproject1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("-");
        if (parts.length != 3) {
            System.out.println("Format salah. Gunakan dd-mm-yy");
            return;
        }

        String dayStr = parts[0];
        String monthStr = parts[1];
        String yearStr = parts[2];

        int day = Integer.parseInt(dayStr);
        int month = Integer.parseInt(monthStr);
        int year = Integer.parseInt(yearStr);

        // Konversi tahun 2 digit ke 4 digit: asumsi 00-49 => 2000-2049, 50-99 => 1950-1999
        if (year >= 0 && year <= 49) {
            year += 2000;
        } else if (year >= 50 && year <= 99) {
            year += 1900;
        }

        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        if (month < 1 || month > 12) {
            System.out.println("Bulan tidak valid");
            return;
        }

        System.out.println(day + " " + namaBulan[month-1] + " " + year);
    }
}
