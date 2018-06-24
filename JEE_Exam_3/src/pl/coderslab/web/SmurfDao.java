package pl.coderslab.web;

import java.util.ArrayList;
import java.util.List;

public class SmurfDao {
	
	//Stwórz klasę SmurfDao - a w niej metodę o sygnaturze List <Smurf> getList()- metoda ma tworzyć 
	// 5 obiektów klasy Smurf, które następnie doda do ArrayListy. Metoda ma zwrócić listę obiektów.
	
	public static List<Smurf> getList() {
	List<Smurf> smurfs = new ArrayList<>(); // Stworzenie sparametryzowanej listy - klasy Smurf
	for (int i = 0; i < 5; i++) {		   // Tworzenie elementów listy
		String name = "Smerf-" + (i + 1);
		String attribute = "Atrybut-" + (i + 1);
		String description = "Description-" + (i + 1);

		Smurf smurf = new Smurf(name, attribute, description); // Stworzenie listy
		smurfs.add(smurf);	// Dodanie elementów do listy
	}
//	Lub poprostu:
//	List <Smurf> smurfs = new ArrayList <>();
//	smurfs.add(new Smurf ("Ważniak", "Zarozumiałość", "Mądrala nr 1"));
//	smurfs.add(new Smurf ("Papa", "Mądrość", "Przywódca wioski"));
//	smurfs.add(new Smurf ("Fajtłapa", "Niezdarność", "Chodzące nieszczęście"));
//	smurfs.add(new Smurf ("Śpioch", "Narkolepsja", "Wiecznie zaspany"));
//	smurfs.add(new Smurf ("Smerfetka", "Urok", "Jedyna kobieta w wiosce"));
	
	return smurfs;
		}
}
