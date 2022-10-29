public class Main {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Block start");
        }


        try {
            throw new TestException();
        }catch(TestException e)  {
            e.printStackTrace();
        }


        try {
            throw new TestException();
        } catch (TestException exception) {
            exception.printStackTrace();
        }



    }


}



        /*
	1. W Main dodaj strukturę try catch finally w której powstanie błąd w wyniku
	   dzielenia przez zero. Złap ArithmeticException i wywołaj na wyjątku printStackTrace()
	   W finally pokaż informację o wywołaniu tego bloku kodu w konsoli.
	2. Dodaj strukturę try catch i stwórz oraz wywołaj własny wyjątek TestException.
	   Stwórz klasę wyjątku w osobnym pliku. Wywołaj printStackTrace na wyjątku.
*/
