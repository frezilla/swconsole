package eu.frezilla.swconsole.swing;

import eu.frezilla.swconsole.gui.GUIConsole;

public final class SWGUIBuilder {
    
    public static GUIConsole build() {
        SWFrame swFrame = new SWFrame();
        SWTextPane swTextPane = new SWTextPane();
        swFrame.getFrame().getContentPane().add(swTextPane.getTextPane());
        return swFrame;
    }

}