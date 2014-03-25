package fr.iutvalence.java.tp.risk.gui;
/* TODO Package. */

import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Toolkit;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Fenetre2 extends JFrame {

    /** TODO. */
    public Fenetre2() {
        this.setTitle("Risk");
        this.setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        this.setContentPane(new Panneau());
        this.setVisible(true);
    }

    /** TODO. */
    public static void main(String[] args) {

        Fenetre2 fen = new Fenetre2();
        Image icone = Toolkit.getDefaultToolkit().getImage("imagejeux.jpg");
        fen.setIconImage(icone);
    }
}
