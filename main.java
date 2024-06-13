import java.util.Scanner;

public class main {
    static barangRental11[] daftarKendaraan = {
            new barangRental11("S 4567 YV", "Honda Beat", "Motor", 2017, 10000),
            new barangRental11("N 4511 VS", "Honda Vario", "Motor", 2018, 10000),
            new barangRental11("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000),
            new barangRental11("AB 4321 A", "Toyota Innove", "Mobil", 2019, 60000),new barangRental11("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 60000)
    };

    static transaksiRental11[] transaksiList = new transaksiRental11[10]; 

    static int nextTransaksiIndex = 0; // Indeks untuk menambahkan transaksi berikutnya

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Daftar kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanDaftarKendaraan();
                    break;
                case 2:
                    
                    break;
                case 3:
                   
                    break;
                case 4:
                  
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 5);
    }

    static void tampilkanDaftarKendaraan() {
        System.out.println("\n+++++ Daftar Kendaraan Rental Serba Sebi +++++");
        System.out.println("||" + " Nomor TNKB" + "  ||" + "Nama Kendaraan" +" ||" + "Jenis"+" ||" + "Tahun"+" ||" + "Biaya sewa per jam" );
        for (int i = 0; i < daftarKendaraan.length; i++) {
            System.out.println("||" + daftarKendaraan[i].noTNKB + "    || " + daftarKendaraan[i].namaKendaraan + "    || " + daftarKendaraan[i].jenisKendaraan + "    || " + daftarKendaraan[i].tahun + "    || " + daftarKendaraan[i].biayaSewa);
        }
    }

    

   
}





