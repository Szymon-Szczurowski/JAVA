class Tv{
    String producer;
    String model;
    int year;
    String matrixType;
    double price;

    public void printBasicData(){
        System.out.println(this.producer + " " + this.model + " " + this.year);
    }
}



public class Main {
    public static void main(String[] args) {


        Tv lg = new Tv();
        lg.producer = "LG";
        lg.model = "NCBI";
        lg.year = 2014;
        lg.matrixType = "LED";
        lg.price = 5000.0;
        lg.printBasicData();

        Tv samsung = new Tv();
        samsung.producer = "Samsung";
        samsung.model = "RAD";
        samsung.year = 2010;
        samsung.matrixType = "LCD";
        samsung.price = 1000.0;
        samsung.printBasicData();
    }
}


//public class Tv {
//    String manufacturer;
//    String model;
//    int year;
//    String uniqueId;
//    float numInches;
//    float weight;
//    String color;
//    String maxResolution; // 4k, 1080p
//
//    public void printBasicData() {
//        System.out.println(
//                this.manufacturer +
//                        " " + this.model +
//                        " " + this.year
//        );
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        /*
//            Stwórz klasę Tv opisującą telewizor wraz z zmiennymi jak:
//            producent, model, rok produkcji i dodatkowe, które będą
//            pasowały do tego produktu.
//            Dodaj jedną metodę printBasicData() prezentującą w konsoli te trzy
//            powyższe wartości przechowywane w instancji klasy.
//            Na koniec dodaj instancję do głównego programu i wartości do
//            podstawowych pól oraz wywołaj metodę printBasicData()
//        */
//
//        Tv tv1 = new Tv();
//        tv1.manufacturer = "Rubin";
//        tv1.model = "Kolorowy";
//        tv1.year = 1987;
//
//        tv1.printBasicData();
//    }
//}

