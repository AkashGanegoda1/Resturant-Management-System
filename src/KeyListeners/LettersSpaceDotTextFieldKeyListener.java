package KeyListeners;

import java.awt.event.*;

public class LettersSpaceDotTextFieldKeyListener extends KeyAdapter{
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();

        // Allow letters (both uppercase and lowercase), space, and dot
        if (!Character.isLetter(c) && c != ' ' && c != '.') {
            e.consume(); // Ignore the key event
        }
    }
}
