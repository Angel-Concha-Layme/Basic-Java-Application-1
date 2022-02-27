import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
  
    private JMenuBar mb;
    private JMenu menuOpciones,menuCalcular,menuAcercaDe,menuColorFondo;
    private JMenuItem itemCalculo,itemRojo,itemNegro,itemMorado,itemElCreador,itemSalir,itemNuevo;
    private JLabel lblLogo,lblBienvenido,lblTittle,lblNombre,lblAPaterno,lblAMaterno,
                   lblDepartamento,lblAntiguedad,lblResultado, lblFooter;
    private JTextField txtNombreTrabajador,txtAPaternoTrabajador,txtAMaternoTrabajador;
    private JComboBox cmbDepartamento,cmbAntiguedad;
    private JScrollPane scrollpane1; 
    private JTextArea txtArea1;
    String nombre="";

    public Principal() {
      setLayout(null);
      setTitle("Pantalla principal");
      getContentPane().setBackground(new Color(255,0,0));
      setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

      mb = new JMenuBar();
      mb.setBackground(new Color(255, 0, 0));
      setJMenuBar(mb);
    
      nombre = Bienvenida.nombre;


      menuOpciones = new JMenu("Opciones");
      menuOpciones.setBackground(new Color(255, 0, 0));
      menuOpciones.setFont(new Font("Andale Mono", 1, 14));
      menuOpciones.setForeground(new Color(255, 255, 255));
      mb.add(menuOpciones);

      menuCalcular = new JMenu("Calcular");
      menuCalcular.setBackground(new Color(255, 0, 0));
      menuCalcular.setFont(new Font("Andale Mono", 1, 14));
      menuCalcular.setForeground(new Color(255, 255, 255));
      mb.add(menuCalcular);

      menuAcercaDe = new JMenu("Acerca de");
      menuAcercaDe.setBackground(new Color(255, 0, 0));
      menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
      menuAcercaDe.setForeground(new Color(255, 255, 255));
      mb.add(menuAcercaDe);

      menuColorFondo = new JMenu("Color de fondo");
      menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
      menuColorFondo.setForeground(new Color(255, 0, 0));
      menuOpciones.add(menuColorFondo);

      itemCalculo = new JMenuItem("Vacaciones");
      itemCalculo.setFont(new Font("Andale Mono", 1, 14));
      itemCalculo.setForeground(new Color(255, 0, 0));
      menuCalcular.add(itemCalculo);
      itemCalculo.addActionListener(this);

      itemRojo = new JMenuItem("Rojo");
      itemRojo.setFont(new Font("Andale Mono", 1, 14));
      itemRojo.setForeground(new Color(255, 0, 0));
      menuColorFondo.add(itemRojo);
      itemRojo.addActionListener(this);

      itemNegro = new JMenuItem("Negro");
      itemNegro.setFont(new Font("Andale Mono", 1, 14));
      itemNegro.setForeground(new Color(255, 0, 0));
      menuColorFondo.add(itemNegro);
      itemNegro.addActionListener(this);

      itemMorado = new JMenuItem("Morado");
      itemMorado.setFont(new Font("Andale Mono", 1, 14));
      itemMorado.setForeground(new Color(255, 0, 0));
      menuColorFondo.add(itemMorado);
      itemMorado.addActionListener(this);

      itemNuevo = new JMenuItem("Nuevo");
      itemNuevo.setFont(new Font("Andale Mono", 1, 14));
      itemNuevo.setForeground(new Color(255, 0, 0));
      menuOpciones.add(itemNuevo);
      itemNuevo.addActionListener(this);

      itemElCreador = new JMenuItem("El creador");
      itemElCreador.setFont(new Font("Andale Mono", 1, 14));
      itemElCreador.setForeground(new Color(255, 0, 0));
      menuAcercaDe.add(itemElCreador);
      itemElCreador.addActionListener(this);

      itemSalir = new JMenuItem("Salir");
      itemSalir.setFont(new Font("Andale Mono", 1, 14));
      itemSalir.setForeground(new Color(255, 0, 0));
      menuOpciones.add(itemSalir);
      itemSalir.addActionListener(this);

      ImageIcon imagen = new ImageIcon("images/logo-coca.png");
      lblLogo = new JLabel(imagen);  
      lblLogo.setBounds(5,5,250,100);
      add(lblLogo);

      lblBienvenido = new JLabel("Bienvenido "+ nombre);  
      lblBienvenido.setBounds(280,30,300,50);
      lblBienvenido.setFont(new Font("Andale Mono", 1, 32));
      lblBienvenido.setForeground(new Color(255, 255, 255));
      add(lblBienvenido);

      lblTittle = new JLabel("Datos del trabajador para el calculo de vacaciones");
      lblTittle.setBounds(45,140,900,25);
      lblTittle.setFont(new Font("Andale Mono", 0, 24));
      lblTittle.setForeground(new Color(255, 255, 255));
      add(lblTittle);

      lblNombre = new JLabel("Nombre completo:");
      lblNombre.setBounds(25,188,180,25);
      lblNombre.setFont(new Font("Andale Mono", 1, 12));
      lblNombre.setForeground(new Color(255, 255, 255));
      add(lblNombre);

      txtNombreTrabajador = new JTextField();
      txtNombreTrabajador.setBounds(25,213,150,25);
      txtNombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
      txtNombreTrabajador.setForeground(new java.awt.Color(255, 0, 0));
      add(txtNombreTrabajador);

      lblAPaterno = new JLabel("Apellido Paterno:");
      lblAPaterno.setBounds(25,248,180,25);
      lblAPaterno.setFont(new Font("Andale Mono", 1, 12));
      lblAPaterno.setForeground(new Color(255, 255, 255));
      add(lblAPaterno);

      txtAPaternoTrabajador = new JTextField();
      txtAPaternoTrabajador.setBounds(25,273,150,25);
      txtAPaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
      txtAPaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
      add(txtAPaternoTrabajador);

      lblAMaterno = new JLabel("Apellido Materno:");
      lblAMaterno.setBounds(25,308,180,25);
      lblAMaterno.setFont(new Font("Andale Mono", 1, 12));
      lblAMaterno.setForeground(new Color(255, 255, 255));
      add(lblAMaterno);

      txtAMaternoTrabajador = new JTextField();
      txtAMaternoTrabajador.setBounds(25,334,150,25);
      txtAMaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
      txtAMaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
      add(txtAMaternoTrabajador);

      lblDepartamento = new JLabel("Selecciona el Departamento:");
      lblDepartamento.setBounds(220,188,180,25);
      lblDepartamento.setFont(new Font("Andale Mono", 1, 12));
      lblDepartamento.setForeground(new Color(255, 255, 255));
      add(lblDepartamento);

      cmbDepartamento = new JComboBox();
      cmbDepartamento.setBounds(220,213,220,25);
      cmbDepartamento.setBackground(new java.awt.Color(224, 224, 224));
      cmbDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
      cmbDepartamento.setForeground(new java.awt.Color(255, 0, 0));
      add(cmbDepartamento);
      cmbDepartamento.addItem("");
      cmbDepartamento.addItem("Atencion al Cliente");
      cmbDepartamento.addItem("Departamento de Logistica");
      cmbDepartamento.addItem("Departamento de Gerencia");

      lblAntiguedad = new JLabel("Selecciona la Antiguedad:");
      lblAntiguedad.setBounds(220,248,180,25);
      lblAntiguedad.setFont(new Font("Andale Mono", 1, 12));
      lblAntiguedad.setForeground(new Color(255, 255, 255));
      add(lblAntiguedad);

      cmbAntiguedad = new JComboBox();
      cmbAntiguedad.setBounds(220,273,220,25);
      cmbAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
      cmbAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
      cmbAntiguedad.setForeground(new java.awt.Color(255, 0, 0));
      add(cmbAntiguedad);
      cmbAntiguedad.addItem("");
      cmbAntiguedad.addItem("1 año de servicio");
      cmbAntiguedad.addItem("2 a 6 años de servicio");
      cmbAntiguedad.addItem("7 años o mas de servicio");

      lblResultado  = new JLabel("Resultado del Calculo:");
      lblResultado. setBounds(220,307,180,25);
      lblResultado. setFont(new Font("Andale Mono", 1, 12));
      lblResultado. setForeground(new Color(255, 255, 255));
      add(lblResultado);

      txtArea1 = new JTextArea();
      txtArea1.setEditable(false);
      txtArea1.setBackground(new Color(224, 224, 224));
      txtArea1.setFont(new Font("Andale Mono", 1, 12));
      txtArea1.setForeground(new Color(0, 0, 0));
      txtArea1.setText("\n   Aqui aparece el resultado del calculo de las vacaciones.");
      scrollpane1 = new JScrollPane(txtArea1);
      scrollpane1.setBounds(220,330,385,90);
      add(scrollpane1); 

      lblFooter = new JLabel("@2017 The Coca-Cola Company | Todos los derechos reservados");
      lblFooter.setBounds(135,445,500,30);
      lblFooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
      lblFooter.setForeground(new java.awt.Color(255, 255, 255));
      add(lblFooter);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == itemCalculo){
            String nombreTrabajador = txtNombreTrabajador.getText();
            String aPaternoTrabajador = txtAPaternoTrabajador.getText();
            String aMaternoTrabajador = txtAMaternoTrabajador.getText();
            String departamento = cmbDepartamento.getSelectedItem().toString();
            String antiguedad = cmbAntiguedad.getSelectedItem().toString();

            if(nombreTrabajador.equals("")|| aPaternoTrabajador.equals("") || aMaternoTrabajador.equals("") || departamento.equals("") || antiguedad.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos por llenar.");

            }else{
                if(departamento.equals("Atencion al Cliente")){
                    if(antiguedad.equals("1 año de servicio")){
                        txtArea1.setText("\n   El trabajador "+nombreTrabajador+" "+aPaternoTrabajador+" "+aMaternoTrabajador+"\n   tiene una antiguedad de "+antiguedad+"\n   y pertenece al departamento de "+
                        departamento+"\n   por lo tanto tiene unas vacaciones de: 6 dias.");
                    }
                    if(antiguedad.equals("2 a 6 años de servicio")){
                        txtArea1.setText("\n   El trabajador "+nombreTrabajador+" "+aPaternoTrabajador+" "+aMaternoTrabajador+"\n   tiene una antiguedad de "+antiguedad+"\n   y pertenece al departamento de "+
                        departamento+"\n   por lo tanto tiene unas vacaciones de: 14 dias.");
                    }
                    if(antiguedad.equals("7 años o mas de servicio")){
                        txtArea1.setText("\n   El trabajador "+nombreTrabajador+" "+aPaternoTrabajador+" "+aMaternoTrabajador+"\n   tiene una antiguedad de "+antiguedad+"\n   y pertenece al departamento de "+
                        departamento+"\n   por lo tanto tiene unas vacaciones de: 20 dias.");
                    }   
                }
                if(departamento.equals("Departamento de Logistica")){
                    if(antiguedad.equals("1 año de servicio")){
                        txtArea1.setText("\n   El trabajador "+nombreTrabajador+" "+aPaternoTrabajador+" "+aMaternoTrabajador+"\n   tiene una antiguedad de "+antiguedad+"\n   y pertenece al departamento de "+
                        departamento+"\n   por lo tanto tiene unas vacaciones de: 7 dias.");
                    }
                    if(antiguedad.equals("2 a 6 años de servicio")){
                        txtArea1.setText("\n   El trabajador "+nombreTrabajador+" "+aPaternoTrabajador+" "+aMaternoTrabajador+"\n   tiene una antiguedad de "+antiguedad+"\n   y pertenece al departamento de "+
                        departamento+"\n   por lo tanto tiene unas vacaciones de: 15 dias.");
                    }
                    if(antiguedad.equals("7 años o mas de servicio")){
                        txtArea1.setText("\n   El trabajador "+nombreTrabajador+" "+aPaternoTrabajador+" "+aMaternoTrabajador+"\n   tiene una antiguedad de "+antiguedad+"\n   y pertenece al departamento de "+
                        departamento+"\n   por lo tanto tiene unas vacaciones de: 22 dias.");
                    }   
                }
                if(departamento.equals("Departamento de Gerencia ")){
                    if(antiguedad.equals("1 año de servicio")){
                        txtArea1.setText("\n   El trabajador "+nombreTrabajador+" "+aPaternoTrabajador+" "+aMaternoTrabajador+"\n   tiene una antiguedad de "+antiguedad+"\n   y pertenece al departamento de "+
                        departamento+"\n   por lo tanto tiene unas vacaciones de: 10 dias.");
                    }
                    if(antiguedad.equals("2 a 6 años de servicio")){
                        txtArea1.setText("\n   El trabajador "+nombreTrabajador+" "+aPaternoTrabajador+" "+aMaternoTrabajador+"\n   tiene una antiguedad de "+antiguedad+"\n   y pertenece al departamento de "+
                        departamento+"\n   por lo tanto tiene unas vacaciones de: 20 dias.");
                    }
                    if(antiguedad.equals("7 años o mas de servicio")){
                        txtArea1.setText("\n   El trabajador "+nombreTrabajador+" "+aPaternoTrabajador+" "+aMaternoTrabajador+"\n   tiene una antiguedad de "+antiguedad+"\n   y pertenece al departamento de "+
                        departamento+"\n   por lo tanto tiene unas vacaciones de: 30 dias.");
                    }   
                }
            }
        }
        if (e.getSource() == itemRojo){
            Container contentPane = getContentPane();
            contentPane.setBackground(new Color(255, 0, 0));
            mb.setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == itemNegro){
            Container contentPane = getContentPane();
            contentPane.setBackground(new Color(0, 0, 0));
            mb.setBackground(new Color(0, 0, 0));
        }
	    if (e.getSource() == itemMorado){
            Container contentPane = getContentPane();
            contentPane.setBackground(new Color(128, 0, 128));
            mb.setBackground(new Color(128, 0, 128));
        }
        if (e.getSource() == itemNuevo){	
            txtNombreTrabajador.setText("");
            txtAMaternoTrabajador.setText("");
            txtAPaternoTrabajador.setText("");
            cmbAntiguedad.setSelectedIndex(0);
            cmbDepartamento.setSelectedIndex(0);
            txtArea1.setText("\n   Aqui aparece el resultado del calculo de las vacaciones.");
        }
	    if (e.getSource() == itemSalir){
            Bienvenida ventana = new Bienvenida();
            ventana.setBounds(0,0,350,450);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(false);
	    }
        if (e.getSource() == itemElCreador){
            JOptionPane.showMessageDialog(null, "Elaborado por Angel zzzz");
        }
    }

    public static void main(String args[]) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}