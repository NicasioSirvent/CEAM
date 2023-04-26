package TestSwing;
import javax.swing.*;

public class TestImage extends JFrame {
  private JLabel label1;

  public TestImage() {
    setLayout(null);

    ImageIcon logo = new ImageIcon("/home/n/Imágenes/20000_mobilis_in_mobili.jpg");
    label1= new JLabel(logo);
    label1.setBounds(0,0,600,300);
    add(label1);
  }

  public static void main(String args[]) {
    TestImage formulario1 = new TestImage();
    formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    formulario1.setBounds(0, 0, 600, 300);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
  }
}