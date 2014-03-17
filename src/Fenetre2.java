import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

	 
public class Fenetre2 extends JFrame{
	
	  
	  
	  public Fenetre2(){                
	    this.setTitle("Risk");
	    this.setSize(700,700);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);               
	    
	    
	    this.setContentPane(new Panneau());
	    this.setVisible(true);
	  }     
	
  
  public static void main(String[] args){
  
	  Fenetre2 fen = new Fenetre2();  
	  Image icone = Toolkit.getDefaultToolkit().getImage("imagejeux.jpg");
	  fen.setIconImage(icone);
	  
	 
  }
}
