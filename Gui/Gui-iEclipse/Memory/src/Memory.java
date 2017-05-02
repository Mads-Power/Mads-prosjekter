import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.JOptionPane.*;

public class Memory extends JFrame implements ActionListener {

private static final long serialVersionUID = 1L;

public Memory(){
	setTitle("Memory");
    
    JPanel mainW = new JPanel(new GridLayout(6, 6));
    mainW.setPreferredSize(new Dimension(50,50));
    JPanel ControlBtn = new JPanel(new GridLayout(1,2));
    
    setVisible(true);
    setSize(800, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //20 buttons
    JButton btn1 = new JButton("");
    mainW.add(btn1);
    JButton btn2 = new JButton("");
    mainW.add(btn2);
    JButton btn3 = new JButton("");
    mainW.add(btn3);
    JButton btn4 = new JButton("");
    mainW.add(btn4);
    JButton btn5 = new JButton("");
    mainW.add(btn5);
    
    JButton btn6 = new JButton("");
    mainW.add(btn6);
    JButton btn7 = new JButton("");
    mainW.add(btn7);
    JButton btn8 = new JButton("");
    mainW.add(btn8);
    JButton btn9 = new JButton("");
    mainW.add(btn9);
    JButton btn10 = new JButton("");
    mainW.add(btn10);
    
    JButton btn11 = new JButton("");
    mainW.add(btn11);
    JButton btn12 = new JButton("");
    mainW.add(btn12);
    JButton btn13 = new JButton("");
    mainW.add(btn13);
    JButton btn14 = new JButton("");
    mainW.add(btn14);
    JButton btn15 = new JButton("");
    mainW.add(btn15);
    
    JButton btn16 = new JButton("");
    mainW.add(btn16);
    JButton btn17 = new JButton("");
    mainW.add(btn17);
    JButton btn18 = new JButton("");
    mainW.add(btn18);
    JButton btn19 = new JButton("");
    mainW.add(btn19);
    JButton btn20 = new JButton("");
    mainW.add(btn20);
    
    JButton btn21 = new JButton("");
    mainW.add(btn21);
    JButton btn22 = new JButton("");
    mainW.add(btn22);
    JButton btn23 = new JButton("");
    mainW.add(btn23);
    JButton btn24 = new JButton("");
    mainW.add(btn24);
    
    
    
    add(mainW, BorderLayout.CENTER);
    
    //control buttons
    JButton btnStart = new JButton("Start på nytt");
    ControlBtn.add(btnStart);
    JButton btnAvslutt = new JButton("Avslutt");
    ControlBtn.add(btnAvslutt);
    
    add(ControlBtn, BorderLayout.SOUTH);
    
}

public void actionPerformed (ActionEvent event){
		
	}
	
	public static void main(String[] args) {
		new Memory();
	}
	
	

}
