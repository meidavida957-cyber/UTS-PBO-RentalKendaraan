package rentalkendaraan;

/**
 * Subclass kedua dari Kendaraan.
 */
public class Motor extends Kendaraan {

    private String tipeMotor;

    public Motor(
            String merk,
            String nomorPlat,
            double hargaPerHari,
            String tipeMotor) {

        super(merk, nomorPlat, hargaPerHari);

        this.tipeMotor = tipeMotor;
    }

    public String getTipeMotor() {
        return tipeMotor;
    }

    // METHOD OVERRIDING
    @Override
    public double hitungHargaSewa(int hari) {

        double total = hargaPerHari * hari;

        // IF ELSE
        if (hari >= 3) {

            total = total - (total * 0.05);

        } else {

            total = total;
        }

        return total;
    }

    @Override
    public String getJenis() {

        return "Motor";
    }

    @Override
    public void tampilkanInfo() {

        super.tampilkanInfo();

        System.out.println("Tipe Motor   : " + tipeMotor);
    }
}
