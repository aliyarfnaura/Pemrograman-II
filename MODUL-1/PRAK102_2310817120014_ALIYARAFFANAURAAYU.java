package PRAKTIKUM1;
import java.util.Scanner;
public class PRAK102_2310817120014_ALIYARAFFANAURAAYU {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka awal untuk memulai deret: ");
        int angka = input.nextInt();
        int count = 0;  
        while (count < 11) {

            if (angka % 5 == 0) {
                System.out.print((angka / 5) - 1);
            } else {
                System.out.print(angka);
            }
            
            if (count < 10) {
                System.out.print(", ");
            }

            angka++;
            count++;
        }
        
        System.out.println();
        
        input.close();
    }
}