package liang.ch21.test21_2_10;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new ByLengthComparator());
        set.add("ABC");
        set.add("ABDD");
        set.add("AB");
        set.add("FF");
        set.add("FFF");
        System.out.println(set);
    }

    private static class ByLengthComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}
