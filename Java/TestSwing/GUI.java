package TestSwing;

import javax.swing.*;

public class GUI extends JFrame {
  private JLabel label1;

  public GUI() {
    setLayout(null);
    label1 = new JLabel("Esto es una prueba");
    label1.setBounds(20, 20, 200, 300);
    add(label1);
  }

  public static void main(String args[]) {
    TestImage formulario1 = new TestImage();
    formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    formulario1.setBounds(0, 0, 400, 300);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
  }
}