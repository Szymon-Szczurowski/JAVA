import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("BWM");
        arr.add("merc");
        arr.add(null);
        arr.add("pontiac");
        arr.add(null);

        arr.removeIf(a -> a == null || a.equalsIgnoreCase("merc"));

        System.out.println(arr);
    }
}
