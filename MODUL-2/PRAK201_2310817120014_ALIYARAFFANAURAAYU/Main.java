package PRAKTIKUM2;

public class Main {
    public static void main(String[] args) {
        buah apel = new buah("Apel", 0.4, 7000, 40);  
        buah mangga = new buah("Mangga", 0.2, 3500, 15); 
        buah alpukat = new buah("Alpukat", 0.25, 10000, 12); 

        apel.tampilkanInfo();   
        mangga.tampilkanInfo(); 
        alpukat.tampilkanInfo(); 
    }
}