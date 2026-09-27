package rentalkendaraan;

/**
 * Superclass / abstract class untuk semua jenis kendaraan.
 */
public abstract class Kendaraan {

    protected String merk;
    protected String nomorPlat;
    protected double hargaPerHari;

    public Kendaraan(String merk, String nomorPlat, double hargaPerHari) {
        this.merk = merk;
        this.nomorPlat = nomorPlat;
        this.hargaPerHari = hargaPerHari;
    }

    public String getMerk() {
        return merk;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public double getHargaPerHari() {
        return hargaPerHari;
    }

    // Method abstract yang akan dioverride oleh subclass
    public abstract double hitungHargaSewa(int hari);

    // METHOD OVERLOADING
    public double hitungHargaSewa(int hari, double diskon) {

        double total = hargaPerHari * hari;

        return total - (total * diskon / 100);
    }

    public abstract String getJenis();

    public void tampilkanInfo() {

        System.out.println("Jenis        : " + getJenis());
        System.out.println("Merk         : " + merk);
        System.out.println("Nomor Plat   : " + nomorPlat);
        System.out.println("Harga/Hari   : " + Main.formatRupiah(hargaPerHari));
    }
}
