package ToDoList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoListApp extends JFrame implements ActionListener {

  private JLabel tituloLabel, prioridadLabel, fechaLimiteLabel;
  private JComboBox<String> prioridadComboBox;
  private JTextField toDoTextField, fechaLimiteTextField;
  private JCheckBox completadoCheckBox;
  private JRadioButton personalRadioButton, trabajoRadioButton;
  private JTextArea notasTextArea;
  private JScrollPane notasScrollPane;
  private JButton addButton, clearButton;
  private JMenuBar menuBar;
  private JMenu archivoMenu, ayudaMenu;
  private JMenuItem nuevoMenuItem, guardarMenuItem, salirMenuItem, aboutMenuItem;
  private JPanel mainPanel, formPanel, buttonPanel;

  public ToDoListApp() {

    // creamos widgets
    tituloLabel = new JLabel("To-Do:");
    prioridadLabel = new JLabel("Prioridad:");
    fechaLimiteLabel = new JLabel("Fecha Limite:");
    String[] priorityOptions = { "Baja", "Media", "Alta" };
    prioridadComboBox = new JComboBox<String>(priorityOptions);
    toDoTextField = new JTextField(20);
    fechaLimiteTextField = new JTextField(10);
    completadoCheckBox = new JCheckBox("Completada");
    personalRadioButton = new JRadioButton("Personal");
    trabajoRadioButton = new JRadioButton("Trabajo");
    ButtonGroup categoriaGrupo = new ButtonGroup();
    categoriaGrupo.add(personalRadioButton);
    categoriaGrupo.add(trabajoRadioButton);
    notasTextArea = new JTextArea(10, 20);
    notasScrollPane = new JScrollPane(notasTextArea);
    addButton = new JButton("Añadir");
    clearButton = new JButton("Clear");
    menuBar = new JMenuBar();
    archivoMenu = new JMenu("Archivo");
    ayudaMenu = new JMenu("Ayuda");
    nuevoMenuItem = new JMenuItem("Nuevo");
    guardarMenuItem = new JMenuItem("Guardar");
    salirMenuItem = new JMenuItem("Salir");
    aboutMenuItem = new JMenuItem("About");

    mainPanel = new JPanel(new BorderLayout());
    formPanel = new JPanel(new GridLayout(0, 2));
    buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

    // añadimos w a panel principal
    formPanel.add(tituloLabel);
    formPanel.add(toDoTextField);
    formPanel.add(prioridadLabel);
    formPanel.add(prioridadComboBox);
    formPanel.add(fechaLimiteLabel);
    formPanel.add(fechaLimiteTextField);
    formPanel.add(completadoCheckBox);
    formPanel.add(new JLabel()); // vacio
    formPanel.add(new JLabel("Categoria:"));
    formPanel.add(personalRadioButton);
    formPanel.add(new JLabel()); // vacio
    formPanel.add(trabajoRadioButton);
    formPanel.add(new JLabel("Notas:"));
    formPanel.add(notasScrollPane);

    // añadimos widgets a panel de botones
    buttonPanel.add(addButton);
    buttonPanel.add(clearButton);

    // confeccionamos menu
    archivoMenu.add(nuevoMenuItem);
    archivoMenu.add(guardarMenuItem);
    archivoMenu.add(salirMenuItem);
    ayudaMenu.add(aboutMenuItem);
    menuBar.add(archivoMenu);
    menuBar.add(ayudaMenu);

    // añadimos sub-paneles al panel principal
    mainPanel.add(formPanel, BorderLayout.CENTER);
    mainPanel.add(buttonPanel, BorderLayout.SOUTH);

    // añadimos menu a jframe principal 
    setJMenuBar(menuBar);

    // añadimos panel principal a frame principal
    add(mainPanel);

    // listeners
    addButton.addActionListener(this);
    clearButton.addActionListener(this);
    nuevoMenuItem.addActionListener(this);
    guardarMenuItem.addActionListener(this);
    salirMenuItem.addActionListener(this);
    aboutMenuItem.addActionListener(this);

    //vivan las lambdas!
    completadoCheckBox.addChangeListener(event -> {
      if (completadoCheckBox.isSelected())
        completadoCheckBox.setText("Completado!!!");
      else 
        completadoCheckBox.setText("Completado");
      });

    prioridadComboBox.addItemListener(event -> {
      String seleccion = prioridadComboBox.getSelectedItem().toString();
      prioridadLabel.setText("Prioridad ->" + seleccion);
    });

    // set default values
    prioridadComboBox.setSelectedIndex(0);
    personalRadioButton.setSelected(true);
  }


  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == addButton) {
      JOptionPane.showMessageDialog(this, "Añado nuevo Item");
    } else if (e.getSource() == clearButton) {
      JOptionPane.showMessageDialog(this, "Limpio Formulario");
    } else if (e.getSource() == nuevoMenuItem) {
      JOptionPane.showMessageDialog(this, "Presento nuevo Formulario");
    } else if (e.getSource() == guardarMenuItem) {
      JOptionPane.showMessageDialog(this, "Guardo Formulario");
    } else if (e.getSource() == salirMenuItem) {
      System.exit(0);
    } else if (e.getSource() == aboutMenuItem) {
      JOptionPane.showMessageDialog(this, "To Do List App\nVersion 0.01\n(c) 2023");
    }
  }

  public static void main(String[] args) {
    ToDoListApp miApp = new ToDoListApp();
    miApp.setTitle("ToDo List App");
    miApp.setSize(600, 500);
    miApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    miApp.setVisible(true);
  }
}