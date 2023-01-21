package eu.frezilla.swconsole.swing;

import java.awt.Event;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultEditorKit;
import lombok.AccessLevel;
import lombok.Getter;

public final class SWTextPane {
    
    @Getter(AccessLevel.PACKAGE) private final JTextPane textPane;

    SWTextPane() {
        textPane = new JTextPane();
        textPane.setSize(320, 200);

        textPane
                .getInputMap()
                .put(
                        KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK), 
                        DefaultEditorKit.backwardAction);
    }
    
}
