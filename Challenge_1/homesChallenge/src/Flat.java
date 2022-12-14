public class Flat {
    private String city, street;

    public Flat() {
    }

    public Flat(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

    /*
  1. Stwórz klasę Flat z zmiennymi typu String o nazwie city i street. Dodaj do niej pusty
     konstruktor oraz kolejny przyjmujący city, street  i ustawiający te wartości w instancji.
     Dodaj automatycznie gettery i settery oraz toString() z menu Alt + insert.
  2. Napisz klasę House rozszerzającą klasę Flat posiadającą pole float parcelSize.
     Dodaj konstruktor przyjmujący city, street i parcelSize. Pamiętaj aby wywołał nadrzędny
	 konstruktor Flat do ustawienia city i street. Tak samo dodaj gettery, settery i toString.
  3. Dodaj klasę Residence rozszerzającą House i dodatkowo przyjmującą zmienną float garageSize.
     Jej konstruktor przyjmie: city, street, parcelSize i garageSize, wywołaj nadrzędny konstruktor.
	 Podobnie jak z Flat i House dodaj gettery, settery i toString z menu Alt + Insert.
  4. W klasie Main stwórz tablicę homes typu Flat z 10-cioma elementami;
  5. Stwórz pętlę for, która przejdzie po tablicy homes i wylosuje liczbę od 0 do 2. Jeśli wyjdzie
     0 to do tablicy o aktualnym indeksie dodana będzie nowa instancja Flat. Jeśli 1 to dodana
     będzie instancja House, 2 to Residence, dane moga być dowolne dla konstruktorów.
  6. Dodaj kolejną pętle for która ponownie przejdzie po homes, ale tym razem dzięki instanceof
     sprawdzi jakiego typu aktualny element jest w tablicy. Jeśli jest to Residence to zrób konwersje na
	 tą klasę i pokaż w konsoli wartość garageSize z gettera i rezultat toString(). Jeśli to
     House po konwersji pokaż wartość parcelSize z gettera i toString.
	 Na koniec pokaż toString z Flat. Sprawdzając kolejne warianty użyj if else if...
*/