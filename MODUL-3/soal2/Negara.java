package soal2;
import java.util.HashMap;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private Integer tanggalKemerdekaan; 
    private Integer bulanKemerdekaan;   
    private Integer tahunKemerdekaan;  

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = null;
        this.bulanKemerdekaan = null;
        this.tahunKemerdekaan = null;
    }

    public String getDetail(HashMap<Integer, String> daftarBulan) {
        StringBuilder detail = new StringBuilder();
        detail.append("Negara ").append(nama).append(" mempunyai ");

        if (jenisKepemimpinan.equalsIgnoreCase("presiden")) {
            detail.append("Presiden ");
        } else if (jenisKepemimpinan.equalsIgnoreCase("perdana menteri")) {
            detail.append("Perdana Menteri ");
        } else if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            detail.append("Raja ");
        }

        detail.append("bernama ").append(namaPemimpin).append("\n");

        if (tanggalKemerdekaan != null && bulanKemerdekaan != null && tahunKemerdekaan != null) {
            detail.append("Deklarasi Kemerdekaan pada Tanggal ")
                    .append(tanggalKemerdekaan).append(" ")
                    .append(daftarBulan.get(bulanKemerdekaan)).append(" ")
                    .append(tahunKemerdekaan).append("\n");
        }

        return detail.toString();
    }
}