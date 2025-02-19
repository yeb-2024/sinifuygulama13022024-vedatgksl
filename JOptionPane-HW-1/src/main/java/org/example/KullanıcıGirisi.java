package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KullanıcıGirisi implements ActionListener {
    JFrame frame;

    JTextField KullanıcıAdı;
    JTextField Şifre;

    JButton GirişButonu;

    public KullanıcıGirisi(){
        GirişButonu = new JButton("Giriş");
        GirişButonu.addActionListener(this);

        Şifre = new JTextField("Şİfre gir:");
        Şifre.setPreferredSize(new Dimension(200, 50));

        KullanıcıAdı = new JTextField("Kullanıcı adı gir: ");
        KullanıcıAdı.setPreferredSize(new Dimension(200, 50));

        frame = new JFrame("kullanıcı giriş uyg");
        frame.add(KullanıcıAdı);
        frame.add(Şifre);
        frame.add(GirişButonu);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.pack();   // ne varsa kendi ona göre boyut ayarlıyor
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
