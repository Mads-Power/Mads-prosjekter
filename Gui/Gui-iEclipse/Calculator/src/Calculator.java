
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

import static javax.swing.JOptionPane.*;

public class Calculator extends JFrame implements ActionListener{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Calculator(){
        setTitle("Kalkulator");
        // Hoved panelet
        JPanel mainW = new JPanel(new GridLayout(1, 5));
        mainW.setPreferredSize(new Dimension(50,50));
        //text panelet
        JPanel textpanel = new JPanel(new GridLayout(3, 2));
        textpanel.setFont(textpanel.getFont().deriveFont(Font.BOLD, 20f));


        
        //tekst felt
        JLabel label1 = new JLabel("Tall 1");
        JTextField txtNumber1 = new JTextField();
        
        JLabel label2 = new JLabel("Tall 2");
        JTextField txtNumber2 = new JTextField();
        
        JLabel labelRes = new JLabel("Resultat");
        JTextField resultat = new JTextField();

        
        textpanel.add(label1);
        textpanel.add(txtNumber1);
        textpanel.add(label2);
        textpanel.add(txtNumber2);
        textpanel.add(labelRes);
        textpanel.add(resultat);
        
        add(textpanel, BorderLayout.CENTER);

        

        
        
        
        //Multiply
        JButton btnMulti = new JButton("*");
        mainW.add(btnMulti);
        
        // add
        JButton btnAdd = new JButton("+");
        mainW.add(btnAdd);
        
        //subtraksjon
        JButton btnSub = new JButton("-");
        mainW.add(btnSub);
        
        //Devide
        JButton btnDevide = new JButton("%");
        mainW.add(btnDevide);
        
        // Avslutt
        JButton btnExit = new JButton("Avslutt");
        mainW.add(btnExit);
        
        //puts the buttons in the mainW
        add(mainW, BorderLayout.SOUTH);
        
        
        setVisible(true);
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
	
	public void actionPerformed (ActionEvent event){
		
	}
	
	public static void main(String[] args) {
		new Calculator();

	}

}
