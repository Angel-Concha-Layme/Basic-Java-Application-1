import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;


public class Licencia extends JFrame implements ChangeListener, ActionListener{
    private JLabel lbl1,lbl2;
    private JCheckBox chb1;
    private JButton btn1,btn2;
    private JTextArea txtarea;
    private JScrollPane scroll;

    public Licencia(){
        setLayout(null);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("Images/icon.png")).getImage());

        lbl1= new JLabel("TERMINOS Y CONDICIONES");
        lbl1.setBounds(215,5,200,30); 
        lbl1.setForeground(new Color(0,0,0));
        lbl1.setFont(new Font("Andale Mno",Font.BOLD,14));
        add(lbl1);

        ImageIcon img = new ImageIcon(getClass().getResource("Images/coca-cola.png"));
        lbl2 = new JLabel(img);
        lbl2.setBounds(315,135,300,300);
        add(lbl2);

        txtarea = new JTextArea();
        txtarea.setEditable(false);
        txtarea.setFont(new Font("Andale Mono",0,9));
        txtarea.setText("\n\n          TERMINOS Y CONDICIONES" +
        "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE LA GEEKIPEDIA DE ERNESTO." +
        "\n            B.  PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." +
        "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
        "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
        "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
        "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
        "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
        "\n\n          PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
        "\n          http://www.mispelotas.com");
        scroll = new JScrollPane(txtarea);
        scroll.setBounds(10,40,575,200);
        add(scroll);

        chb1 = new JCheckBox("Acepto los terminos y condiciones");
        chb1.setBounds(10,250,300,30);
        chb1.addChangeListener(this);
        add(chb1);

        btn1 = new JButton("Continuar");
        btn1.setBounds(10,290,100,30);
        btn1.setEnabled(false);
        btn1.addActionListener(this);
        add(btn1);

        btn2 = new JButton("No Acepto");
        btn2.setBounds(120,290,100,30);
        btn2.setEnabled(true);
        btn2.addActionListener(this);
        add(btn2);
    }

    public void stateChanged(ChangeEvent e){
        if(chb1.isSelected()){
            btn1.setEnabled(true);
            btn2.setEnabled(false);
        }else{
            btn1.setEnabled(false);
            btn2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String args[]){
        Licencia ventana = new Licencia();
        ventana.setBounds(0,0,610,380);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 