package horstmann.ch5.ch_5_6_enumeration_classes.listing5_2;

import java.util.*;

/**
 * This program demonstrates enumerated types.
 *
 * @author Cay Horstmann
 * @version 1.0 2004-05-24
 */
public class EnumTest {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");

        String input = in.next().toUpperCase();

        Size size = Enum.valueOf(Size.class, input);

        System.out.println("size=" + size);

        System.out.println("abbreviation=" + size.getAbbreviation());

        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job-- you paid attention to the _.");
    }
}
