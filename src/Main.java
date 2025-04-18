
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {

			int age = scanner.nextInt();
			if (age > 18) {

				System.out.println("Geçebilirsiniz.");

			} else {

				throw new InvalidAgeException("Yaşı 18den küçükler giremez!");

			}

		} catch (Exception e) {

			System.out.println("Hata:" + e);

		}


	}

}
