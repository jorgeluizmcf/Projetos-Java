import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaPrincipal extends JFrame {
    public JanelaPrincipal(String titulo) {
        super(titulo);
        setBounds(100,50, 250, 250); //defini posição e tamanho da janela
        FlowLayout flow = new FlowLayout(); //Define que os componentes adicionados a janela vão se ajustar horizontalmente
        getContentPane().setLayout(flow); // seta o layout a janela

        //cria 5 botoes de tamanho 100x30 e adiciona a janela
        Dimension tamanho = new Dimension(200,30);
        JButton b1 = new JButton("Somar");
        b1.setPreferredSize(tamanho);
        getContentPane().add(b1);
        JButton b2 = new JButton("Subtrair");
        b2.setPreferredSize(tamanho);
        getContentPane().add(b2);
        JButton b3 = new JButton("Multiplicar");
        b3.setPreferredSize(tamanho);
        getContentPane().add(b3);
        JButton b4 = new JButton("Dividir");
        b4.setPreferredSize(tamanho);
        getContentPane().add(b4);
        JButton b5 = new JButton("Sair");
        b5.setPreferredSize(tamanho);
        getContentPane().add(b5);

        //modifica a cor da janela para branco
        getContentPane().setBackground(Color.BLACK);


        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sair();
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaSomar janela01 = new JanelaSomar(JanelaPrincipal.this, "Somar");
                janela01.mostrarJanela();
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaSubtrair janela02 = new JanelaSubtrair(JanelaPrincipal.this, "Subtrair");
                janela02.mostrarJanela();
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaMultiplicar janela02 = new JanelaMultiplicar(JanelaPrincipal.this, "Multiplicar");
                janela02.mostrarJanela();
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaDividir janela02 = new JanelaDividir(JanelaPrincipal.this, "Dividir");
                janela02.mostrarJanela();
            }
        });

        //torna a janela visivel para o usuario
        setVisible(true);
    }

    public void Sair(){
        System.exit(0);
    }

}
