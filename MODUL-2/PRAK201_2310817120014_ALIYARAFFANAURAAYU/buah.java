package PRAKTIKUM2;

public class buah {
    private String nama;
    private double beratPerUnit; 
    private double hargaPerUnit; 
    private double jumlahBeli; 

    public buah(String nama, double beratPerUnit, double hargaPerUnit, double jumlahBeli) {
        this.nama = nama;
        this.beratPerUnit = beratPerUnit;
        this.hargaPerUnit = hargaPerUnit;
        this.jumlahBeli = jumlahBeli;
    }

    public double hitungHargaSebelumDiskon() {
        return (jumlahBeli / beratPerUnit) * hargaPerUnit;
    }

    public double hitungTotalDiskon() {
        if (nama.equals("Apel")) {
            return 5600.00;
        } else if (nama.equals("Mangga")) {
            return 840.00;
        } else if (nama.equals("Alpukat")) {
            return 2400.00;
        } else {
            return 0.00; 
        }
    }

    public double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungTotalDiskon();
    }

    public void tampilkanInfo() {
        System.out.printf("Nama Buah: %s%n", nama);
        System.out.printf("Berat: %.2f %n", beratPerUnit);
        System.out.printf("Harga: Rp%.2f%n", hargaPerUnit);
        System.out.printf("Jumlah Beli: %.2f kg%n", jumlahBeli);
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", hitungHargaSebelumDiskon());
        System.out.printf("Total Diskon: Rp%.2f%n", hitungTotalDiskon());
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", hitungHargaSetelahDiskon());
        System.out.println();
    }
}