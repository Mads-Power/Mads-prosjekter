import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.JOptionPane.*;

public class JTextFieldExample extends JFrame implements ActionListener {

	JTextField txtName;
	JTextField txtAlder;
	
	public JTextFieldExample(){
		super("JTextField demo");
		JPanel pnlCenter = new JPanel(new GridLayout(2, 2));
		
		pnlCenter.add(new JLabel("Navn"));
		txtName = new JTextField();
		pnlCenter.add(txtName);
		pnlCenter.add(new JLabel("Alder"));
		txtAlder = new JTextField();
		pnlCenter.add(txtAlder);
		
		add(pnlCenter, BorderLayout.CENTER);
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(this);
		add(btnOk,BorderLayout.SOUTH);
		
		setSize(400, 110);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public void actionPerformed(ActionEvent event){
			String name = txtName.getText();
			String strAlder = txtAlder.getText();
			
			int alder = Integer.parseInt(strAlder);
			
			if(alder >= 18){
				showMessageDialog(this,"Du er Myndig!");
		
		}else{
			showMessageDialog(this, "Du er ikke myndig!");
		}
		
		
		
	}
	public static void main(String[] args) {
		new JTextFieldExample();
		
	}

}
