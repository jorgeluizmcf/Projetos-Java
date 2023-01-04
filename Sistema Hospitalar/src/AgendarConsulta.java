import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendarConsulta extends JDialog {

    public Agenda listaCosultas = new Agenda(true);
    public AgendarConsulta(Frame owner, String title) {
        super(owner, title);
        FlowLayout flow = new FlowLayout();
        getContentPane().setLayout(flow);

        setBounds(100,100, 250,300);

        JLabel jCpf = new JLabel("CPF do paciente: ");
        JTextField txtCpf = new JTextField(20);
        JLabel jHora = new JLabel("Hora da consulta: ");
        JTextField txtHora = new JTextField(20);
        JLabel jDia = new JLabel("Dia: ");
        JTextField txtDia = new JTextField(20);
        JLabel jMes = new JLabel("Mes: ");
        JTextField txtMes = new JTextField(20);
        JLabel jAno = new JLabel("Ano: ");
        JTextField txtAno = new JTextField(20);


        JButton btnSalvar = new JButton("Salvar");
        JButton btnCancelar = new JButton("Cancelar");


        getContentPane().add(jCpf);
        getContentPane().add(txtCpf);
        getContentPane().add(jHora);
        getContentPane().add(txtHora);
        getContentPane().add(jDia);
        getContentPane().add(txtDia);
        getContentPane().add(jMes);
        getContentPane().add(txtMes);
        getContentPane().add(jAno);
        getContentPane().add(txtAno);
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
                Paciente paciente = listaCosultas.pesquisar(String.valueOf(txtCpf));
                int hora = Integer.parseInt(txtHora.getText());
                int dia = Integer.parseInt(txtDia.getText());
                int mes = Integer.parseInt(txtMes.getText());
                int ano = Integer.parseInt(txtAno.getText());

                Consulta novaConsulta = new Consulta(paciente, dia, mes, ano, hora);

                listaCosultas.adicionar(novaConsulta);

                txtDia.setText("");
                txtHora.setText("");
                txtAno.setText("");
                txtDia.setText("");
            }
        });

        setVisible(true);
    }
}
