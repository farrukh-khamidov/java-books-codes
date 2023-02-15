package liang.ch21.test21_2_6;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("ABC");
        set.add("ABD");
        System.out.println(set);
    }
}
