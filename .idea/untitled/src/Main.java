import java.util.Scanner;

class LoginSystem {
    // Data admin
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome to library login system!");
        // Meminta user memilih tipe login
        System.out.println("Pilih tipe pengguna:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Keluar");
        System.out.print("Pilihan Anda: ");
        int userType = scanner.nextInt();
        scanner.nextLine(); // Membuang newline character

        //fungsi pertama
        if (userType == 1) {
            // Login sebagai admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (loginAdmin(username, password)) {
                System.out.println("Login berhasil sebagai admin!");
            } else {
                System.out.println("Login gagal. Username atau password salah.");
            }
            //fungsi kedua
        } else if (userType == 2) {
            // Login sebagai mahasiswa
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            if (loginMahasiswa(nim)) {
                System.out.println("Login berhasil sebagai mahasiswa!");
            } else {
                System.out.println("Login gagal. NIM tidak valid.");
            }
        } else if (userType == 3) {
            System.out.println("Terimakasih telah menggunakan jasa ini");
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    // Fungsi untuk login sebagai admin
    private static boolean loginAdmin(String username, String password) {
        return username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD);
    }

    // Fungsi untuk login sebagai mahasiswa
    private static boolean loginMahasiswa(String nim) {
        return nim.length() == 15; // Memastikan panjang NIM 15 karakter
    }
}
