import java.util.*;

public class CollectionConversion {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "C++"};
        // Array to List
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add("JavaScript");

        // List to Array
        String[] newArr = list.toArray(new String[0]);
        System.out.println("New Array Length: " + newArr.length);
    }
}