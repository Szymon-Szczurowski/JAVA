public class Main {
    public static void main(String[] args) {
//        Stwórz zmienną text z trzykrotnie powtórzonym łańcuchem
//        znaków "Ola ma kota".
//                Zamień wszystkie wystąpienia "Ola" na "Kasia".
//                Dodatkowo zamień pierwsze wystąpienie "Kasia" na "Monika".
//                Końcowy tekst zaprezentuj w konsoli.
//        Znajdź indeks pierwszego wystąpienia "Kasia" i podaj go w konsoli.
//                Znajdź ostatni indeks "Kasia" i również wypisz go w konsoli.
//        Wyświetl fragment tekstu od pierwszego wystapienia "Kasia" do końca łańcucha.
//         */

        String text = "Ola ma kota. ";
        text = text.repeat(3);

        text = text.replaceAll("Ola", "Kasia");
        text = text.replaceFirst("Kasia", "Monika");
        System.out.println(text);

        int index = text.indexOf("Kasia");
        System.out.println(index);


        int indexLast = text.lastIndexOf("Kasia");
        System.out.println(indexLast);


        String fragment = text.substring(index);
        System.out.println(fragment);
    }
}


//    String text = "Ola ma kota. ".repeat(3);
//        text = text.replaceAll("Ola", "Kasia");
//                text = text.replaceFirst("Kasia", "Monika");
//                System.out.println(text);
//
//                int firstElIndex = text.indexOf("Kasia");
//                int lastElIndex = text.lastIndexOf("Kasia");
//                System.out.println("Pierwsze wystąpienie Kasia: " + firstElIndex);
//                System.out.println("Ostatnie wystąpienie Kasia: " + lastElIndex);
//
//                System.out.println(text.substring(firstElIndex));