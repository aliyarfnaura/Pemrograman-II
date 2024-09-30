package PRAKTIKUM1;
import java.util.Scanner;
public class PRAK104_2310817120014_ALIYARAFFANAURAAYU {
	public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Tangan Abu: ");
  String[] tanganAbu = input.nextLine().split(" ");

  System.out.print("Tangan Bagas: ");
  String[] tanganBagas = input.nextLine().split(" ");

  int skorAbu = 0;
  int skorBagas = 0;

  for (int i = 0; i < 3; i++) {
  String abu = tanganAbu[i];
  String bagas = tanganBagas[i];

  if (abu.equals(bagas)) {
 continue; 
  } else if (
 (abu.equals("B") && bagas.equals("G")) || 
 (abu.equals("G") && bagas.equals("K")) || 
 (abu.equals("K") && bagas.equals("B")) 
  ) {
 skorAbu++; 
  } else {
 skorBagas++; 
  }
  }

  if (skorAbu > skorBagas) {
  System.out.println("Abu");
  } else if (skorBagas > skorAbu) {
  System.out.println("Bagas");
  } else {
  System.out.println("Seri");
  }

  input.close();
  }
}