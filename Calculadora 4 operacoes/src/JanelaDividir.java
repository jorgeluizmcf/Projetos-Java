import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaDividir extends JDialog {

    JTextField jtfNum1, jtfNum2;
    JButton btnDividir, btnSair;
    JLabel l1, l2, l3, esp1;


    public JanelaDividir(Frame owner, String title) {
        super(owner, title);
        getContentPane().setBackground(Color.WHITE);
        setSize(250,200);

        l1 = new JLabel("Primeiro Numero: ");
        l2 = new JLabel("Segundo Numero: ");
        l3 = new JLabel("Divisão: ");
        esp1 = new JLabel(" ");
        esp1.setPreferredSize(new Dimension(75,20));
        jtfNum1 = new JTextField(10);
        jtfNum2 = new JTextField(10);
        btnDividir = new JButton("Dividir");
        btnSair = new JButton("Sair");

        FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
        getContentPane().setLayout(flow);
        getContentPane().add(l1);
        getContentPane().add(jtfNum1);
        getContentPane().add(l2);
        getContentPane().add(jtfNum2);
        getContentPane().add(btnDividir);
        getContentPane().add(btnSair);
        getContentPane().add(esp1);
        getContentPane().add(l3);

        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sair();
            }
        });

        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String num1 = jtfNum1.getText();
                    num1 = num1.replace(',','.');
                    if (num1.equals("")){
                        throw new Exception("Campo Primeiro Numero está Vazio");
                    }
                    String num2 = jtfNum2.getText().replace(',','.');
                    if (num2.equals("")){
                        throw new Exception("Campo Segundo Numero está Vazio");
                    }

                    double n1 = Double.parseDouble(num1);
                    double n2 = Double.parseDouble(num2);

                    if (n2==0){
                        throw new Exception("Divisão impossível divisor igual a zero");
                    }

                    double resultado = dividir(n1, n2);
                    l3.setText("Divisão: " + resultado);
                } catch (NumberFormatException erro){
                    l3.setText("Numero inválido");
                } catch (Exception erro){
                    l3.setText(erro.getMessage());
                }
            }
        });
    }

    public double dividir(double n1, double n2){
        return n1 / n2;
    }

    public void sair(){
        dispose();
    }

    public void mostrarJanela(){
        setVisible(true);
    }
}