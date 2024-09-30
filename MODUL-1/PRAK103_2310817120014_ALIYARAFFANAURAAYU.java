package PRAKTIKUM1;
import java.util.Scanner;
public class PRAK103_2310817120014_ALIYARAFFANAURAAYU {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan (N): ");
        int N = input.nextInt();
        System.out.print("Masukkan bilangan awal: ");
        int angka = input.nextInt();

        int count = 0;  
        do {
            if (angka % 2 != 0) {
                System.out.print(angka);

                if (count < N - 1) {
                    System.out.print(", ");
                }
                count++;  
            }

            angka++;  
        } while (count < N);
        
        System.out.println();
        
        input.close();
    }
}
