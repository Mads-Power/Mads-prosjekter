import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

import static javax.swing.JOptionPane.*;

public class Kalkulator extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	public Kalkulator(){
		setTitle("Kalkulator");
		//Sum vindu
		JPanel sumW = new JPanel(new GridLayout(1, 1));
        sumW.setPreferredSize(new Dimension(30,30));
        // tall + = tegn
        JPanel tallW = new JPanel(new GridLayout(4, 3));
        tallW.setPreferredSize(new Dimension(30,30));
        // Matematiske operatører
        JPanel mOperaW = new JPanel(new GridLayout(4, 1));
        mOperaW.setPreferredSize(new Dimension(80,80));

        

		
		setVisible(true);
	    setSize(500, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //Sum felt
	    JTextField sumfelt = new JTextField();
	    sumW.add(sumfelt);
	    
	    add(sumW, BorderLayout.NORTH);
	    
	    //tallfelt + = tegn
	    JButton btn0 = new JButton("0");
        tallW.add(btn0);
        JButton btn3 = new JButton("3");
        tallW.add(btn3);
        JButton btn6 = new JButton("6");
        tallW.add(btn6);
        JButton btn9 = new JButton("9");
        tallW.add(btn9);
        
        JButton btn1 = new JButton("1");
        tallW.add(btn1);
        JButton btn4 = new JButton("4");
        tallW.add(btn4);
        JButton btn7 = new JButton("7");
        tallW.add(btn7);
        JButton btnC = new JButton("C");
        tallW.add(btnC);
        
        JButton btn2 = new JButton("2");
        tallW.add(btn2);
        JButton btn5 = new JButton("5");
        tallW.add(btn5);
        JButton btn8 = new JButton("8");
        tallW.add(btn8);
        JButton btnLikTegn = new JButton("=");
        tallW.add(btnLikTegn);
        
         add(tallW, BorderLayout.CENTER);
	    
      // Matematiske operatører
         JButton btnPluss = new JButton("+");
         tallW.add(btnPluss);
         JButton btnMinus = new JButton("-");
         tallW.add(btnMinus);
         JButton btnGange = new JButton("*");
         tallW.add(btnGange);
         JButton btnDele = new JButton("/");
         tallW.add(btnDele);
         
         mOperaW.add(btnPluss);
         mOperaW.add(btnMinus);
         mOperaW.add(btnGange);
         mOperaW.add(btnDele);
         
         add(mOperaW, BorderLayout.EAST);

       }

public void actionPerformed (ActionEvent event){
		
	}
	
	public static void main(String[] args) {
		
		new Kalkulator();
	}

}
