import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener{
    private JLabel lbl1, lbl2, lbl3, lbl4;
    private JTextField txt1;
    private JButton btn1;
    public static String nombre="";	

    public Bienvenida(){
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0)); //Color de fondo de la ventana principal
        setIconImage(new ImageIcon(getClass().getResource("Images/icon.png")).getImage());
        ImageIcon img = new ImageIcon(getClass().getResource("Images/logo-coca.png"));
        lbl1 = new JLabel(img);
        lbl1.setBounds(25,15,300,150); //(x,y,ancho,alto)
        add(lbl1);

        lbl2 = new JLabel("Sistema de control vacacional");
        lbl2.setBounds(25,130,300,40);
        lbl2.setForeground(new Color(255,255,255));
        lbl2.setFont(new Font("Arial",Font.BOLD,20));
        add(lbl2);

        lbl3 = new JLabel("Ingrese su nombre");
        lbl3.setBounds(45,230,250,20);
        lbl3.setForeground(new Color(255,255,255));
        lbl3.setFont(new Font("Arial",Font.BOLD,15));
        add(lbl3);

        txt1 = new JTextField();
        txt1.setBounds(45,255,250,25);
        txt1.setFont(new Font("Arial",Font.BOLD,15));
        txt1.setForeground(new Color(255,0,0));
        add(txt1);

        btn1 = new JButton("Ingresar"); 
        btn1.setBounds(125,300,100,30);
        btn1.setForeground(new Color(255,0,0));
        btn1.addActionListener(this);
        add(btn1);

        lbl4 = new JLabel("@2017 The Coca Cola Company");
        lbl4.setBounds(85,375,300,30);
        lbl4.setForeground(new Color(255,255,255));
        lbl4.setFont(new Font("Andale Mono",1,12));
        add(lbl4);

    }
    
    public void actionPerformed(ActionEvent e){    
        if (e.getSource() == btn1){
            nombre = txt1.getText().trim(); 
            if (nombre.equals("")){
                JOptionPane.showMessageDialog(null,"Ingrese su nombre");
            }else{
                Licencia ventana = new Licencia();
                ventana.setBounds(0,0,610,380);
                ventana.setVisible(true);
                ventana.setResizable(false);
                ventana.setLocationRelativeTo(null);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setVisible(false);
            }  
        }
    }
    public static void main(String args[]){
        Bienvenida ventana = new Bienvenida();
        ventana.setBounds(0,0,350,450);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}