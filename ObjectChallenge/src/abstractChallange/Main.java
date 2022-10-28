package abstractChallange;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Jan", "Kowalski", "JAVA");
        System.out.println(programmer.toString());

    }
}


        /*
	1. Stwórz klasę abstrakcyjną Employee posiadającą:
		a) pola protected String name i surname
		b) konsktruktor oraz gettery i settery dla powyższych pól
		c) publiczna abstrakcyjną metodę toString zwracającą łańcuch znaków
	2. Stwórz klasę Programmer rozszerzającą abstrakcyjną klase Employee:
		a) dodaj do tej klasy pole String protected o nazwie languages
		b) dodaj getter i setter
		c) na koniec stwórz metodę toString, która prezentowała by dane z Employee i Programmer

        */

