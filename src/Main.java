/* License

This project is licensed under the GNU General Public License v3.0.

Copyright (c) 2025 Enis Çetinkaya

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <https://www.gnu.org/licenses/>.
*/
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
