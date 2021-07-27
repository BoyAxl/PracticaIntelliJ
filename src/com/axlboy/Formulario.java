package com.axlboy;
import javax.swing.*;

public class Formulario extends JFrame{
    private JPanel Main;
    private JButton button1;

    public Formulario(String title){
        super(title);
        this.setContentPane(Main);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
}
