import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

import static javax.swing.JOptionPane.*;


public class ValutaKalkulator extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;


    public ValutaKalkulator(){
        setTitle("VALUTAKALKULATOR");
        //øverste vindu
        JPanel topW = new JPanel(new GridLayout(1, 4));
        //midt vindu med valuta knapper'
        JPanel middleW = new JPanel(new GridLayout(2, 2));
        middleW.setPreferredSize(new Dimension(30,30));
        //Rense knapper
        JPanel cleanW = new JPanel(new GridLayout(1, 4));
        cleanW.setPreferredSize(new Dimension(30,30));



        setVisible(true);
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //NOK og Other
        JLabel nok = new JLabel("NOK");
        JTextField nok1 = new  JTextField();
        JLabel other = new JLabel("Other");
        JTextField other1 = new  JTextField();

        topW.add(nok);
        topW.add(nok1);
        topW.add(other);
        topW.add(other1);


        add(topW, BorderLayout.NORTH);

        //Valuta knapper
        JButton btnGBP = new JButton("GBP");
        middleW.add(btnGBP);
        JButton btnEUR = new JButton("EUR");
        middleW.add(btnEUR);
        JButton btnUSD = new JButton("USD");
        middleW.add(btnUSD);
        JButton btnSEK = new JButton("SEK");
        middleW.add(btnSEK);

        add(middleW, BorderLayout.CENTER);

        //Rense og avslutt knapper
        JButton btnRnok = new JButton("Rens NOK");
        cleanW.add(btnRnok);
        JButton btnRother = new JButton("Rens Other");
        cleanW.add(btnRother);
        JButton btnRens = new JButton("Rens");
        cleanW.add(btnRens);
        JButton btnExit = new JButton("Avslutt");
        cleanW.add(btnExit);

        add(cleanW, BorderLayout.SOUTH);
    }

    public void actionPerformed (ActionEvent event){

    }
    public static void main(String[] args) {
        new ValutaKalkulator();

    }

}
