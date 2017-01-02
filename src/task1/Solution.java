package task1;

import javax.swing.*;

public class Solution {
    public static void main(String[] args) {

        String[] options = new String[] {"Yes", "No", "Maybe", "Cancel"};
        int response = JOptionPane.showOptionDialog(null, "A simple message dialog", "Dummy dialog Window",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);

    }
}
