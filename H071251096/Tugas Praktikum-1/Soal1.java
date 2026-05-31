package Tugasproject1;

import java.util.Scanner;

public class Soal1 {

    public static String ubahKeKapital(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] kata = input.split(" ");
        StringBuilder hasil = new StringBuilder();

        for (String k : kata) {
            if (k.isEmpty()) {
                continue;
            }
            String hurufPertama = k.substring(0, 1).toUpperCase();
            String sisaKata = k.substring(1).toLowerCase();
            hasil.append(hurufPertama).append(sisaKata).append(" ");
        }

        return hasil.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Judul Film :\n> ");
        String input = scanner.nextLine();

        String output = ubahKeKapital(input);
        System.out.println(output);

        scanner.close();
    }
}
