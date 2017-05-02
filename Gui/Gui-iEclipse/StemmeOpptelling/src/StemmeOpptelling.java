import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

import static javax.swing.JOptionPane.*;

public class StemmeOpptelling extends JFrame implements ActionListener {

		private static final long serialVersionUID = 1L;

		
		public StemmeOpptelling(){
			setTitle("StemmeOpptelling");
			//Hoved panel med Ja,Nei etc
			JPanel mainW = new JPanel(new GridLayout(1, 5));
			//Stemme Label JPanel
			JPanel textpanel = new JPanel(new GridLayout(2, 1));
			
			setVisible(true);
		    setSize(800, 200);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
		    //buttons 
		    JButton btnJa = new JButton("Ja");
		    mainW.add(btnJa);
		    JButton btnNei = new JButton("Nei");
		    mainW.add(btnNei);
		    JButton btnLagre = new JButton("Lagre");
		    mainW.add(btnLagre);
		    JButton btnHent = new JButton("Hent");
		    mainW.add(btnHent);
		    JButton btnAvslutt = new JButton("Avslutt");
		    mainW.add(btnAvslutt);
		    
		    add(mainW, BorderLayout.NORTH);
		    
		    //Stemme Label Skrift
		    JLabel labelJa = new JLabel("Ja-Stemmer");
	        JTextField txtJa = new JTextField();
	        
	        JLabel labelNei = new JLabel("Nei-Stemmer");
	        JTextField txtNei = new JTextField();
	        
	        textpanel.add(labelJa);
	        textpanel.add(txtJa);
	        textpanel.add(labelNei);
	        textpanel.add(txtNei);
	        
	        add(textpanel, BorderLayout.CENTER);

		}
public void actionPerformed (ActionEvent event){
		
	}

	public static void main(String[] args) {
		new StemmeOpptelling();

	}

}
