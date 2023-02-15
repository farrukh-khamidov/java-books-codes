package liang.ch21.test21_7_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        List list = Collections.unmodifiableList(Arrays.asList("Chicago",
                "Boston"));
        list.remove("Dallas");
    }
}
