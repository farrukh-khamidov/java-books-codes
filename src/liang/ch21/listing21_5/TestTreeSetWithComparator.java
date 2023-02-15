package liang.ch21.listing21_5;

import liang.ch13.listing13_1.GeometricObject;
import liang.ch13.listing13_2.Circle;
import liang.ch13.listing13_3.Rectangle;
import liang.ch20.listing20_5.GeometricObjectComparator;

import java.util.*;

public class TestTreeSetWithComparator {
    public static void main(String[] args) {
        // Create a tree set for geometric objects using a comparator
        Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
        set.add(new Rectangle(4, 5));
        set.add(new Circle(40));
        set.add(new Circle(40));
        set.add(new Rectangle(4, 1));

        // Display geometric objects in the tree set
        System.out.println("A sorted set of geometric objects");
        for (GeometricObject element : set)
            System.out.println("area = " + element.getArea());
    }
}
