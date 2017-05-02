
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Note extends JFrame implements ActionListener{

    /**
     *
     */
    private static final long serialVersionUID = 4398950631175004392L;

    public Note(){
        setTitle("Huskelapp");
        JTextArea jTL = new JTextArea();
        add(jTL,BorderLayout.CENTER);
        jTL.setFont(jTL.getFont().deriveFont(Font.BOLD, 20f));
        JPanel pnlSouth = new JPanel(new GridLayout(1, 3));
        pnlSouth.setPreferredSize(new Dimension(200,200) );

        JButton btnSave = new JButton("Lagre");
        pnlSouth.add(btnSave);
        JButton btnLoad = new JButton("Hent");
        pnlSouth.add(btnLoad);
        JButton btnExit = new JButton("Avslutt");
        pnlSouth.add(btnExit);

        btnLoad.addActionListener(this);
        btnSave.addActionListener(this);
        btnExit.addActionListener(this);

        btnLoad.setFont(btnLoad.getFont().deriveFont(Font.BOLD, 20f));
        btnSave.setFont(btnSave.getFont().deriveFont(Font.BOLD, 20f));
        btnExit.setFont(btnExit.getFont().deriveFont(Font.BOLD, 20f));


        add(pnlSouth,BorderLayout.SOUTH);

        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed (ActionEvent event){

        psvm
        String text = event.getActionCommand();

        switch(text){
            case "Hent" : System.out.println("Henter fra fil...");
                break;
            case"Lagre": System.out.println("Lagrer til fil");
                break;
            case "Avslutt": System.out.println("Exit Program");
                System.exit(0);
                break;
            default: System.out.println("Noe gikk galt...");
        }
        public class Main {


            public static void main(String[] args) {

                new Note();
            }

        }

    }
}
