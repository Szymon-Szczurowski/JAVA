public class Main {
    public static void main(String[] args) {

        int number[] = {0,1,2,3,4,5};

        int sum = 0;
        for (int add : number){
            sum += add;
            System.out.println(sum);
        }
    }
}


//public class Main {
//    public static void main(String[] args) {
//        /*
//            Zapisz tablicę liczb całkowitych od 0 do 5 w zmiennej numbers.
//            Użyj pętli for each aby przejść po całej tablicy
//            i dodaj do siebie wszytkie elementy.
//            Sumę elementów zaprezentuj po pętli w konsoli.
//         */
//
//        int numbers[] = { 0, 1, 2, 3, 4, 5 };
//
//        int sum = 0;
//        for (int i : numbers) {
//            sum += i;
//        }
//
//        System.out.println("Suma liczb w tablicy to: " + sum);
//    }
//}
