package eu.frezilla.swconsole.swing;

import javax.swing.JFrame;
import lombok.AccessLevel;
import lombok.Getter;
import eu.frezilla.swconsole.gui.GUIConsole;

public final class SWFrame implements GUIConsole {
    
    @Getter(AccessLevel.PACKAGE) private JFrame frame;
    
    SWFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void display() {
        frame.pack();
        frame.setVisible(true);
    }
    
}
