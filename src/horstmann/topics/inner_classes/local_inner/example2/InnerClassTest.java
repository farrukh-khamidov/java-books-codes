package horstmann.topics.inner_classes.local_inner.example2;

import javax.swing.*;

/**
 * 10 * This program demonstrates the use of inner classes.
 * 11 * @version 1.11 2017-12-14
 * 12 * @author Cay Horstmann
 * 13
 */
public class InnerClassTest {
    public static void main(String[] args) {
        var clock = new TalkingClock();
        clock.start(1000, true);

        // keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
