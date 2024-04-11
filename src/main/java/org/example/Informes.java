package org.example;//package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Informes extends JFrame implements ActionListener {

    JPanel panelMain = new JPanel();
    JPanel panelNombres = new JPanel();
    JPanel panelBoton = new JPanel();
    String nombreVar="fulanito  ";
    JButton boton =new JButton("generar informe");

    public Informes(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(470,500);
        this.setTitle("Informes");
        this.setLocationRelativeTo(null);
        this.getContentPane().add(panelMain);
        this.setResizable(false);
        this.setVisible(true);


        panelMain.setLayout(new BorderLayout());



        panelMain.add(panelNombres,BorderLayout.CENTER);
        panelMain.add(panelBoton,BorderLayout.SOUTH);

        for (int i = 0; i < 4; i++) {
            panelNombres.add(new JPanel());
            panelNombres.add(new JLabel(nombreVar));
            panelNombres.add(new JTextField("                       "));
            panelNombres.add(new JCheckBox("lunes"));
            panelNombres.add(new JCheckBox("martes"));
            panelNombres.add(new JCheckBox("miercoles"));
        }




        panelBoton.add(boton);
        boton.addActionListener(this);


    }







    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Informes();
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //probar a meter el filerwriter
        JOptionPane.showMessageDialog(this,"generando informe");

    }
}
