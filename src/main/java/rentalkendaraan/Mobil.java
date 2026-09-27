package rentalkendaraan;

/**
 * Subclass pertama dari Kendaraan.
 */
public class Mobil extends Kendaraan {

    private int jumlahKursi;

    public Mobil(
            String merk,
            String nomorPlat,
            double hargaPerHari,
            int jumlahKursi) {

        super(merk, nomorPlat, hargaPerHari);

        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    // METHOD OVERRIDING
    @Override
    public double hitungHargaSewa(int hari) {

        double total = hargaPerHari * hari;

        // IF ELSE
        if (hari >= 5) {

            total = total - (total * 0.10);

        } else {

            total = total;
        }

        return total;
    }

    @Override
    public String getJenis() {

        return "Mobil";
    }

    @Override
    public void tampilkanInfo() {

        super.tampilkanInfo();

        System.out.println("Jumlah Kursi : " + jumlahKursi);
    }
}
