package horstmann.topics.inner_classes.local_inner.example2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

class TalkingClock {
    public void start(int interval, boolean beep) {

        class TimePrinter implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                System.out.println("At the tone, the time is "
                        + Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }

        }
        var listener = new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
        System.out.println("Ending start");
    }
}
