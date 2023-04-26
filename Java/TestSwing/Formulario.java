package TestSwing;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
  private JTextField textfield1, textfield2;
  private JLabel label1, label2, label3;
  private JButton boton1;

  public Formulario() {
    setLayout(null);
    label1 = new JLabel("Introduce nº 1:");
    label1.setBounds(50, 10, 100, 30);
    add(label1);
    label2 = new JLabel("Introduce nº 2:");
    label2.setBounds(50, 40, 100, 30);
    add(label2);
    label3 = new JLabel("Resultado:");
    label3.setBounds(160, 120, 100, 30);
    add(label3);
    textfield1 = new JTextField();
    textfield1.setBounds(160, 15, 100, 20);
    add(textfield1);
    textfield2 = new JTextField();
    textfield2.setBounds(160, 45, 100, 20);
    add(textfield2);
    boton1 = new JButton("Sumar");
    boton1.setBounds(160, 80, 100, 30);
    add(boton1);
    boton1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == boton1) {
      int valor1 = 0, valor2 = 0, resultado = 0;
      valor1 = Integer.parseInt(textfield1.getText());
      valor2 = Integer.parseInt(textfield2.getText());
      resultado = valor1 + valor2;
      label3.setText("Resultado: " + resultado);
    }
  }

  public static void main(String args[]) {
    TestTextArea formulario1 = new TestTextArea();
    formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    formulario1.setBounds(0, 0, 400, 300);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
  }
}