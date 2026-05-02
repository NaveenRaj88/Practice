package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(3);
        list.add(1);
        System.out.println(list.size());
        list.add(1,1);
        System.out.println(list);

        List<Integer> pascalRow = new ArrayList<>(Arrays.asList(new Integer[3]));
        System.out.println(pascalRow);
    }
}
