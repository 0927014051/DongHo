/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class DigitsDocument extends PlainDocument {

    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (str == null) {
            return;
        }
        char[] add = str.toCharArray();
        char c;
        for (int i = add.length; i > 0; i--) {
            c = add[i - 1];
            if (Character.isDigit(c) || c == '.') {
                super.insertString(offs, new String(new Character(c).toString()), a);
            }
        }

    }
}
