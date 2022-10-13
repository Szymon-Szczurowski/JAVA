public class Main {
    public static void main(String[] args) {
        String arr[] = {"Szymon", "Mikołaj", "Mateusz", "Kacper"};

        String result = String.join(" ", arr[0], arr[1], arr[2], arr[3]);
        System.out.println(result);


        String str = "";

        for (String s : arr){
            str = str.concat(s);
            str += " ";

        }
        System.out.println(str);

    }
}
