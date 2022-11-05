import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        for (int i = 0; i < 30; i++) {
            int random = (int) Math.floor(Math.random() * 101);
            numbers.add(random);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n");

        Iterator<Integer> iteratorBack = numbers.descendingIterator();
        while(iteratorBack.hasNext()) {
            System.out.println(iteratorBack.next());
        }
    }
}


        /*
        1. Stwórz TreeSet typu Integer o nazwie numbers. Dodaj pętle for z 30 iteracjami
           i dodaj losową liczbę do TreeSet z zakresu od 0 do 100.
        2. Wyświetl w konsoli cały TreeSet
         */