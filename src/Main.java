import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String masukannama;
        String Kelamin;
        String tanggalLahir;

        Scanner objInput = new Scanner(System.in);
        System.out.print("Masukkan nama anda: ");
        masukannama = objInput.nextLine();

        System.out.print("Masukkan jenis kelamin anda (L/P): ");
        Kelamin = objInput.nextLine();
        if (Kelamin.equalsIgnoreCase("L")) {
            Kelamin = "Laki-Laki";
        } else if (Kelamin.equalsIgnoreCase("P")) {
            Kelamin = "Perempuan";
        }

        System.out.print("Masukkan tanggal lahir anda (yyyy-MM-dd): ");
        tanggalLahir = objInput.nextLine();

        LocalDate birthdate = LocalDate.parse(tanggalLahir, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthdate, currentDate);

        System.out.println("Nama anda: " + masukannama);
        System.out.println("Jenis kelamin: " + Kelamin);
        System.out.println("Tanggal lahir: " + birthdate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Umur: " + age.getYears() + " tahun, " + age.getMonths() + " bulan, ");
    }
}
