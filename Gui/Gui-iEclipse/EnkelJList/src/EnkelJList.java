import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class EnkeljList extends JFrame implements ListSelectionListener, ActionListener {

	private static final long serialVersionUID = 1L;

	private JList<String> liste; //viser data
	private DefaultListModel<String> listedata; //Data
	private JButton btnAdd, btnRemove, btnEit; // knapper
	private int selectedIndex = -1; //indeks for valgt linje
	
	public EnkeljList(){
		super("JListDemo"); //kan bruke setTitle("")
		JPanel pnlButtons = new JPanel (new GridLayout(1, 3));
		
	}
	
	public void actionPerformed (ActionEvent e){
		
	}
	
	public static void main(String[] args) {
		
		new EnkeljList();
	}

}
