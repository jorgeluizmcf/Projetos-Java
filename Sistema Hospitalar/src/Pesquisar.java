import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pesquisar extends JDialog {


    public Pesquisar(Frame owner, String title) {
        super(owner, title);

        FlowLayout flow = new FlowLayout();
        getContentPane().setLayout(flow);

        setBounds(100,100, 350,300);

        JLabel jcpf = new JLabel("CPF: ");
        JTextField txtNome = new JTextField(20);
        JButton btnPesquisar = new JButton("Pesquisar");
        btnPesquisar.setPreferredSize(new Dimension(250,40));
        JLabel jResult = new JLabel("Resultado Busca: ");

        getContentPane().add(jcpf);
        getContentPane().add(txtNome);
        getContentPane().add(btnPesquisar);
        getContentPane().add(jResult);

        btnPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = txtNome.getText();

                Menu janela = (Menu) owner;

                for (int i = 0; i < janela.listaPacientes.size(); i++){
                    if (janela.listaPacientes.get(i).getCpf().equals(cpf)){
                        jResult.setText(janela.listaPacientes.get(i).toString());
                        return;
                    }
                }
                jResult.setText("CPF não Encontrado");

            }
        });

        setVisible(true);








    }
}
