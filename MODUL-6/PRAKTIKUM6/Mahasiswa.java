package PRAKTIKUM6;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String none; 

    public Mahasiswa(String nim, String nama, String none) {
        this.nim = nim;
        this.nama = nama;
        this.none = none;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNone() { 
        return none;
    }

    public void setNone(String none) { 
        this.none = none;
    }
}