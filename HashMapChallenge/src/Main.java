import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Animal> map = new HashMap<>();

        String names[] = {"Kot", "Pies", "Koza", "Puma"};

        for(int i = 0; i < names.length; i++) {
            map.put(names[i], new Animal(names[i]));
            map.put(names[i], new Animal(names[i]));
            map.put(names[i], new Animal(names[i]));
            map.put(names[i], new Animal(names[i]));

        }

        System.out.println(map.get("Puma\n"));


        for(Map.Entry<String, Animal> entry : map.entrySet()){
            String key = entry.getKey();
            Animal animal =  entry.getValue();
            System.out.println(key + " - " + animal);
        }

    }
}

        /*
            1. Stwórz klasę Animal z polem name, konstruktorem oraz metodą toString()
            2. Dodaj HashMap z kluczem String oraz klasą Animal o nazwie map.
            3. Stwórz tablicę typu String z nazwą names i wartościami: Kot, Pies, Koza, Puma.
            4. W pętli for przejdź po tablicy names i dodaj do map instancje Animal
               z przekazaną nazwą zwierzęcia.
            5. Wyświetl w konsoli wynik z map dla klucza "Puma".
            6. Dodaj pętlę for each w która przechodzi po map i pobiera klucze oraz
               wartości i następnie wyświetla je w konsoli.
         */