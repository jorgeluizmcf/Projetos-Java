import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ajuda extends JDialog {

    public Ajuda(Frame owner, String title) {
        super(owner, title);

        FlowLayout flow = new FlowLayout();
        getContentPane().setLayout(flow);

        setBounds(100,100, 250,250);

        JLabel jSobre = new JLabel("Projeto Final de AV3 - POO");
        jSobre.setPreferredSize(new Dimension(200,40));
        JLabel jMatricula = new JLabel("Jorge Luiz - 2127467");
        jMatricula.setPreferredSize(new Dimension(200,40));
        JButton btnFechar = new JButton("Sair");
        btnFechar.setPreferredSize(new Dimension(100,40));


        getContentPane().add(jSobre);
        getContentPane().add(jMatricula);
        getContentPane().add(btnFechar);


        btnFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }
}
