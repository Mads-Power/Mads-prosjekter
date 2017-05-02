import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

import static javax.swing.JOptionPane.*;

public class HemmeligTall extends JFrame implements ActionListener {
private static final long serialVersionUID = 1L;

public HemmeligTall(){
	setTitle("Tipp det temmelig tall");
	//Øverstetall
	JPanel tallW = new JPanel(new GridLayout(1, 10));
    tallW.setPreferredSize(new Dimension(30,30));
    //Start på ny
    JPanel nyStartW = new JPanel(new GridLayout(1, 1));
    tallW.setPreferredSize(new Dimension(30,30));
    //Forklarings Tekst
    JPanel forklaringW = new JPanel(new GridLayout(1, 1));
    forklaringW.setPreferredSize(new Dimension(30,30));
    
    
    setVisible(true);
    setSize(500, 130);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //øverstetall
    JButton btn0 = new JButton("0");
    tallW.add(btn0);
    JButton btn1 = new JButton("1");
    tallW.add(btn1);
    JButton btn2 = new JButton("2");
    tallW.add(btn2);
    JButton btn3 = new JButton("3");
    tallW.add(btn3);
    JButton btn4 = new JButton("4");
    tallW.add(btn4);
    JButton btn5 = new JButton("5");
    tallW.add(btn5);
    JButton btn6 = new JButton("6");
    tallW.add(btn6);
    JButton btn7 = new JButton("7");
    tallW.add(btn7);
    JButton btn8 = new JButton("8");
    tallW.add(btn8);
    JButton btn9 = new JButton("9");
    tallW.add(btn9);
    
    add(tallW, BorderLayout.NORTH);
    
    //Ny Start Knapp
    JButton btnNyS = new JButton("Klikk her for å starte på ny");
    tallW.add(btnNyS);
    nyStartW.add(btnNyS);
    
    add(nyStartW, BorderLayout.CENTER);
    
    //forklaring på bunnen
    JLabel forklaring = new JLabel("Ikke søkt = hvit. Riktig = grønn. Feil = rød");
    forklaringW.add(forklaring);
    add(forklaringW, BorderLayout.SOUTH);   
    
}

public void actionPerformed (ActionEvent event){
		
	}

	public static void main(String[] args) {
		new HemmeligTall();

	}

}
