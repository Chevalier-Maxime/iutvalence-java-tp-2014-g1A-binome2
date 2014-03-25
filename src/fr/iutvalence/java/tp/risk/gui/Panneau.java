package fr.iutvalence.java.tp.risk.gui;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
	
	 
  public void paintComponent(Graphics g){
    try {
      Image img = ImageIO.read(new File("bonne image risk.png"));
      //g.drawImage(img, 0, 0, this);
     
      
      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    } catch (IOException e) {
      e.printStackTrace();
    }                
  }               
          
  
  
  public static void main(String[] args){
	  Fenetre2 fen = new Fenetre2();  
	  
	  Image icone = Toolkit.getDefaultToolkit().getImage("imagejeux.jpg");
	  fen.setIconImage(icone);
	  
	
  }
}
