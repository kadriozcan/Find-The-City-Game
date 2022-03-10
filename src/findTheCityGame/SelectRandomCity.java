package findTheCityGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class SelectRandomCity {

	public SelectRandomCity() {

	}

	public String selectCity() throws IOException {
		
		
		BufferedReader cityReader = new BufferedReader
				(new FileReader("C:\\MyProjects\\javaProjects\\findTheCityGame\\cities.txt"));
		
		ArrayList<String> cityList = new ArrayList<String>();
		
		for (String word = cityReader.readLine(); word != null; word = cityReader.readLine()) {
			cityList.add(word);
		}
		cityReader.close();
		
		
		Random random = new Random();
		int r = random.nextInt(cityList.size());
		String selectedCity = cityList.get(r);
		return selectedCity;

	}

}
