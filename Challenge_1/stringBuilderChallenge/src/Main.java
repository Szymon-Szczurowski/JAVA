import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String arr[] = {"Alice", "Bob", "Barbara", "Joanna"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            sb.append(" ");

        }
        System.out.println(sb.toString());

    }
}
