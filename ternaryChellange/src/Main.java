public class Main {
    public static void main(String[] args) {

        int a = 2;

        String b = (a % 2 == 0) ? "parzysta" : "ieparzysta";

        System.out.println(b);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        /*
//            Użyj operator trójargumentowy aby sprawdzić
//            czy liczba jest parzysta lub nieparzysta.
//            Zastosuj operator modulo, który jesli zwróci 0
//            to wskarze parzystą liczbę.
//            Pokaż informację o wyniku w konsoli.
//         */
//
//        int number = 11;
//        String info = (number % 2 == 0) ? "parzysta": "nieparzysta";
//
//        System.out.println("Liczba " + number + " jest " + info);
//
//    }
//}
