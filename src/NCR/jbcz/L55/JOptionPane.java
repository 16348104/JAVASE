package NCR.jbcz.L55;


import javax.swing.*;

/**
 * Created by xdx on 2018/2/23.
 */
public class JOptionPane {
    public static void main(String[] args) {
        String name = javax.swing.JOptionPane.showInputDialog("What is your name?");
        String input = javax.swing.JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(input);
        System.out.println("Hello:=" + name + ".Next year, you'll be " + (age + 1) + ".");
        System.exit(0);

    }
}
