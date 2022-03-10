package findTheCityGame;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		SelectRandomCity selectRandomCity = new SelectRandomCity();

		System.out.println("Sehir tahmin etme oyununa hos geldin!");
		System.out.println("Rastgele bir sehir secildi.");

		String selectedCity = selectRandomCity.selectCity();

		List<Character> cityChars = new ArrayList<Character>();
		for (char ch : selectedCity.toCharArray()) {
			cityChars.add(ch);
		}

		List<String> hintList = new ArrayList<String>();
		for (int i = 0; i < selectedCity.length(); i++) {
			hintList.add("_");
		}
		System.out.println(hintList.toString());
		
		int k =0;
		
		Scanner scanner = new Scanner(System.in);
		while (hintList.contains("_")) {
			k++;
			if(k>4) {
				System.out.println("Haklariniz bitti. Cevap: ");
				System.out.println(selectedCity.toUpperCase());
				return;
			}
			System.out.println("Bir harf giriniz:");

			String inputChar = scanner.nextLine();
			
			
			

			for (int i = 0; i < selectedCity.length(); i++) {
				if (cityChars.get(i).toString().equals(inputChar)) {
					hintList.set(i, inputChar);
				}

			}
			

			
			if(selectedCity.equals(inputChar)) {
				System.out.println(cityChars.toString());
				System.out.println(k + " kere deneyerek buldunuz. Tebrikler!");
				scanner.close();
				return;
			} else {
				System.out.println(hintList.toString());
				
			}
			

		}
		scanner.close();
		//System.out.println(k + " kere deneyerek buldunuz. Tebrikler!");


	}

}
