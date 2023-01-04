import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPaciente extends JDialog {

    public AddPaciente(Frame owner, String title) {
        super(owner, title);
        FlowLayout flow = new FlowLayout();
        getContentPane().setLayout(flow);

        setBounds(100,100, 250,300);

        JLabel jnome = new JLabel("Nome: ");
        JTextField txtNome = new JTextField(20);
        JLabel jsobrenome = new JLabel("Sobrenome: ");
        JTextField txtSobrenome = new JTextField(20);
        JLabel jCpf = new JLabel("CPF: ");
        JTextField txtCpf = new JTextField(20);
        JLabel jTelefone = new JLabel("Telefone: ");
        JTextField txtTelefone = new JTextField(20);

        JButton btnSalvar = new JButton("Salvar");
        JButton btnCancelar = new JButton("Cancelar");


        getContentPane().add(jnome);
        getContentPane().add(txtNome);
        getContentPane().add(jsobrenome);
        getContentPane().add(txtSobrenome);
        getContentPane().add(jCpf);
        getContentPane().add(txtCpf);
        getContentPane().add(jTelefone);
        getContentPane().add(txtTelefone);
        getContentPane().add(btnSalvar);
        getContentPane().add(btnCancelar);

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String sobreNome = txtSobrenome.getText();
                String cpf = txtCpf.getText();
                String telefone = txtTelefone.getText();

                Paciente objNovo = new Paciente(nome, sobreNome, cpf, telefone);

                Menu janelaPrincipal = (Menu) owner;
                janelaPrincipal.listaPacientes.add(objNovo);

                txtNome.setText("");
                txtSobrenome.setText("");
                txtTelefone.setText("");
                txtCpf.setText("");
            }
        });

        setVisible(true);
    }
}
