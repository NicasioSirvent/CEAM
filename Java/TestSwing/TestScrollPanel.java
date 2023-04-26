package TestSwing;

import java.awt.Color;

import javax.swing.*;

public class TestScrollPanel extends JFrame {
  private JTextField textfield1;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;

  public TestScrollPanel() {
    setLayout(null);
    textfield1 = new JTextField();
    textfield1.setBounds(10, 10, 200, 30);
    add(textfield1);
    textarea1 = new JTextArea();
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(10, 50, 400, 300);
    scrollpane1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    add(scrollpane1);
  }

  public static void main(String args[]) {
    TestScrollPanel formulario1 = new TestScrollPanel();
    formulario1.setBounds(0, 0, 540, 400);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
  }
}