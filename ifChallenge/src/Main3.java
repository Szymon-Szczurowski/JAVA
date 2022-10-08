public class Main3 {
    public static void main(String[] args) {

        boolean raining = true;
        boolean haveUmbrella = true;
        int temperature = 4;

        if (temperature > 40 || temperature < -20){
            System.out.println("Pozostań w domu");
        }else if(temperature > -10 && temperature < 10 && (raining && haveUmbrella) == true){
            System.out.println("Możesz wyjść, bo masz parasol");
        }else if(raining == false && temperature > 12){
            System.out.println("Możesz wyjść");
        }else{
            System.out.println("Musisz zostać w domu");
        }

    }
}
