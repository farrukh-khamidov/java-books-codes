package topics.enums.programiz.enumSet.noneOf;

import java.util.EnumSet;

class Main {

    // an enum type Size
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        // Creating an EnumSet using noneOf()
        EnumSet<Size> sizes = EnumSet.noneOf(Size.class);

        System.out.println("Empty EnumSet: " + sizes);

        sizes.add(Size.SMALL);

        System.out.println("EnumSet: " + sizes);
    }
}
