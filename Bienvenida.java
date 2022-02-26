import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener{
    private JLabel lbl1, lbl2, lbl3, lbl4;
    private JTextField txt1;
    private JButton btn1;

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
        lbl2.setBounds(25,180,300,40);
        lbl2.setFont(new Font("Arial",Font.BOLD,20));
        add(lbl2);

        lbl3 = new JLabel("Ingrese su nombre");
        lbl3.setBounds(25,220,300,20);
        lbl3.setFont(new Font("Arial",Font.BOLD,15));
        add(lbl3);

        txt1 = new JTextField();
        txt1.setBounds(25,250,300,30);
        add(txt1);

        btn1 = new JButton("Ingresar");
        btn1.setBounds(25,300,300,30);
        btn1.addActionListener(this);
        add(btn1);

        lbl4 = new JLabel("@2017 The Coca Cola Company");
        lbl4.setBounds(25,350,300,20);
        lbl4.setFont(new Font("Arial",Font.BOLD,15));
        add(lbl4);

    }
    
    public void actionPerformed(ActionEvent e){    
    }
    public static void main(String args[]){
        Bienvenida ventana = new Bienvenida();
        ventana.setBounds(0,0,350,400);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}