package lista7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Zadanie4 extends JFrame implements ActionListener {
    public JTextField imie, nazwisko, pesel;
    public JButton add;
    private JLabel peselLabel, imieLabel, nazwiskoLabel;


    public Zadanie4(){
        setSize(350,250);
        setTitle("Zadanie4");
        setLayout(null);

        imie = new JTextField();
        imie.setBounds(100,40,200,30);
        imie.setFont(new Font("Times New Roman",Font.BOLD,11));
        imie.addActionListener(this);
        imie.setToolTipText("Podaj swoje imie");
        imie.setText("Podaj swoje imie");
        imie.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(imie.getText().equals("Podaj swoje imie")){
                    imie.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(imie.getText().length()==0){
                    imie.setText("Podaj swoje imie");
                }

            }
        });
        add(imie);


       nazwisko = new JTextField(16);
       nazwisko.setBounds(100,80,200,30);
       nazwisko.setFont(new Font("Times New Roman",Font.BOLD,11));
       nazwisko.addActionListener(this);
       nazwisko.setToolTipText("Podaj swoje nazwisko");
       nazwisko.setText("Podaj swoje nazwisko");
       nazwisko.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(nazwisko.getText().equals("Podaj swoje nazwisko")){
                   nazwisko.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(nazwisko.getText().length()==0){
                   nazwisko.setText("Podaj swoje nazwisko");
                }

            }
        });
        add(nazwisko);

        pesel = new JTextField(16);
        pesel.setBounds(100,120,200,30);
        pesel.setFont(new Font("Times New Roman",Font.BOLD,11));
        pesel.addActionListener(this);
        pesel.setToolTipText("PESEL musi posiadaæ 11 cyfr");
        pesel.setText("Wpisz PESEL");
        pesel.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(pesel.getText().equals("Wpisz PESEL")){
                    pesel.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(pesel.getText().length()==0){
                	
                    pesel.setText("Wpisz PESEL");
                }
            }
        });
        add(pesel);

        imieLabel = new JLabel("Imie: ");
        imieLabel.setBounds(30,40,150,20);
        add(imieLabel);

        nazwiskoLabel = new JLabel("Nazwisko: ");
        nazwiskoLabel.setBounds(30,80,150,20);
        add(nazwiskoLabel);

        peselLabel = new JLabel("PESEL: ");
        peselLabel.setBounds(30,120,150,20);
        add(peselLabel);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add = new JButton("Dodaj");
        add.setBounds(130,170,80,30);
        add.addActionListener(this);
        add(add);

    }

    public static void main(String[] args){
        Zadanie4 app = new Zadanie4();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String napis= imie.getText()+", "+nazwisko.getText()+", "+informacjePesel(pesel.getText());
        if(e.getSource()==add){

            JOptionPane.showMessageDialog(null, napis ,
                    "Informacje" , JOptionPane.INFORMATION_MESSAGE);
;
        }
    }

    static public String informacjePesel(String napis)
    {
        String dzielenie="1379", napiskoncowy="";
        int suma=0,l1,l2;
        int liczba[]=new int[10];
        for (int j = 0; j < 10; j++)
        {
            l1=napis.charAt(j)-48; 
            l2=dzielenie.charAt(j%4)-48;
            liczba[j]=l1*l2;
            if(liczba[j]>10)
            {
                liczba[j]=liczba[j]%10;
            }
            suma+=liczba[j];
        }
        suma=suma%10;
        suma=10-suma;
        if(napis.charAt(10)-48==suma)
        {
            int rok = Integer.parseInt((napis.substring(0, 2)));
            int miesiac = Integer.parseInt((napis.substring(2, 4)));
            int dzien = Integer.parseInt((napis.substring(4, 6)));
            int plec = (napis.charAt(9) - 48) % 2;
            if (80 < miesiac && miesiac < 93) {
                miesiac = miesiac - 80;
                rok = 1800 + rok;
            }
            if (0 < miesiac && miesiac < 13) {
                rok = 1900 + rok;
            }
            if (20 < miesiac && miesiac < 33) {
                miesiac = miesiac - 20;
                rok = 2000 + rok;
            }
            if (40 < miesiac && miesiac < 53) {
                miesiac = miesiac - 40;
                rok = 2100 + rok;
            }
            if (60 < miesiac && miesiac < 73) {
                miesiac = miesiac - 60;
                rok = 2200 + rok;
            }
            napiskoncowy = "Data urodzenia: "+rok + "." + miesiac + "." + dzien+". ";
            switch (plec) {
                case 0:
                    napiskoncowy+="Kobieta";
                    break;
                case 1:
                    napiskoncowy+="Mê¿czyzna";
                    break;
            }
        }
        else
        {
            napiskoncowy="Twój pesel nie zgadza siê z instrukcj¹";
        }
        return napiskoncowy;
    }
}

