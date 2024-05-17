import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while (true) {
            System.out.print("Masukkan nama ke-" + i + ": ");
            String input = scanner.nextLine();

            try {
                if (input.trim().isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong!");
                }

                if (input.equalsIgnoreCase("selesai")) {
                    break;
                }

                mahasiswa.add(input);
                i++;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();

        System.out.println("Daftar mahasiswa yang diinputkan:");
        for (String nama : mahasiswa) {
            System.out.println("- " + nama);
        }
    }
}