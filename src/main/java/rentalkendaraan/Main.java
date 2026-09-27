package rentalkendaraan;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    private static final ArrayList<Kendaraan> daftarKendaraan
            = new ArrayList<>();

    public static void main(String[] args) {

        isiDataAwal();

        int pilihan;

        // LOOPING DO-WHILE
        do {

            tampilkanMenu();

            pilihan = bacaInt("Pilih menu: ");

            // CONDITION IF-ELSE
            if (pilihan == 1) {

                tampilkanDaftarKendaraan();

            } else if (pilihan == 2) {

                hitungHargaSewa();

            } else if (pilihan == 3) {

                tampilkanDiskon();

            } else if (pilihan == 4) {

                System.out.println(
                        "\nTerima kasih telah menggunakan "
                        + "Sistem Rental Kendaraan."
                );

            } else {

                System.out.println(
                        "\n[!] Pilihan tidak tersedia."
                );
            }

            if (pilihan != 4) {

                tekanEnter();
            }

        } while (pilihan != 4);
    }

    private static void isiDataAwal() {

        // POLYMORPHISM
        daftarKendaraan.add(
                new Mobil(
                        "Toyota Avanza",
                        "KT 1234 AB",
                        350000,
                        7
                )
        );

        daftarKendaraan.add(
                new Mobil(
                        "Honda Brio",
                        "KT 2468 CD",
                        300000,
                        5
                )
        );

        daftarKendaraan.add(
                new Motor(
                        "Honda Vario 160",
                        "KT 5678 EF",
                        100000,
                        "Matic"
                )
        );

        daftarKendaraan.add(
                new Motor(
                        "Yamaha NMAX",
                        "KT 9012 GH",
                        150000,
                        "Matic"
                )
        );
    }

    private static void tampilkanMenu() {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("          SISTEM RENTAL KENDARAAN");
        System.out.println("==============================================");
        System.out.println("1. Lihat Daftar Kendaraan");
        System.out.println("2. Hitung Harga Sewa");
        System.out.println("3. Lihat Ketentuan Diskon");
        System.out.println("4. Keluar");
        System.out.println("==============================================");
    }

    private static void tampilkanDaftarKendaraan() {

        System.out.println(
                "\n--------------- DAFTAR KENDARAAN ---------------"
        );

        // LOOPING FOR
        for (int i = 0; i < daftarKendaraan.size(); i++) {

            Kendaraan kendaraan = daftarKendaraan.get(i);

            System.out.println(
                    "\nKendaraan ke-" + (i + 1)
            );

            System.out.println(
                    "----------------------------------------------"
            );

            kendaraan.tampilkanInfo();
        }
    }

    private static void hitungHargaSewa() {

        tampilkanDaftarKendaraanRingkas();

        int nomor = bacaInt(
                "Pilih nomor kendaraan: "
        );

        if (nomor < 1
                || nomor > daftarKendaraan.size()) {

            System.out.println(
                    "[!] Nomor kendaraan tidak tersedia."
            );

            return;
        }

        int hari = bacaInt(
                "Masukkan lama sewa (hari): "
        );

        if (hari <= 0) {

            System.out.println(
                    "[!] Lama sewa harus lebih dari 0 hari."
            );

            return;
        }

        Kendaraan kendaraan =
                daftarKendaraan.get(nomor - 1);

        // POLYMORPHISM
        double total =
                kendaraan.hitungHargaSewa(hari);

        double hargaNormal =
                kendaraan.getHargaPerHari() * hari;

        double diskon =
                hargaNormal - total;

        System.out.println(
                "\n================ HASIL SEWA ================"
        );

        System.out.println(
                "Jenis Kendaraan : "
                + kendaraan.getJenis()
        );

        System.out.println(
                "Merk            : "
                + kendaraan.getMerk()
        );

        System.out.println(
                "Nomor Plat      : "
                + kendaraan.getNomorPlat()
        );

        System.out.println(
                "Lama Sewa       : "
                + hari + " hari"
        );

        System.out.println(
                "Harga Normal    : "
                + formatRupiah(hargaNormal)
        );

        System.out.println(
                "Potongan        : "
                + formatRupiah(diskon)
        );

        System.out.println(
                "TOTAL BAYAR     : "
                + formatRupiah(total)
        );

        System.out.println(
                "============================================"
        );
    }

    private static void tampilkanDaftarKendaraanRingkas() {

        System.out.println(
                "\n---------------- PILIH KENDARAAN ----------------"
        );

        int nomor = 1;

        // ENHANCED FOR
        for (Kendaraan kendaraan : daftarKendaraan) {

            System.out.println(
                    nomor
                    + ". "
                    + kendaraan.getJenis()
                    + " - "
                    + kendaraan.getMerk()
                    + " ("
                    + kendaraan.getNomorPlat()
                    + ")"
            );

            nomor++;
        }
    }

    private static void tampilkanDiskon() {

        System.out.println(
                "\n--------------- KETENTUAN DISKON ---------------"
        );

        System.out.println(
                "Mobil : sewa minimal 5 hari -> diskon 10%"
        );

        System.out.println(
                "Motor : sewa minimal 3 hari -> diskon 5%"
        );

        System.out.println(
                "Selain ketentuan tersebut -> tidak ada diskon"
        );
    }

    private static int bacaInt(String pesan) {

        while (true) {

            System.out.print(pesan);

            String nilai = input.nextLine();

            try {

                return Integer.parseInt(nilai);

            } catch (NumberFormatException e) {

                System.out.println(
                        "[!] Masukkan angka yang valid."
                );
            }
        }
    }

    private static void tekanEnter() {

        System.out.print(
                "\nTekan ENTER untuk kembali ke menu..."
        );

        input.nextLine();
    }

    public static String formatRupiah(double nilai) {

        NumberFormat format =
                NumberFormat.getCurrencyInstance(
                        new Locale("id", "ID")
                );

        return format.format(nilai)
                .replace(",00", "");
    }
}
